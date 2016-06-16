package travelplanner;
/*
 * travelPlanner.java
 * 
 * This file is part of the TravelPlanner program.
 * Written by
 *   Johannes Heiler
 *   Lucas Kneis
 *   Tobias Juenemann
 * 
 * Last updated: 16. June 2016
 */

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "travelPlanner")
public class travelPlanner {

    AnswerCache cache = AnswerCache.getInstance();
    
    @WebMethod(operationName = "calculateTravel")
    public String calculateTravel(@WebParam(name = "shortOrigin") String shortOrigin, @WebParam(name = "shortDestination") String shortDestination) {
        String hashRoute = shortOrigin + shortDestination;
	
        String answerString = "";		
        Answer answer;
        if(cache.isAnswerInCache(hashRoute)) {
            answerString += "Cache-";
            answer = cache.getAnswer(hashRoute);
        } else {
            Google google = new Google();
            answer = google.askGoogleMapsDistance(shortOrigin, shortDestination);
            cache.createNewEntry(hashRoute, answer);
        }
			
	answerString += "Antwort\n";
	answerString += "----------------------\n";
	answerString += "Entfernung: " + answer.getDistance() + "\n";
	answerString += "Fahrtdauer: " + answer.getDuration() + "\n";
        
        return answerString;
    }
}
