package gov.nbr.web.controller;

import gov.nbr.domain.NBRRecord;
import gov.nbr.ws.NBRService;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * User: shahed
 * Date: Jan 26, 2011
 * Time: 9:44:47 AM
 */
public class WSTestController extends AbstractController {

    private NBRService nbrServiceClient;

    public void setNbrServiceClient(NBRService nbrServiceClient) {
        this.nbrServiceClient = nbrServiceClient;
    }

    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        String nid = ServletRequestUtils.getRequiredStringParameter(httpServletRequest, "nid");

        NBRRecord rec = nbrServiceClient.getNBRRecordByNationalId(nid);

        PrintWriter out = httpServletResponse.getWriter();
        out.println("TIN No.: " + rec.getTIN());
        out.println("National ID: " + rec.getNationalID());
        out.println("Last Tax Clearance Date: " + rec.getLastTaxClearanceDate());
        out.println("Tax Amount In Last Fiscal Year: " + rec.getTaxAmountInLastFiscalYr());         
        out.flush();
        return null;
    }
}
