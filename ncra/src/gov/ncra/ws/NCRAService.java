package gov.ncra.ws;

import gov.ncra.domain.NCRARecord;

import javax.jws.WebService;

/**
 * Created by IntelliJ IDEA.
 * User: nazrul
 * Date: Jan 21, 2011
 * Time: 12:13:48 PM
 * To change this template use File | Settings | File Templates.
 */
@WebService
public interface NCRAService {
    public NCRARecord getNCRARecordByNationalId(String nid);
}
