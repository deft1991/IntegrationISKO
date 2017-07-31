
package singleWsdl.org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import singleWsdl.org.datacontract.ArrayOfPrpuData;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetDataFromPrpuResult" type="{http://schemas.datacontract.org/2004/07/WcfService2}ArrayOfPrpuData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getDataFromPrpuResult"
})
@XmlRootElement(name = "GetDataFromPrpuResponse")
public class GetDataFromPrpuResponse {

    @XmlElementRef(name = "GetDataFromPrpuResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPrpuData> getDataFromPrpuResult;

    /**
     * Gets the value of the getDataFromPrpuResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPrpuData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPrpuData> getGetDataFromPrpuResult() {
        return getDataFromPrpuResult;
    }

    /**
     * Sets the value of the getDataFromPrpuResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPrpuData }{@code >}
     *     
     */
    public void setGetDataFromPrpuResult(JAXBElement<ArrayOfPrpuData> value) {
        this.getDataFromPrpuResult = ((JAXBElement<ArrayOfPrpuData> ) value);
    }

}
