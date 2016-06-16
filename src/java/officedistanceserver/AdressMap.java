/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package officedistanceserver;

import java.util.HashMap;



/**
 *
 * @author heart
 */
public class AdressMap {
    private static final HashMap<String, String> ADRESSMAP = new HashMap<String, String>(){{
        put("HQ", "Paul-Wittsack-Straße+10,+68163+Mannheim");
        put("OB", "HTW+Berlin+-+Gebäude+C,+Wilhelminenhofstraße+75A,+12459+Berlin");
        put("OH","Haus+A,+Berliner+Tor+5,+20099+Hamburg");
        put("OM","Lothstraße+34,80335+München");
    }};
    
    public static String getAdress(String kuerzel){
        try{
            return ADRESSMAP.get(kuerzel);
        } catch(Exception e){
            System.err.print("Location not found");
        }
        return "";
    }
    
    public static boolean Contains(String kuerzel){
        return ADRESSMAP.containsKey(kuerzel);
    }
    
}

