
/*
 * 
 */

package gov.ec.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.3.1
 * Wed Jan 26 10:57:14 BDT 2011
 * Generated source version: 2.3.1
 * 
 */


@WebServiceClient(name = "NIDServiceImplService", 
                  wsdlLocation = "file:wsdl/ec.wsdl",
                  targetNamespace = "http://ws.ec.gov/") 
public class NIDServiceImplService extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://ws.ec.gov/", "NIDServiceImplService");
    public final static QName NIDServiceImplPort = new QName("http://ws.ec.gov/", "NIDServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("file:wsdl/ec.wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from file:wsdl/ec.wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public NIDServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public NIDServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NIDServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     * 
     * @return
     *     returns NIDService
     */
    @WebEndpoint(name = "NIDServiceImplPort")
    public NIDService getNIDServiceImplPort() {
        return super.getPort(NIDServiceImplPort, NIDService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns NIDService
     */
    @WebEndpoint(name = "NIDServiceImplPort")
    public NIDService getNIDServiceImplPort(WebServiceFeature... features) {
        return super.getPort(NIDServiceImplPort, NIDService.class, features);
    }

}