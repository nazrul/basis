package gov.sonali_bank.ws;


import gov.sonali_bank.domain.SonaliBankRecord;
import gov.sonali_bank.service.SonaliBankRecordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by IntelliJ IDEA.
 * User: nazrul
 * Date: Jan 21, 2011
 * Time: 12:13:18 PM
 * To change this template use File | Settings | File Templates.
 */
@WebService(endpointInterface = "gov.sonali_bank.ws.SonaliBankService")
public class SonaliBankServiceImpl implements SonaliBankService {

    private static final Logger log = LoggerFactory.getLogger(SonaliBankServiceImpl.class);

    private SonaliBankRecordService sonaliBankRecordService;

    public void setNbrRecordService(SonaliBankRecordService sonaliBankRecordService) {
        this.sonaliBankRecordService = sonaliBankRecordService;
    }

    @WebMethod
    public SonaliBankRecord getSonaliBankRecordByNationalId(String nid) {        

        //Dummy records
        SonaliBankRecord sonaliBankRecord = new SonaliBankRecord();

        sonaliBankRecord.setAccountNo("S2343");
        sonaliBankRecord.setAccountType("Current");
        sonaliBankRecord.setNationalID("2787");
        sonaliBankRecord.setOwnerName("Shohan");
        
        return sonaliBankRecord;
    }
}
