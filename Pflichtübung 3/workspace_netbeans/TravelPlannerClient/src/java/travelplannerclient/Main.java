package travelplannerclient;
/*
 * Main.java
 * 
 * This file is part of the TravelPlanner program.
 * Written by
 *   Johannes Heiler
 *   Lucas Kneis
 *   Tobias Juenemann
 * 
 * Last updated: 16. June 2016
 */

import javax.xml.ws.WebServiceRef;
import java.util.Scanner;

public class Main {

    @WebServiceRef(wsdlLocation = "META-INF/wsdl/localhost_8080/travelPlannerServer/travelPlanner.wsdl")
    private static TravelPlanner_Service service;

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Willkommen bei Ihrem persönlichen Reiseplanertool.");
        System.out.println("Folgende Orte sind verfügbar:");
        System.out.println("HQ = Mannheim");
        System.out.println("OB = Berlin");
        System.out.println("OH = Hamburg");
        System.out.println("OM = München");
        
        while(true) {
            System.out.println("");
            System.out.print("Abfahrtsort: ");
            String shortOrigin = scanner.next();
            System.out.print("Zielort: ");
            String shortDestination = scanner.next();
            
            System.out.println("");
            
            try {
                String result = calculateTravel(shortOrigin, shortDestination);
                System.out.println(result);
            }
            catch(Exception e) {
                System.err.println(e);
            }
        }
    }

    private static String calculateTravel(java.lang.String shortOrigin, java.lang.String shortDestination) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        travelplannerclient.TravelPlanner port = service.getTravelPlannerPort();
        return port.calculateTravel(shortOrigin, shortDestination);
    }
}
