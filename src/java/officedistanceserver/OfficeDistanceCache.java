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
public class OfficeDistanceCache {
    
    private static HashMap<String, String[]> cacheMap;
    
    public static boolean checkCache(String originAndDestination){
        return cacheMap.containsKey(originAndDestination);
    }
    
    public static String[] getFromCache (String originAndDestination){
        return cacheMap.get(originAndDestination);
    }
    
    public static void putOnCache(String originAndDestination, String[] adress){
        cacheMap.putIfAbsent(originAndDestination, adress);
    }
}
