package gov.boi.ws;


import gov.boi.domain.BOIRecord;
import gov.boi.service.BOIRecordService;
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
@WebService(endpointInterface = "gov.boi.ws.BOIService")
public class BOIServiceImpl implements BOIService {

    private static final Logger log = LoggerFactory.getLogger(BOIServiceImpl.class);

    private BOIRecordService boiRecordService;

    public void setBoiRecordService(BOIRecordService boiRecordService) {
        this.boiRecordService = boiRecordService;
    }

    @WebMethod
    public BOIRecord getNBRRecordByNationalId(String nid) {

        //Dummy records
        BOIRecord boiRecord = new BOIRecord();
        Calendar initOperation = Calendar.getInstance();
        initOperation.set(2010, 6, 23);
        Calendar licenseIssuanceDate = Calendar.getInstance();
        licenseIssuanceDate.set(2010, 8, 13);
        Calendar licenseExpirationDate = Calendar.getInstance();
        licenseExpirationDate.set(2015, 8, 13);


        boiRecord.setAreaOfOperation("Plastic");
        boiRecord.setCompanyName("Hasan Industry");
        boiRecord.setInitialCapital(1000000000);
        boiRecord.setInitialStartOfOperation(initOperation.getTime());
        boiRecord.setLicenseIssuanceDate(licenseIssuanceDate.getTime());
        boiRecord.setLicenseExpirationDate(licenseExpirationDate.getTime());
        boiRecord.setNationalID("2347");
        boiRecord.setOwnerName("Hasan");
        boiRecord.setTaxHolidayApplicable(true);
        boiRecord.setTypeOfBusiness("Private");

        return boiRecord;
    }

}
