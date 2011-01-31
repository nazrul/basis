package gov.sonali_bank.web.controller;

import gov.sonali_bank.domain.SonaliBankRecord;
import gov.sonali_bank.ws.SonaliBankService;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * User: shahed
 * Date: Jan 26, 2011
 * Time: 10:12:27 AM
 */
public class WSTestController extends AbstractController {

    private SonaliBankService sonali_bankServiceClient;

    public void setSonali_bankServiceClient(SonaliBankService sonali_bankServiceClient) {
        this.sonali_bankServiceClient = sonali_bankServiceClient;
    }

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        String nid = ServletRequestUtils.getRequiredStringParameter(httpServletRequest, "nid");

        SonaliBankRecord rec = sonali_bankServiceClient.getSonaliBankRecordByNationalId(nid);

        PrintWriter out = httpServletResponse.getWriter();
        out.println("Owner Name: " + rec.getOwnerName());
        out.println("National ID: " + rec.getNationalID());
        out.println("Account No.: " + rec.getAccountNo());
        out.println("Account Type: " + rec.getAccountType());
        out.flush();
        return null;
    }
}
