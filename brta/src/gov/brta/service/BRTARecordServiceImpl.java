package gov.brta.service;

import gov.ec.ws.NIDService;
import gov.nbr.ws.NBRService;


/**
 * Created by IntelliJ IDEA.
 * User: nazrul
 * Date: Jan 20, 2011
 * Time: 5:13:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class BRTARecordServiceImpl implements BRTARecordService{

    private NIDService nIDServiceClient;
    private NBRService nbrServiceClient;

    public void setnIDServiceClient(NIDService nIDServiceClient) {
        this.nIDServiceClient = nIDServiceClient;
    }

    public void setNbrServiceClient(NBRService nbrServiceClient) {
        this.nbrServiceClient = nbrServiceClient;
    }
}
