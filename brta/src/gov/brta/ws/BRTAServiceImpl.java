package gov.brta.ws;

import gov.brta.domain.BRTARecord;
import gov.brta.service.BRTARecordService;
import gov.ec.ws.NIDService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by IntelliJ IDEA.
 * User: nazrul
 * Date: Jan 21, 2011
 * Time: 12:13:18 PM
 * To change this template use File | Settings | File Templates.
 */
@WebService(endpointInterface = "gov.brta.ws.BRTAService")
public class BRTAServiceImpl implements BRTAService{

    private static final Logger log = LoggerFactory.getLogger(BRTAServiceImpl.class);

    private BRTARecordService brtaRecordService;


    public void setBrtaRecordService(BRTARecordService brtaRecordService) {
        this.brtaRecordService = brtaRecordService;
    }
    
    @WebMethod
    public BRTARecord getBRTARecordByNationalId(String nid) {
       

        //Dummy records
        BRTARecord brtaRecord = new BRTARecord();
        
        brtaRecord.setNationalID("1234");
        brtaRecord.setVehicleChasisNo("VC3432");
        brtaRecord.setVehicleEngineNo("VE2758");
        brtaRecord.setVehicleRegNo("VR7456");
        
        return brtaRecord;

//        return new BRTARecord();
    }
}
