package gov.ec.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.3.1
 * Wed Jan 26 10:57:14 BDT 2011
 * Generated source version: 2.3.1
 * 
 */
 
@WebService(targetNamespace = "http://ws.ec.gov/", name = "NIDService")
@XmlSeeAlso({ObjectFactory.class})
public interface NIDService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getCitizenByNationalId", targetNamespace = "http://ws.ec.gov/", className = "gov.ec.ws.GetCitizenByNationalId")
    @WebMethod
    @ResponseWrapper(localName = "getCitizenByNationalIdResponse", targetNamespace = "http://ws.ec.gov/", className = "gov.ec.ws.GetCitizenByNationalIdResponse")
    public gov.ec.ws.Citizen getCitizenByNationalId(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}
