package gov.nbr.ws;


import gov.nbr.domain.NBRRecord;

import javax.jws.WebService;

/**
 * Created by IntelliJ IDEA.
 * User: nazrul
 * Date: Jan 21, 2011
 * Time: 12:13:48 PM
 * To change this template use File | Settings | File Templates.
 */
@WebService
public interface NBRService {
    public NBRRecord getNBRRecordByNationalId(String nid);
}
