package gov.boi.web.controller;

import gov.boi.domain.BOIRecord;
import gov.boi.ws.BOIService;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * User: shahed
 * Date: Jan 25, 2011
 * Time: 5:01:24 PM
 */
public class WSTestController extends AbstractController {

    BOIService boiServiceClient;

    public void setBoiServiceClient(BOIService boiServiceClient) {
        this.boiServiceClient = boiServiceClient;
    }

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        String nid = ServletRequestUtils.getRequiredStringParameter(httpServletRequest, "nid");

        BOIRecord rec = boiServiceClient.getNBRRecordByNationalId(nid);

        PrintWriter out = httpServletResponse.getWriter();

        out.println("Owner Name: " + rec.getOwnerName());
        out.println("Company Name: " + rec.getCompanyName());
        out.println("National ID: " + rec.getNationalID());
        out.println("Area: " + rec.getAreaOfOperation());
        out.println("Type of Business: " + rec.getTypeOfBusiness());
        out.println("Initial Capital: " + rec.getInitialCapital());
        out.println("Initial Start of Operation: " + rec.getInitialStartOfOperation());
        out.println("License Issuance Date: " + rec.getLicenseIssuanceDate());
        out.println("License Expiration Date: " + rec.getLicenseExpirationDate());
        out.flush();
        return null;
    }
}
