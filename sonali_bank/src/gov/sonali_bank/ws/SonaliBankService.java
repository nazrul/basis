package gov.sonali_bank.ws;


import gov.sonali_bank.domain.SonaliBankRecord;

import javax.jws.WebService;

/**
 * Created by IntelliJ IDEA.
 * User: nazrul
 * Date: Jan 21, 2011
 * Time: 12:13:48 PM
 * To change this template use File | Settings | File Templates.
 */
@WebService
public interface SonaliBankService {
    public SonaliBankRecord getSonaliBankRecordByNationalId(String nid);
}
