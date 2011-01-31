package gov.airport.ws;


import gov.airport.domain.DepartureRecord;
import gov.airport.service.DepartureRecordService;
import org.hibernate.search.annotations.DateBridge;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.Calendar;

/**
 * Created by IntelliJ IDEA.
 * User: nazrul
 * Date: Jan 21, 2011
 * Time: 12:13:18 PM
 * To change this template use File | Settings | File Templates.
 */
@WebService(endpointInterface = "gov.airport.ws.AirportService")
public class AirportServiceImpl implements AirportService {

    private static final Logger log = LoggerFactory.getLogger(AirportServiceImpl.class);

    private DepartureRecordService departureRecordService;

    public void setDepartureRecordService(DepartureRecordService departureRecordService) {
        this.departureRecordService = departureRecordService;
    }

    @WebMethod
    public DepartureRecord getDepartureRecordByNationalId(String nid) {

        //Dummy records
        DepartureRecord departureRecord = new DepartureRecord();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2011, 3, 23);

        departureRecord.setDepartureTime(calendar.getTime());
        departureRecord.setFinalDestination("Kabul");
        departureRecord.setNationalID("1234");
        departureRecord.setNationality("Bangladeshi");
        departureRecord.setPassportNo("P2341");

        return departureRecord;

//       return new DepartureRecord();
    }
}
