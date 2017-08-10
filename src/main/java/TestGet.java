import Utils.Util;
import beans.ISKO.DocumentAttribute;
import beans.ISKO.DocumentValue;
import beans.ISKO.FormColumn;
import beans.ISKO.FormDocument;
import beans.ISKO.FormLine;
import beans.ISKO.FormReportISKO;
import beans.ISKO.FormTable;
import dao.InputData;
import org.hibernate.QueryException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.hibernate.resource.transaction.spi.TransactionStatus;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import javax.persistence.NoResultException;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.math.BigInteger;
import java.net.URL;
import java.nio.charset.Charset;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

//import org.hibernate.query.Query;

public class TestGet {
    private static Session session;
    private static FormDocument fd;
    private static DocumentValue dv;
//    private static boolean isChangeAction = false;

    static {
        // создаем коннект к БД (сессию для хибера)
        System.out.println("Try create connection to BD");
        session = HibernateSessionFactory.getSessionFactory().openSession();
        System.out.println("Connection success");
    }

    public static void main(String[] args) {
        try {
            // не могу в мавене присоеденить чтение из файла config.properties
            FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
            Properties prop = new Properties();
            prop.load(fis);
            String request = prop.getProperty("URL");
            String formCode = prop.getProperty("formCode");
            String regionCode = prop.getProperty("regionCode");
            String date = prop.getProperty("date");
            List<String> listCodeFormISKO = new ArrayList<>();
            if (formCode != null) {
                listCodeFormISKO.add(formCode);
            } else {
                // получаем все коды формы если код не пришел
                listCodeFormISKO = getCodeFormISKO(session);
            }
            for (String codeFormISKO : listCodeFormISKO) {
                String urlParameters = "?" + "formCode=" + codeFormISKO;
                if (regionCode != null) {
                    urlParameters += "&regionCode=" + regionCode;
                }
                if (date != null) {
                    urlParameters += "&dateTo=" + date;
                }

                // получение JSONArray по URl
                JSONArray jsonArray = readJsonFromUrl(request + urlParameters);
                // создаем лист объектов для сохранения в БД
                List<InputData> inputDataList = createListDto(jsonArray);

                // todo далее этот лист нужно распарсить на данные по бинам
                for (InputData inputData : inputDataList) {
                    // получаем форму ИСКО по входным данным
                    Query queryFormReportISKO = session.createQuery("from FormReportISKO where formCode = :formCode");
                    queryFormReportISKO.setParameter("formCode", inputData.getFormCode());
                    FormReportISKO formReportISKO = (FormReportISKO) queryFormReportISKO.getSingleResult();
                    // ищем записи в таблице FormDocument, если есть и дата измен больше чем в БД то апдэйтим,
                    // если записи нет то создаем
                    List<?> listFormDocuments = getListOfFormDocuments(inputData, formReportISKO);
                    if (!listFormDocuments.isEmpty()) {
                        updateFormDocumentObj(inputData, formReportISKO, listFormDocuments);
                    } else {
                        createFormDocumentObj(inputData, formReportISKO);
                    }
                    //если нет записи в справочнике то идем к следуещему входному объекту
                    Query queryFormTable = session.createQuery("from FormTable where code = :code");
                    queryFormTable.setParameter("code", inputData.getTableCode());
                    FormTable formTable = null;
                    if (!queryFormTable.getResultList().isEmpty()) {
                        formTable = (FormTable) queryFormTable.getSingleResult();
                    } else {
                        continue;
                    }

                    Query queryCodeLine = session.createQuery("from FormLine where code = :code");
                    queryCodeLine.setParameter("code", inputData.getLineCode());
                    FormLine formLine = null;
                    if (!queryCodeLine.getResultList().isEmpty()) {
                        formLine = (FormLine) queryCodeLine.getSingleResult();
                    } else {
                        continue;
                    }

                    Query queryFormColumn = session.createQuery("from FormColumn where code = :code");
                    queryFormColumn.setParameter("code", inputData.getColumnCode());
                    FormColumn formColumn = null;
                    if (!queryFormColumn.getResultList().isEmpty()) {
                        formColumn = (FormColumn) queryFormColumn.getSingleResult();
                    } else {
                        continue;
                    }
                    DocumentAttribute documentAttributeFromBd = getDocumentAttribute(formReportISKO, formTable, formLine, formColumn);
                    FormDocument formDocument = getFormDocument(inputData, formReportISKO);
                    createOrUpdateDocumetValueObj(inputData, documentAttributeFromBd, formDocument);
                }
                System.out.println("Session close");
                System.exit(0);
            }
        } catch (QueryException | NoResultException | IOException e) {
            if (dv != null)
                session.delete(dv);
            if (fd != null)
                session.delete(fd);
            e.printStackTrace();
        }
    }

    private static List<?> getListOfFormDocuments(InputData inputData, FormReportISKO formReportISKO) {
        Query queryFindSameFormDocument = session.createQuery("" +
                "from FormDocument " +
                "where formReportISKO.id = :formReportIskoId " +
                "and region = :region " +
                "and startDate = :startDate " +
                "and endDate = :endDate " +
                "and identifiRecordDocIsko = :identifiRecordDocIsko");
        queryFindSameFormDocument.setParameter("formReportIskoId", formReportISKO.getId());
        queryFindSameFormDocument.setParameter("region", inputData.getRgnCode());
        queryFindSameFormDocument.setParameter("startDate", inputData.getDateFrom());
        queryFindSameFormDocument.setParameter("endDate", inputData.getDateTo());
        queryFindSameFormDocument.setParameter("identifiRecordDocIsko", inputData.getIdDocIsko());
        return (List<?>) queryFindSameFormDocument.getResultList();
    }

    private static DocumentAttribute getDocumentAttribute(FormReportISKO formReportISKO, FormTable formTable, FormLine formLine, FormColumn formColumn) {
        Query queryDocumentAttribute = session.createQuery("" +
                "from DocumentAttribute " +
                "where formTable.code = :formTableCode " +
                "and formLine.code = :formLineCode " +
                "and formColumn.code = :formColumnCode " +
                "and formReportISKO.id = :formReportIskoId");
        queryDocumentAttribute.setParameter("formTableCode", formTable.getCode());
        queryDocumentAttribute.setParameter("formLineCode", formLine.getCode());
        queryDocumentAttribute.setParameter("formColumnCode", formColumn.getCode());
        queryDocumentAttribute.setParameter("formReportIskoId", formReportISKO.getId());
        return (DocumentAttribute) queryDocumentAttribute.getSingleResult();
    }

    private static FormDocument getFormDocument(InputData inputData, FormReportISKO formReportISKO) {
        Query querySelFormDoc = session.createQuery("" +
                "from FormDocument " +
                "where formReportISKO.id = :formReportISKOId " +
                "and changeDate = :changeDate " +
                "and startDate = :startDate " +
                "and endDate = :endDate " +
                "and region = :region " +
                "and identifiRecordDocIsko = :identifiRecordDocIsko");
        querySelFormDoc.setParameter("formReportISKOId", formReportISKO.getId());
        querySelFormDoc.setParameter("changeDate", fd.getChangeDate());
        querySelFormDoc.setParameter("startDate", fd.getStartDate());
        querySelFormDoc.setParameter("endDate", fd.getEndDate());
        querySelFormDoc.setParameter("region", fd.getRegion());
        querySelFormDoc.setParameter("identifiRecordDocIsko", inputData.getIdDocIsko());
        return (FormDocument) querySelFormDoc.getSingleResult();
    }

    private static void createOrUpdateDocumetValueObj(InputData inputData, DocumentAttribute documentAttributeFromBd, FormDocument formDocument) {
        dv = new DocumentValue();
        dv.setVersion(new BigInteger("0"));
        dv.setDocumentAttribute(documentAttributeFromBd);
        dv.setFormDocument(formDocument);
        if (!inputData.getValue().toString().equals("")) {
            try {
                Date d = Util.parseStringToDateByFormat(inputData.getValue().toString(), "yyyy-MM-dd");
                dv.setValueDate(new Timestamp(d.getTime()));
            } catch (ParseException e) {
                // просто переходим к следующему элементу
            }
            try {
                Double d = Double.parseDouble(inputData.getValue().toString());
                dv.setValueNumber(d);

            } catch (NumberFormatException e) {
                // если не парсится и на число значит это строка
                dv.setValueLine(inputData.getValue().toString());
            }
        }

        Query queryFindValue = session.createQuery("" +
                "from DocumentValue " +
                "where documentAttribute = :documentAttribute " +
                "and formDocument = :formDocument");
        queryFindValue.setParameter("documentAttribute", documentAttributeFromBd);
        queryFindValue.setParameter("formDocument", formDocument);
        session.beginTransaction();
        if (queryFindValue.getResultList().isEmpty()) {
            session.save(dv);
        } else {
            DocumentValue documentValue = (DocumentValue) queryFindValue.getSingleResult();
            documentValue.setDocumentAttribute(dv.getDocumentAttribute());
            documentValue.setFormDocument(dv.getFormDocument());
            documentValue.setValueLine(dv.getValueLine());
            documentValue.setValueNumber(dv.getValueNumber());
            documentValue.setValueDate(dv.getValueDate());
            documentValue.setVersion(dv.getVersion());
            session.update(documentValue);
        }
        if (session.getTransaction().getStatus().equals(TransactionStatus.ACTIVE)) {
            session.flush();
            session.getTransaction().commit();
        }
    }

    private static void createFormDocumentObj(InputData inputData, FormReportISKO formReportISKO) {
        fd = new FormDocument();
        fd.setVersion(new BigInteger("0"));
        fd.setFormReportISKO(formReportISKO);
        fd.setRegion(inputData.getRgnCode());
        fd.setStartDate(inputData.getDateFrom());
        fd.setEndDate(inputData.getDateTo());
        fd.setChangeDate(inputData.getDateChange());
        fd.setIdentifiRecordDocIsko(inputData.getIdDocIsko());

        session.beginTransaction();
        session.save(fd);
        if (session.getTransaction().getStatus().equals(TransactionStatus.ACTIVE)) {
            session.flush();
            session.getTransaction().commit();
        }
    }

    private static void updateFormDocumentObj(InputData inputData, FormReportISKO formReportISKO, List<?> listFormDocuments) {
        for (Object o : listFormDocuments) {
            fd = (FormDocument) o;
            if (inputData.getDateChange().after(fd.getChangeDate())) {
                fd.setVersion(new BigInteger("0"));
                fd.setFormReportISKO(formReportISKO);
                fd.setRegion(inputData.getRgnCode());
                fd.setStartDate(inputData.getDateFrom());
                fd.setEndDate(inputData.getDateTo());
                fd.setChangeDate(inputData.getDateChange());
                fd.setIdentifiRecordDocIsko(inputData.getIdDocIsko());
                session.beginTransaction();
                session.update(fd);
                if (session.getTransaction().getStatus().equals(TransactionStatus.ACTIVE)) {
                    session.flush();
                    session.getTransaction().commit();
                }
            }
        }
    }

    // todo нужно сделать селект объекта который сетили и удалить из БД

    private static void deleteFormTableFromBD() {
        session.beginTransaction();
        session.delete(fd);
        if (session.getTransaction().getStatus().equals(TransactionStatus.ACTIVE)) {
            session.getTransaction().commit();
        }
    }

    private static List<String> getCodeFormISKO(Session session) {
        // открываем транзакцию
        List<String> listCodeFromISKO = new ArrayList<>();
        Query query = session.createQuery("select formCode from FormReportISKO");
        List<?> list = query.list();
        for (Object o : list) {
            listCodeFromISKO.add(o.toString());
        }
        return listCodeFromISKO;
    }

    private static List<InputData> createListDto(JSONArray jsonArray) {
        ArrayList<JSONObject> listJSObject = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            listJSObject.add((JSONObject) jsonArray.get(i));
        }

        List<InputData> listInpData = new ArrayList<>();
        for (JSONObject o : listJSObject) {
            try {
                InputData inputData = new InputData();
                String dateFrom = o.get("DateFrom").toString();
                String dateTo = o.get("DateTo").toString();
                String dateChange = o.get("DateChange").toString();

                Date startDate = Util.parseStringToDateByFormat(dateFrom, "yyyy-MM-dd");
                Date endDate = Util.parseStringToDateByFormat(dateTo, "yyyy-MM-dd");
                Date changeDate = Util.parseStringToDateByFormat(dateChange, "yyyy-MM-dd HH:mm:ss");

                inputData.setFormCode(o.getString("FormCode"));

                inputData.setDateFrom(startDate);
                inputData.setDateTo(endDate);
                inputData.setDateChange(changeDate);

                inputData.setColumnCode(o.getString("ColumnCode"));
                inputData.setLineCode(o.getString("RowCode"));
                inputData.setTableCode(o.getString("TableCode"));
                inputData.setIdDocIsko(o.get("ID_Document").equals("") ? null : o.getInt("ID_Document"));

                inputData.setValue(o.getString("Value"));
                inputData.setRgnCode(o.get("RegionCode").equals("") ? null : o.getInt("RegionCode"));
                listInpData.add(inputData);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        //test update table
//        InputData inputData = new InputData();
//        inputData.setFormCode("1T");
//        inputData.setDateFrom(new Date());
//        inputData.setDateTo(new Date());
//        inputData.setDateChange(new Date(2018, 10, 23));
//        inputData.setIdDocIsko(2);
//        inputData.setTableCode("1");
//        inputData.setLineCode("87");
//        inputData.setColumnCode("1");
//        inputData.setValue(1);
//        listInpData.add(inputData);


        System.out.println("listInpData create");
        return listInpData;
    }

    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    private static JSONArray readJsonFromUrl(String url) throws IOException, JSONException {
        try (InputStream is = new URL(url).openStream()) {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            return new JSONArray(jsonText);
        }
    }
}
