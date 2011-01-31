
package gov.brta.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for brtaRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="brtaRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nationalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleChasisNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleEngineNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleRegNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "brtaRecord", propOrder = {
    "nationalID",
    "vehicleChasisNo",
    "vehicleEngineNo",
    "vehicleRegNo"
})
public class BrtaRecord {

    protected String nationalID;
    protected String vehicleChasisNo;
    protected String vehicleEngineNo;
    protected String vehicleRegNo;

    /**
     * Gets the value of the nationalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalID() {
        return nationalID;
    }

    /**
     * Sets the value of the nationalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalID(String value) {
        this.nationalID = value;
    }

    /**
     * Gets the value of the vehicleChasisNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleChasisNo() {
        return vehicleChasisNo;
    }

    /**
     * Sets the value of the vehicleChasisNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleChasisNo(String value) {
        this.vehicleChasisNo = value;
    }

    /**
     * Gets the value of the vehicleEngineNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleEngineNo() {
        return vehicleEngineNo;
    }

    /**
     * Sets the value of the vehicleEngineNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleEngineNo(String value) {
        this.vehicleEngineNo = value;
    }

    /**
     * Gets the value of the vehicleRegNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleRegNo() {
        return vehicleRegNo;
    }

    /**
     * Sets the value of the vehicleRegNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleRegNo(String value) {
        this.vehicleRegNo = value;
    }

}
