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
public class CallbackHelloGoodbyeClient {

    @WebServiceRef(wsdlLocation = "META-INF/wsdl/localhost_8080/HelloGoodbyeServer/HelloGoodbye.wsdl")
    private static HelloGoodbye_Service service;
    public static void main(String[] args){
        
        try { // Call Web Service Operation(async. callback)
            hellogoodbyeclient.HelloGoodbye_Service service = new hellogoodbyeclient.HelloGoodbye_Service();
            hellogoodbyeclient.HelloGoodbye port = service.getHelloGoodbyePort();
            // TODO initialize WS operation arguments here
            java.lang.String name = "Everest";
            javax.xml.ws.AsyncHandler<hellogoodbyeclient.SlowSayHelloResponse> asyncHandler = new javax.xml.ws.AsyncHandler<hellogoodbyeclient.SlowSayHelloResponse>() {
                public void handleResponse(javax.xml.ws.Response<hellogoodbyeclient.SlowSayHelloResponse> response) {
                    try {
                        // Callback-Methode in anonymer Klasse
                        System.out.println("Result = "+ response.get());
                    } catch(Exception ex) {
                        // TODO handle exception
                    }
                }
            };
            java.util.concurrent.Future<? extends java.lang.Object> result = port.slowSayHelloAsync(name, asyncHandler);
           //asynchroner Aufruf
            while(!result.isDone()) {
                // do something
                Thread.sleep(100);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

    }
    
}
