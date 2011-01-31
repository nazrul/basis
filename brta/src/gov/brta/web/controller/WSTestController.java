package gov.brta.web.controller;

import gov.brta.domain.BRTARecord;
import gov.brta.ws.BRTAService;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * User: shahed
 * Date: Jan 25, 2011
 * Time: 5:34:32 PM
 */
public class WSTestController extends AbstractController {

    BRTAService brtaServiceClient;

    public void setBrtaServiceClient(BRTAService brtaServiceClient) {
        this.brtaServiceClient = brtaServiceClient;
    }

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        String nid = ServletRequestUtils.getRequiredStringParameter(httpServletRequest, "nid");

        BRTARecord rec = brtaServiceClient.getBRTARecordByNationalId(nid);

        PrintWriter out = httpServletResponse.getWriter();

        out.println("National ID: " + rec.getNationalID());
        out.println("Chasis No.: " + rec.getVehicleChasisNo());
        out.println("Engine No.: " + rec.getVehicleEngineNo());
        out.println("Reg. No.: " + rec.getVehicleRegNo());
        out.flush();
        return null;
    }
}
