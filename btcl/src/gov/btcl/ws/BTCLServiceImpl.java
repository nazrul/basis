package gov.btcl.ws;


import gov.btcl.domain.BTCLRecord;
import gov.btcl.service.BTCLRecordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.Calendar;

/**
 * Created by IntelliJ IDEA.
 * User: nazrul
 * Date: Jan 21, 2011
 * Time: 12:13:18 PM
 * To change this template use File | Settings | File Templates.
 */
@WebService(endpointInterface = "gov.btcl.ws.BTCLService")
public class BTCLServiceImpl implements BTCLService {

    private static final Logger log = LoggerFactory.getLogger(BTCLServiceImpl.class);

    private BTCLRecordService btclRecordService;

    public void setBtclRecordService(BTCLRecordService btclRecordService) {
        this.btclRecordService = btclRecordService;
    }

    @WebMethod
    public BTCLRecord getBTCLRecordByNationalId(String nid) {
        btclRecordService.toString();

        //Dummy records
        BTCLRecord btclRecord = new BTCLRecord();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2010,10,23);

        btclRecord.setAddressOfConnection("Mirpur");
        btclRecord.setBankAccountNo("BA1231");
        btclRecord.setBankRoutingNo("BR2341");
        btclRecord.setConnectionType("Private");
        btclRecord.setEffectiveStartOfService(calendar.getTime());
        btclRecord.setInitialDeposit(2000.0);
        btclRecord.setLocationOfReg("Banani");
        btclRecord.setNationalID("4563");
        btclRecord.setOwnerName("Hasib");

        return btclRecord;

//        return new BTCLRecord();
    }

}
