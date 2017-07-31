
package singleWsdl.org.datacontract;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPrpuData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPrpuData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrpuData" type="{http://schemas.datacontract.org/2004/07/WcfService2}PrpuData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPrpuData", propOrder = {
    "prpuData"
})
public class ArrayOfPrpuData {

    @XmlElement(name = "PrpuData", nillable = true)
    protected List<PrpuData> prpuData;

    /**
     * Gets the value of the prpuData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prpuData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrpuData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrpuData }
     * 
     * 
     */
    public List<PrpuData> getPrpuData() {
        if (prpuData == null) {
            prpuData = new ArrayList<PrpuData>();
        }
        return this.prpuData;
    }

}
