package gov.police.ws;

import gov.ec.ws.NIDService;
import gov.police.domain.PoliceRecord;
import gov.police.service.PoliceRecordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by IntelliJ IDEA.
 * User: nazrul
 * Date: Jan 20, 2011
 * Time: 4:19:09 PM
 * To change this template use File | Settings | File Templates.
 */
@WebService(endpointInterface = "gov.police.ws.PoliceService")
public class PoliceServiceImpl implements PoliceService {

    private static final Logger log = LoggerFactory.getLogger(PoliceServiceImpl.class);

    private PoliceRecordService policeRecordService;


    public void setPoliceRecordService(PoliceRecordService policeRecordService) {
        this.policeRecordService = policeRecordService;
    }

    @WebMethod
    public PoliceRecord getPoliceRecordByNationalId(String nid) {
        return policeRecordService.getPoliceRecordByNID(nid);
    }

}
