package gov.airport.ws;

import gov.airport.domain.DepartureRecord;

import javax.jws.WebService;

/**
 * Created by IntelliJ IDEA.
 * User: nazrul
 * Date: Jan 21, 2011
 * Time: 12:13:48 PM
 * To change this template use File | Settings | File Templates.
 */
@WebService
public interface AirportService {
    public DepartureRecord getDepartureRecordByNationalId(String nid);
}
