
package gov.brta.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.brta.ws package. 
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

    private final static QName _GetBRTARecordByNationalId_QNAME = new QName("http://ws.brta.gov/", "getBRTARecordByNationalId");
    private final static QName _GetBRTARecordByNationalIdResponse_QNAME = new QName("http://ws.brta.gov/", "getBRTARecordByNationalIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.brta.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBRTARecordByNationalIdResponse }
     * 
     */
    public GetBRTARecordByNationalIdResponse createGetBRTARecordByNationalIdResponse() {
        return new GetBRTARecordByNationalIdResponse();
    }

    /**
     * Create an instance of {@link GetBRTARecordByNationalId }
     * 
     */
    public GetBRTARecordByNationalId createGetBRTARecordByNationalId() {
        return new GetBRTARecordByNationalId();
    }

    /**
     * Create an instance of {@link BrtaRecord }
     * 
     */
    public BrtaRecord createBrtaRecord() {
        return new BrtaRecord();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBRTARecordByNationalId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.brta.gov/", name = "getBRTARecordByNationalId")
    public JAXBElement<GetBRTARecordByNationalId> createGetBRTARecordByNationalId(GetBRTARecordByNationalId value) {
        return new JAXBElement<GetBRTARecordByNationalId>(_GetBRTARecordByNationalId_QNAME, GetBRTARecordByNationalId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBRTARecordByNationalIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.brta.gov/", name = "getBRTARecordByNationalIdResponse")
    public JAXBElement<GetBRTARecordByNationalIdResponse> createGetBRTARecordByNationalIdResponse(GetBRTARecordByNationalIdResponse value) {
        return new JAXBElement<GetBRTARecordByNationalIdResponse>(_GetBRTARecordByNationalIdResponse_QNAME, GetBRTARecordByNationalIdResponse.class, null, value);
    }

}
