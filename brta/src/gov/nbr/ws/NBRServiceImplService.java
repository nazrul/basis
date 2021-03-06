
/*
 * 
 */

package gov.nbr.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.3.1
 * Wed Jan 26 10:52:16 BDT 2011
 * Generated source version: 2.3.1
 * 
 */


@WebServiceClient(name = "NBRServiceImplService", 
                  wsdlLocation = "file:wsdl/nbr.wsdl",
                  targetNamespace = "http://ws.nbr.gov/") 
public class NBRServiceImplService extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://ws.nbr.gov/", "NBRServiceImplService");
    public final static QName NBRServiceImplPort = new QName("http://ws.nbr.gov/", "NBRServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("file:wsdl/nbr.wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from file:wsdl/nbr.wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public NBRServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public NBRServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NBRServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     * 
     * @return
     *     returns NBRService
     */
    @WebEndpoint(name = "NBRServiceImplPort")
    public NBRService getNBRServiceImplPort() {
        return super.getPort(NBRServiceImplPort, NBRService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns NBRService
     */
    @WebEndpoint(name = "NBRServiceImplPort")
    public NBRService getNBRServiceImplPort(WebServiceFeature... features) {
        return super.getPort(NBRServiceImplPort, NBRService.class, features);
    }

}
