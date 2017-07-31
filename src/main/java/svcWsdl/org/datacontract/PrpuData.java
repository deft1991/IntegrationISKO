
package svcWsdl.org.datacontract;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrpuData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrpuData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MnemoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrpuData", propOrder = {
    "dateFrom",
    "dateTo",
    "mnemoCode",
    "region",
    "value"
})
public class PrpuData {

    @XmlElementRef(name = "DateFrom", namespace = "http://schemas.datacontract.org/2004/07/WcfService2", type = JAXBElement.class)
    protected JAXBElement<String> dateFrom;
    @XmlElementRef(name = "DateTo", namespace = "http://schemas.datacontract.org/2004/07/WcfService2", type = JAXBElement.class)
    protected JAXBElement<String> dateTo;
    @XmlElementRef(name = "MnemoCode", namespace = "http://schemas.datacontract.org/2004/07/WcfService2", type = JAXBElement.class)
    protected JAXBElement<String> mnemoCode;
    @XmlElement(name = "Region")
    protected Integer region;
    @XmlElement(name = "Value")
    protected Integer value;

    /**
     * Gets the value of the dateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDateFrom() {
        return dateFrom;
    }

    /**
     * Sets the value of the dateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDateFrom(JAXBElement<String> value) {
        this.dateFrom = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dateTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDateTo() {
        return dateTo;
    }

    /**
     * Sets the value of the dateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDateTo(JAXBElement<String> value) {
        this.dateTo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mnemoCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMnemoCode() {
        return mnemoCode;
    }

    /**
     * Sets the value of the mnemoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMnemoCode(JAXBElement<String> value) {
        this.mnemoCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRegion(Integer value) {
        this.region = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValue(Integer value) {
        this.value = value;
    }

}
