/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellogoodbyeclient;

import javax.xml.ws.WebServiceRef;

/**
 *
 * @author heart
 */
public class HelloGoodbyeClient {

    @WebServiceRef(wsdlLocation = "META-INF/wsdl/localhost_8080/HelloGoodbyeServer/HelloGoodbye.wsdl")
    private static HelloGoodbye_Service service;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            String result = sayHello("Paganella");
            System.out.println("Result = " + result);
        } catch (Exception ex){
        System.err.println("Exception: " + ex.getMessage());                
    }
    }

    private static String sayHello(java.lang.String name) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        hellogoodbyeclient.HelloGoodbye port = service.getHelloGoodbyePort();
        return port.sayHello(name);
    }
}
