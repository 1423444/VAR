/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unternehmensclient;

import java.util.List;
import javax.xml.ws.WebServiceRef;
import officedistanceserver.*;

/**
 *
 * @author heart
 */
public class UnternehmensClient {
    
    @WebServiceRef(wsdlLocation = "META-INF/wsdl/localhost_8080/UnternehmensServer/OfficeDistanceServer.wsdl")
    private static OfficeDistanceServer_Service service;

    public static java.util.List<java.lang.String> getDistance(java.lang.String origin, java.lang.String destination) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        officedistanceserver.OfficeDistanceServer port = service.getOfficeDistanceServerPort();
        return port.getDistance(origin, destination);
    }
    
}
