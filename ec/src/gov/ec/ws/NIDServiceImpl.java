package gov.ec.ws;

import gov.ec.domain.Citizen;
import gov.ec.service.CitizenService;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by IntelliJ IDEA.
 * User: nazrul
 * Date: Jan 17, 2011
 * Time: 3:22:49 PM
 * To change this template use File | Settings | File Templates.
 */


@WebService(endpointInterface = "gov.ec.ws.NIDService")
public class NIDServiceImpl implements NIDService {

    private static final Logger log = LoggerFactory.getLogger(NIDServiceImpl.class);

    private CitizenService citizenService;


    public void setCitizenService(CitizenService citizenService) {
        this.citizenService = citizenService;
    }

    @WebMethod
    public Citizen getCitizenByNationalId(String nid) {
        return citizenService.getCitizenByNationalId(nid);
    }

}