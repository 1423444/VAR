
package travelplannerclient;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "travelPlanner", targetNamespace = "http://travelplanner/", wsdlLocation = "http://localhost:8080/travelPlannerServer/travelPlanner?wsdl")
public class TravelPlanner_Service
    extends Service
{

    private final static URL TRAVELPLANNER_WSDL_LOCATION;
    private final static WebServiceException TRAVELPLANNER_EXCEPTION;
    private final static QName TRAVELPLANNER_QNAME = new QName("http://travelplanner/", "travelPlanner");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/travelPlannerServer/travelPlanner?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TRAVELPLANNER_WSDL_LOCATION = url;
        TRAVELPLANNER_EXCEPTION = e;
    }

    public TravelPlanner_Service() {
        super(__getWsdlLocation(), TRAVELPLANNER_QNAME);
    }

    public TravelPlanner_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), TRAVELPLANNER_QNAME, features);
    }

    public TravelPlanner_Service(URL wsdlLocation) {
        super(wsdlLocation, TRAVELPLANNER_QNAME);
    }

    public TravelPlanner_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TRAVELPLANNER_QNAME, features);
    }

    public TravelPlanner_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TravelPlanner_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TravelPlanner
     */
    @WebEndpoint(name = "travelPlannerPort")
    public TravelPlanner getTravelPlannerPort() {
        return super.getPort(new QName("http://travelplanner/", "travelPlannerPort"), TravelPlanner.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TravelPlanner
     */
    @WebEndpoint(name = "travelPlannerPort")
    public TravelPlanner getTravelPlannerPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://travelplanner/", "travelPlannerPort"), TravelPlanner.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TRAVELPLANNER_EXCEPTION!= null) {
            throw TRAVELPLANNER_EXCEPTION;
        }
        return TRAVELPLANNER_WSDL_LOCATION;
    }

}
