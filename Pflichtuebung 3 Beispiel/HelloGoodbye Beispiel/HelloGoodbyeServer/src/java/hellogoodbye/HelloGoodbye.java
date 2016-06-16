/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellogoodbye;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author 1423444
 */
@WebService(serviceName = "HelloGoodbye")
public class HelloGoodbye {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "sayHello")
    public String sayHello(@WebParam(name="name")String name) {
        return "Hallo " + name;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "sayGoodbye")
    public String sayGoodbye(@WebParam(name="name")String name) {
        return "Goodbye " + name;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "slowSayHello")
    public String slowSayHello(@WebParam(name="name") String name) {
        try {
            Thread.sleep( (int) (Math.random()*10000)); //sleep up to 10 sec
        }
        catch(Exception ex){
            System.err.println(ex.getMessage());
        }
        return "Hallo " + name + ", are you still there?";
    }
}
