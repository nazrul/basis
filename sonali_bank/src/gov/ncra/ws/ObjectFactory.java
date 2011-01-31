
package gov.ncra.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.ncra.ws package. 
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

    private final static QName _GetNCRARecordByNationalIdResponse_QNAME = new QName("http://ws.ncra.gov/", "getNCRARecordByNationalIdResponse");
    private final static QName _GetNCRARecordByNationalId_QNAME = new QName("http://ws.ncra.gov/", "getNCRARecordByNationalId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.ncra.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetNCRARecordByNationalIdResponse }
     * 
     */
    public GetNCRARecordByNationalIdResponse createGetNCRARecordByNationalIdResponse() {
        return new GetNCRARecordByNationalIdResponse();
    }

    /**
     * Create an instance of {@link GetNCRARecordByNationalId }
     * 
     */
    public GetNCRARecordByNationalId createGetNCRARecordByNationalId() {
        return new GetNCRARecordByNationalId();
    }

    /**
     * Create an instance of {@link NcraRecord }
     * 
     */
    public NcraRecord createNcraRecord() {
        return new NcraRecord();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNCRARecordByNationalIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ncra.gov/", name = "getNCRARecordByNationalIdResponse")
    public JAXBElement<GetNCRARecordByNationalIdResponse> createGetNCRARecordByNationalIdResponse(GetNCRARecordByNationalIdResponse value) {
        return new JAXBElement<GetNCRARecordByNationalIdResponse>(_GetNCRARecordByNationalIdResponse_QNAME, GetNCRARecordByNationalIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNCRARecordByNationalId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ncra.gov/", name = "getNCRARecordByNationalId")
    public JAXBElement<GetNCRARecordByNationalId> createGetNCRARecordByNationalId(GetNCRARecordByNationalId value) {
        return new JAXBElement<GetNCRARecordByNationalId>(_GetNCRARecordByNationalId_QNAME, GetNCRARecordByNationalId.class, null, value);
    }

}
