package gov.sonali_bank.service;

import gov.ec.ws.NIDService;
import gov.ncra.ws.NCRAService;


/**
 * Created by IntelliJ IDEA.
 * User: nazrul
 * Date: Jan 20, 2011
 * Time: 5:13:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class SonaliBankRecordServiceImpl implements SonaliBankRecordService {

    
    private NIDService nIDServiceClient;

    private NCRAService ncraServiceClient;

    public void setnIDServiceClient(NIDService nIDServiceClient) {
        this.nIDServiceClient = nIDServiceClient;
    }

    public void setNcraServiceClient(NCRAService ncraServiceClient) {
        this.ncraServiceClient = ncraServiceClient;
    }
}
