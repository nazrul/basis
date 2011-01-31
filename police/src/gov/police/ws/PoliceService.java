package gov.police.ws;

import gov.police.domain.PoliceRecord;

import javax.jws.WebService;

/**
 * Created by IntelliJ IDEA.
 * User: nazrul
 * Date: Jan 20, 2011
 * Time: 4:10:59 PM
 * To change this template use File | Settings | File Templates.
 */
@WebService
public interface PoliceService {
    public PoliceRecord getPoliceRecordByNationalId(String nid);
}
