package gov.nbr.ws;


import gov.nbr.domain.NBRRecord;
import gov.nbr.service.NBRRecordService;
import gov.nbr.service.NBRRecordServiceImpl;
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
@WebService(endpointInterface = "gov.nbr.ws.NBRService")
public class NBRServiceImpl implements NBRService {

    private static final Logger log = LoggerFactory.getLogger(NBRServiceImpl.class);

    private NBRRecordService nbrRecordService;

    public void setNbrRecordService(NBRRecordService nbrRecordService) {
        this.nbrRecordService = nbrRecordService;
    }

    @WebMethod
    public NBRRecord getNBRRecordByNationalId(String nid) {
       

        //Dummy records
        NBRRecord nbrRecord = new NBRRecord();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2010,1,3);

        nbrRecord.setLastTaxClearanceDate(calendar.getTime());
        nbrRecord.setNationalID("6786");
        nbrRecord.setTaxAmountInLastFiscalYr(6786.0);
        nbrRecord.setTIN("T2232");
                                     
        return nbrRecord;

//        return new NBRRecord();
    }

}
