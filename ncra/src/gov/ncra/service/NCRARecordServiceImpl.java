package gov.ncra.service;

import gov.ec.ws.NIDService;
import gov.ncra.dao.NCRARecordDao;
import gov.police.ws.PoliceService;

/**
 * Created by IntelliJ IDEA.
 * User: nazrul
 * Date: Jan 20, 2011
 * Time: 5:13:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class NCRARecordServiceImpl implements NCRARecordService {

    private NIDService nIDServiceClient;
    private PoliceService policeServiceClient;
    private NCRARecordDao ncraRecord;

    public void setNcraRecord(NCRARecordDao ncraRecord) {
        this.ncraRecord = ncraRecord;    }

    public void setnIDServiceClient(NIDService nIDServiceClient) {
        this.nIDServiceClient = nIDServiceClient;
    }

    public void setPoliceServiceClient(PoliceService policeServiceClient) {
        this.policeServiceClient = policeServiceClient;
    }
}
