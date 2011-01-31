package gov.nbr.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.3.1
 * Wed Jan 26 11:00:48 BDT 2011
 * Generated source version: 2.3.1
 * 
 */
 
@WebService(targetNamespace = "http://ws.nbr.gov/", name = "NBRService")
@XmlSeeAlso({ObjectFactory.class})
public interface NBRService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getNBRRecordByNationalId", targetNamespace = "http://ws.nbr.gov/", className = "gov.nbr.ws.GetNBRRecordByNationalId")
    @WebMethod
    @ResponseWrapper(localName = "getNBRRecordByNationalIdResponse", targetNamespace = "http://ws.nbr.gov/", className = "gov.nbr.ws.GetNBRRecordByNationalIdResponse")
    public gov.nbr.ws.NbrRecord getNBRRecordByNationalId(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}
