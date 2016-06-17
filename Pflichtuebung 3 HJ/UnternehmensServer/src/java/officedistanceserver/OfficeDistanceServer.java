/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package officedistanceserver;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author heart
 */
@WebService(serviceName = "OfficeDistanceServer")
public class OfficeDistanceServer {


    @WebMethod(operationName = "getDistance")
    public String[] getDistance(@WebParam(name = "origin") String origin, @WebParam(name = "destination") String destination) {
        
        GoogleApiClient client = new GoogleApiClient();
        
        try{
            
            if((!AdressMap.Contains(origin)) || !(AdressMap.Contains(destination))){
                throw new Exception ("Illegal Location Value");
            }
            
            if(OfficeDistanceCache.checkCache(origin + destination)){
                System.out.println("Information gotten from Cache");
                return OfficeDistanceCache.getFromCache(origin + destination);
            } else {
                origin = AdressMap.getAdress(origin);
                destination = AdressMap.getAdress(destination);
                String [] res = client.sendRequest(origin, destination);
                OfficeDistanceCache.putOnCache(origin + destination, res);
                return res;
            }
            
        }catch(Exception e){
            return new String[] {e.getMessage(), "Office Distance Server"};
        }
        
    }
}
