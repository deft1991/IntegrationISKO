
package svcWsdl.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import svcWsdl.org.datacontract.ArrayOfPrpuData;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetDataFromPrpuDateFrom_QNAME = new QName("http://tempuri.org/", "DateFrom");
    private final static QName _GetDataFromPrpuDateTo_QNAME = new QName("http://tempuri.org/", "DateTo");
    private final static QName _GetDataFromPrpuMnemoCode_QNAME = new QName("http://tempuri.org/", "MnemoCode");
    private final static QName _GetDataFromPrpuResponseGetDataFromPrpuResult_QNAME = new QName("http://tempuri.org/", "GetDataFromPrpuResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDataFromPrpu }
     * 
     */
    public GetDataFromPrpu createGetDataFromPrpu() {
        return new GetDataFromPrpu();
    }

    /**
     * Create an instance of {@link GetDataFromPrpuResponse }
     * 
     */
    public GetDataFromPrpuResponse createGetDataFromPrpuResponse() {
        return new GetDataFromPrpuResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DateFrom", scope = GetDataFromPrpu.class)
    public JAXBElement<String> createGetDataFromPrpuDateFrom(String value) {
        return new JAXBElement<String>(_GetDataFromPrpuDateFrom_QNAME, String.class, GetDataFromPrpu.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DateTo", scope = GetDataFromPrpu.class)
    public JAXBElement<String> createGetDataFromPrpuDateTo(String value) {
        return new JAXBElement<String>(_GetDataFromPrpuDateTo_QNAME, String.class, GetDataFromPrpu.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "MnemoCode", scope = GetDataFromPrpu.class)
    public JAXBElement<String> createGetDataFromPrpuMnemoCode(String value) {
        return new JAXBElement<String>(_GetDataFromPrpuMnemoCode_QNAME, String.class, GetDataFromPrpu.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPrpuData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetDataFromPrpuResult", scope = GetDataFromPrpuResponse.class)
    public JAXBElement<ArrayOfPrpuData> createGetDataFromPrpuResponseGetDataFromPrpuResult(ArrayOfPrpuData value) {
        return new JAXBElement<ArrayOfPrpuData>(_GetDataFromPrpuResponseGetDataFromPrpuResult_QNAME, ArrayOfPrpuData.class, GetDataFromPrpuResponse.class, value);
    }

}
