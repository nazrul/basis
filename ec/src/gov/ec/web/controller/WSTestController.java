package gov.ec.web.controller;

import gov.ec.domain.Citizen;
import gov.ec.ws.NIDService;
import org.springframework.beans.factory.annotation.Autowired;
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

    private NIDService nIDServiceClient;

    public void setnIDServiceClient(NIDService nIDServiceClient) {
        this.nIDServiceClient = nIDServiceClient;
    }

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        String nid = ServletRequestUtils.getRequiredStringParameter(httpServletRequest, "nid");
        Citizen c = nIDServiceClient.getCitizenByNationalId(nid);
//        Citizen c = nIDServiceClient.getCitizenByNationalId("1234");

        PrintWriter out = httpServletResponse.getWriter();
        out.println("Name: " + c.getName());
        out.println("National ID: " + c.getNationalId());
        out.println("Gender: " + c.getGender());
        out.println("Date of Birth: " + c.getDateOfBirth());
        out.println("Address: " + c.getAddress());
        out.println("City: " + c.getCity());
        out.flush();
        return null;
    }
}
