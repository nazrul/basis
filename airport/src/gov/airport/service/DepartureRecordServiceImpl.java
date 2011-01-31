package gov.airport.service;

import gov.ec.ws.NIDService;
import gov.police.ws.PoliceService;

/**
 * Created by IntelliJ IDEA.
 * User: nazrul
 * Date: Jan 20, 2011
 * Time: 5:13:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class DepartureRecordServiceImpl implements DepartureRecordService {

    private NIDService nIDServiceClient;
    private PoliceService policeServiceClient;

    public void setnIDServiceClient(NIDService nIDServiceClient) {
        this.nIDServiceClient = nIDServiceClient;
    }

    public void setPoliceServiceClient(PoliceService policeServiceClient) {
        this.policeServiceClient = policeServiceClient;
    }
}
