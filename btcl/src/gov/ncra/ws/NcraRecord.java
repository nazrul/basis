
package gov.ncra.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ncraRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ncraRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creditScore" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="memberSince" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="nationalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ncraRecord", propOrder = {
    "creditScore",
    "memberSince",
    "nationalID"
})
public class NcraRecord {

    protected int creditScore;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar memberSince;
    protected String nationalID;

    /**
     * Gets the value of the creditScore property.
     * 
     */
    public int getCreditScore() {
        return creditScore;
    }

    /**
     * Sets the value of the creditScore property.
     * 
     */
    public void setCreditScore(int value) {
        this.creditScore = value;
    }

    /**
     * Gets the value of the memberSince property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMemberSince() {
        return memberSince;
    }

    /**
     * Sets the value of the memberSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMemberSince(XMLGregorianCalendar value) {
        this.memberSince = value;
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

}
