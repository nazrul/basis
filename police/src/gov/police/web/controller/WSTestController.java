package gov.police.web.controller;

import gov.ec.ws.NIDService;
import gov.ec.ws.Citizen;

import gov.police.domain.PoliceRecord;
import gov.police.ws.PoliceService;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Created by IntelliJ IDEA.
 * User: nazrul
 * Date: Jan 17, 2011
 * Time: 3:42:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class WSTestController extends AbstractController {

    PoliceService policeServiceClient;

    public void setPoliceServiceClient(PoliceService policeServiceClient) {
        this.policeServiceClient = policeServiceClient;
    }

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        String nid = ServletRequestUtils.getRequiredStringParameter(httpServletRequest, "nid");

        //Debug
//        PrintWriter out = httpServletResponse.getWriter();
//        out.println("got here!");

        PoliceRecord rec = policeServiceClient.getPoliceRecordByNationalId(nid);

        PrintWriter out = httpServletResponse.getWriter();
        out.println("Name: " + rec.getName());
        out.println("Police ID: " + rec.getId());
        out.println("National ID: " + rec.getNationalId());
        out.println("Gender: " + rec.getGender());
        out.println("Date of Birth: " + rec.getDateOfBirth());
        out.println("Address: " + rec.getAddress());
        out.println("Criminal: " + rec.isCriminal());
        out.flush();
        return null;
    }
}
