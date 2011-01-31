package gov.ncra.ws;


import gov.ncra.domain.NCRARecord;
import gov.ncra.service.NCRARecordService;
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
@WebService(endpointInterface = "gov.ncra.ws.NCRAService")
public class NCRAServiceImpl implements NCRAService {

    private static final Logger log = LoggerFactory.getLogger(NCRAServiceImpl.class);

    private NCRARecordService ncraRecordService;


    public void setNcraRecordService(NCRARecordService ncraRecordService) {
        this.ncraRecordService = ncraRecordService;
    }

    @WebMethod
    public NCRARecord getNCRARecordByNationalId(String nid) {
        ncraRecordService.toString();

        //Dummy records
        NCRARecord ncraRecord = new NCRARecord();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2010, 9, 23);

        ncraRecord.setCreditScore(600);
        ncraRecord.setMemberSince(calendar.getTime());
        ncraRecord.setNationalID("4353");

        return ncraRecord;

//        return new NCRARecord();
    }
}
