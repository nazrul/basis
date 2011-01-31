
package gov.ec.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.ec.ws package. 
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

    private final static QName _GetCitizenByNationalIdResponse_QNAME = new QName("http://ws.ec.gov/", "getCitizenByNationalIdResponse");
    private final static QName _GetCitizenByNationalId_QNAME = new QName("http://ws.ec.gov/", "getCitizenByNationalId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.ec.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCitizenByNationalIdResponse }
     * 
     */
    public GetCitizenByNationalIdResponse createGetCitizenByNationalIdResponse() {
        return new GetCitizenByNationalIdResponse();
    }

    /**
     * Create an instance of {@link GetCitizenByNationalId }
     * 
     */
    public GetCitizenByNationalId createGetCitizenByNationalId() {
        return new GetCitizenByNationalId();
    }

    /**
     * Create an instance of {@link Citizen }
     * 
     */
    public Citizen createCitizen() {
        return new Citizen();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCitizenByNationalIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ec.gov/", name = "getCitizenByNationalIdResponse")
    public JAXBElement<GetCitizenByNationalIdResponse> createGetCitizenByNationalIdResponse(GetCitizenByNationalIdResponse value) {
        return new JAXBElement<GetCitizenByNationalIdResponse>(_GetCitizenByNationalIdResponse_QNAME, GetCitizenByNationalIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCitizenByNationalId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ec.gov/", name = "getCitizenByNationalId")
    public JAXBElement<GetCitizenByNationalId> createGetCitizenByNationalId(GetCitizenByNationalId value) {
        return new JAXBElement<GetCitizenByNationalId>(_GetCitizenByNationalId_QNAME, GetCitizenByNationalId.class, null, value);
    }

}
