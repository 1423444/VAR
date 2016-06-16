/*
 * Main.java
 * 
 * This file is part of the GoogleApiTest2 Example.
 * Written by Tobias Juenemann
 * 
 * Last updated: 16. June 2016
 */

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		AnswerCache cache = AnswerCache.getInstance();
		
		while(true) {
			System.out.print("Abfahrtsort: ");
			String shortOrigin = scanner.next();
			System.out.print("Zielort: ");
			String shortDestination = scanner.next();
			
			String hashRoute = shortOrigin + shortDestination;
			
			System.out.println();
			
			Answer answer;
			if(cache.isAnswerInCache(hashRoute)) {
				System.out.print("Cache-");
				answer = cache.getAnswer(hashRoute);
			} else {
				Google google = new Google();
				answer = google.askGoogleMapsDistance(shortOrigin, shortDestination);
				cache.createNewEntry(hashRoute, answer);
			}
			
			System.out.println("Antwort");
			System.out.println("----------------------");
			System.out.println("Entfernung: " + answer.getDistance());
			System.out.println("Fahrtdauer: " + answer.getDuration());
			System.out.println("\n");
		}
	}
}