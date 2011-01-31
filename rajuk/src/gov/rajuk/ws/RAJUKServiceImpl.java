package gov.rajuk.ws;


import gov.rajuk.domain.RAJUKRecord;
import gov.rajuk.service.RAJUKRecordService;
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
@WebService(endpointInterface = "gov.rajuk.ws.RAJUKService")
public class RAJUKServiceImpl implements RAJUKService {

    private static final Logger log = LoggerFactory.getLogger(RAJUKServiceImpl.class);

    private RAJUKRecordService rajukRecordService;

    public void setRajukRecordService(RAJUKRecordService rajukRecordService) {
        this.rajukRecordService = rajukRecordService;
    }

    @WebMethod
    public RAJUKRecord getNBRRecordByNationalId(String nid) {

        //Dummy records
        RAJUKRecord rajukRecord = new RAJUKRecord();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2010,10,23);

        rajukRecord.setAssetLocation("Uttara");
        rajukRecord.setDateOfPurchase(calendar.getTime());
        rajukRecord.setNationalID("2347");
        rajukRecord.setPreviousOwnerName("Oronno");
        rajukRecord.setPreviousOwnerNID("2342");
        rajukRecord.setPrice(56545.0);

        return rajukRecord;
        
//        return new RAJUKRecord();
    }

}
