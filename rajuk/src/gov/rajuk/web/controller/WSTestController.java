package gov.rajuk.web.controller;

import gov.rajuk.domain.RAJUKRecord;
import gov.rajuk.ws.RAJUKService;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * User: shahed
 * Date: Jan 26, 2011
 * Time: 10:04:35 AM
 */
public class WSTestController extends AbstractController {

    private RAJUKService rajukServiceClient;

    public void setRajukServiceClient(RAJUKService rajukServiceClient) {
        this.rajukServiceClient = rajukServiceClient;
    }

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        String nid = ServletRequestUtils.getRequiredStringParameter(httpServletRequest, "nid");

        RAJUKRecord rec = rajukServiceClient.getNBRRecordByNationalId(nid);
        PrintWriter out = httpServletResponse.getWriter();
        out.println("National ID: " + rec.getNationalID());
        out.println("Assert Location: " + rec.getAssetLocation());
        out.println("Previous Owner Name: " + rec.getPreviousOwnerName());
        out.println("Previous Owner ID: " + rec.getPreviousOwnerNID());
        out.println("Date Of Purchase: " + rec.getDateOfPurchase());
        out.println("Price: " + rec.getPrice());
        out.flush();
        return null;
    }
}