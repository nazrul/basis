package gov.nbr.service;

import gov.brta.ws.BRTAService;
import gov.ec.ws.NIDService;
import gov.nbr.ws.NBRService;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by IntelliJ IDEA.
 * User: nazrul
 * Date: Jan 20, 2011
 * Time: 5:13:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class NBRRecordServiceImpl implements NBRRecordService {

    
    private NIDService nIDServiceClient;

    private BRTAService brtaServiceClient;

    public void setnIDServiceClient(NIDService nIDServiceClient) {
        this.nIDServiceClient = nIDServiceClient;
    }

    public void setBrtaServiceClient(BRTAService brtaServiceClient) {
        this.brtaServiceClient = brtaServiceClient;
    }
}
