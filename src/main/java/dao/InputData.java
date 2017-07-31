package dao;

import java.util.Date;

public class InputData {
    private String formCode;
    private int rgnCode;
    private Date dateFrom;
    private Date dateTo;
    private Date dateChange;
    private int idDocIsko;
    private String tableCode;
    private String lineCode;
    private String columnCode;
    private Object value;

    public String getFormCode() {
        return formCode;
    }

    public void setFormCode(String formCode) {
        this.formCode = formCode;
    }

    public int getRgnCode() {
        return rgnCode;
    }

    public void setRgnCode(int rgnCode) {
        this.rgnCode = rgnCode;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public Date getDateChange() {
        return dateChange;
    }

    public void setDateChange(Date dateChange) {
        this.dateChange = dateChange;
    }

    public int getIdDocIsko() {
        return idDocIsko;
    }

    public void setIdDocIsko(int idDocIsko) {
        this.idDocIsko = idDocIsko;
    }

    public String getTableCode() {
        return tableCode;
    }

    public void setTableCode(String tableCode) {
        this.tableCode = tableCode;
    }

    public String getLineCode() {
        return lineCode;
    }

    public void setLineCode(String lineCode) {
        this.lineCode = lineCode;
    }

    public String getColumnCode() {
        return columnCode;
    }

    public void setColumnCode(String columnCode) {
        this.columnCode = columnCode;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
