
package gov.nbr.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for nbrRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nbrRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lastTaxClearanceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="nationalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxAmountInLastFiscalYr" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nbrRecord", propOrder = {
    "lastTaxClearanceDate",
    "nationalID",
    "tin",
    "taxAmountInLastFiscalYr"
})
public class NbrRecord {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastTaxClearanceDate;
    protected String nationalID;
    @XmlElement(name = "TIN")
    protected String tin;
    protected double taxAmountInLastFiscalYr;

    /**
     * Gets the value of the lastTaxClearanceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastTaxClearanceDate() {
        return lastTaxClearanceDate;
    }

    /**
     * Sets the value of the lastTaxClearanceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastTaxClearanceDate(XMLGregorianCalendar value) {
        this.lastTaxClearanceDate = value;
    }

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
     * Gets the value of the tin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIN() {
        return tin;
    }

    /**
     * Sets the value of the tin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIN(String value) {
        this.tin = value;
    }

    /**
     * Gets the value of the taxAmountInLastFiscalYr property.
     * 
     */
    public double getTaxAmountInLastFiscalYr() {
        return taxAmountInLastFiscalYr;
    }

    /**
     * Sets the value of the taxAmountInLastFiscalYr property.
     * 
     */
    public void setTaxAmountInLastFiscalYr(double value) {
        this.taxAmountInLastFiscalYr = value;
    }

}
