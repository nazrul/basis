package gov.btcl.web.controller;

import gov.btcl.domain.BTCLRecord;
import gov.btcl.ws.BTCLService;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * User: shahed
 * Date: Jan 25, 2011
 * Time: 5:44:16 PM
 */
public class WSTestController extends AbstractController {

    private BTCLService btclServiceClient;

    public void setBtclServiceClient(BTCLService btclServiceClient) {
        this.btclServiceClient = btclServiceClient;
    }

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        String nid = ServletRequestUtils.getRequiredStringParameter(httpServletRequest, "nid");

        BTCLRecord rec = btclServiceClient.getBTCLRecordByNationalId(nid);

        PrintWriter out = httpServletResponse.getWriter();
        out.println("Owner Name: " + rec.getOwnerName());
        out.println("National ID: " + rec.getNationalID());
        out.println("Location of Reg.: " + rec.getLocationOfReg());
        out.println("Address: " + rec.getAddressOfConnection());
        out.println("Bank Account No.: " + rec.getBankAccountNo());
        out.println("Bank Routing No.: " + rec.getBankRoutingNo());
        out.println("Connection Type: " + rec.getConnectionType());
        out.println("Effective Start of Service: " + rec.getEffectiveStartOfService());
        out.println("Initial Deposit: " + rec.getInitialDeposit());
        out.flush();
        return null;
    }
}

