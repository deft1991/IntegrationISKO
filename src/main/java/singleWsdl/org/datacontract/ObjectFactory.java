
package singleWsdl.org.datacontract;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.wcfservice2 package. 
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

    private final static QName _ArrayOfPrpuData_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfService2", "ArrayOfPrpuData");
    private final static QName _PrpuData_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfService2", "PrpuData");
    private final static QName _PrpuDataDateTo_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfService2", "DateTo");
    private final static QName _PrpuDataDateFrom_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfService2", "DateFrom");
    private final static QName _PrpuDataMnemoCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfService2", "MnemoCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.wcfservice2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfPrpuData }
     * 
     */
    public ArrayOfPrpuData createArrayOfPrpuData() {
        return new ArrayOfPrpuData();
    }

    /**
     * Create an instance of {@link PrpuData }
     * 
     */
    public PrpuData createPrpuData() {
        return new PrpuData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPrpuData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfService2", name = "ArrayOfPrpuData")
    public JAXBElement<ArrayOfPrpuData> createArrayOfPrpuData(ArrayOfPrpuData value) {
        return new JAXBElement<ArrayOfPrpuData>(_ArrayOfPrpuData_QNAME, ArrayOfPrpuData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrpuData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfService2", name = "PrpuData")
    public JAXBElement<PrpuData> createPrpuData(PrpuData value) {
        return new JAXBElement<PrpuData>(_PrpuData_QNAME, PrpuData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfService2", name = "DateTo", scope = PrpuData.class)
    public JAXBElement<String> createPrpuDataDateTo(String value) {
        return new JAXBElement<String>(_PrpuDataDateTo_QNAME, String.class, PrpuData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfService2", name = "DateFrom", scope = PrpuData.class)
    public JAXBElement<String> createPrpuDataDateFrom(String value) {
        return new JAXBElement<String>(_PrpuDataDateFrom_QNAME, String.class, PrpuData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfService2", name = "MnemoCode", scope = PrpuData.class)
    public JAXBElement<String> createPrpuDataMnemoCode(String value) {
        return new JAXBElement<String>(_PrpuDataMnemoCode_QNAME, String.class, PrpuData.class, value);
    }

}
