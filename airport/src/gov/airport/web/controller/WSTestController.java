package gov.airport.web.controller;

import gov.airport.domain.DepartureRecord;
import gov.airport.ws.AirportService;
import gov.ec.ws.Citizen;
import gov.ec.ws.NIDService;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * User: shahed
 * Date: Jan 25, 2011
 * Time: 2:17:27 PM
 */
public class WSTestController extends AbstractController {

    private AirportService airportServiceClient;

    public void setAirportServiceClient(AirportService airportServiceClient) {
        this.airportServiceClient = airportServiceClient;
    }

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        String nid = ServletRequestUtils.getRequiredStringParameter(httpServletRequest, "nid");

        DepartureRecord rec = airportServiceClient.getDepartureRecordByNationalId(nid);

        PrintWriter out = httpServletResponse.getWriter();
        out.println("National ID: " + rec.getNationalID());
        out.println("Nationality: " + rec.getNationality());
        out.println("DepartureTime: " + rec.getDepartureTime());
        out.println("Passport No.: " + rec.getPassportNo());
        out.println("Final Destination: " + rec.getFinalDestination());
        out.flush();
        return null;
    }
}
