package gov.ncra.web.controller;

import gov.ncra.domain.NCRARecord;
import gov.ncra.ws.NCRAService;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * User: shahed
 * Date: Jan 26, 2011
 * Time: 9:58:06 AM
 */
public class WSTestController extends AbstractController {

    private NCRAService ncraServiceClient;

    public void setNcraServiceClient(NCRAService ncraServiceClient) {
        this.ncraServiceClient = ncraServiceClient;
    }

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        String nid = ServletRequestUtils.getRequiredStringParameter(httpServletRequest, "nid");

        NCRARecord rec = ncraServiceClient.getNCRARecordByNationalId(nid);

        PrintWriter out = httpServletResponse.getWriter();
        out.println("National ID: " + rec.getNationalID());
        out.println("Member Since: " + rec.getMemberSince());
        out.println("Credit Score: " + rec.getCreditScore());
        out.flush();
        return null;
    }
}
