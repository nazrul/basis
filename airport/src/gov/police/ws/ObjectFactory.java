
package gov.police.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.police.ws package. 
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

    private final static QName _GetPoliceRecordByNationalIdResponse_QNAME = new QName("http://ws.police.gov/", "getPoliceRecordByNationalIdResponse");
    private final static QName _GetPoliceRecordByNationalId_QNAME = new QName("http://ws.police.gov/", "getPoliceRecordByNationalId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.police.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPoliceRecordByNationalId }
     * 
     */
    public GetPoliceRecordByNationalId createGetPoliceRecordByNationalId() {
        return new GetPoliceRecordByNationalId();
    }

    /**
     * Create an instance of {@link GetPoliceRecordByNationalIdResponse }
     * 
     */
    public GetPoliceRecordByNationalIdResponse createGetPoliceRecordByNationalIdResponse() {
        return new GetPoliceRecordByNationalIdResponse();
    }

    /**
     * Create an instance of {@link PoliceRecord }
     * 
     */
    public PoliceRecord createPoliceRecord() {
        return new PoliceRecord();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPoliceRecordByNationalIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.police.gov/", name = "getPoliceRecordByNationalIdResponse")
    public JAXBElement<GetPoliceRecordByNationalIdResponse> createGetPoliceRecordByNationalIdResponse(GetPoliceRecordByNationalIdResponse value) {
        return new JAXBElement<GetPoliceRecordByNationalIdResponse>(_GetPoliceRecordByNationalIdResponse_QNAME, GetPoliceRecordByNationalIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPoliceRecordByNationalId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.police.gov/", name = "getPoliceRecordByNationalId")
    public JAXBElement<GetPoliceRecordByNationalId> createGetPoliceRecordByNationalId(GetPoliceRecordByNationalId value) {
        return new JAXBElement<GetPoliceRecordByNationalId>(_GetPoliceRecordByNationalId_QNAME, GetPoliceRecordByNationalId.class, null, value);
    }

}
