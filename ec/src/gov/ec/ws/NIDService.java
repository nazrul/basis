package gov.ec.ws;

import gov.ec.domain.Citizen;

import javax.jws.WebService;



/**
 * Created by IntelliJ IDEA.
 * User: nazrul
 * Date: Jan 17, 2011
 * Time: 3:21:49 PM
 * To change this template use File | Settings | File Templates.
 */
@WebService
public interface NIDService {
     public Citizen getCitizenByNationalId(String nid);
}
