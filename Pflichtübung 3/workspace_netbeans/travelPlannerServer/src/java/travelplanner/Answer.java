package travelplanner;
/*
 * Answer.java
 * 
 * This file is part of the TravelPlanner program.
 * Written by
 *   Johannes Heiler
 *   Lucas Kneis
 *   Tobias Juenemann
 * 
 * Last updated: 16. June 2016
 */

public class Answer {
    private String distance;
    private String duration;
    
    public Answer(String distance, String duration) {
	this.distance = distance;
	this.duration = duration;
    }
    
    public String getDistance() {
	return this.distance;
    }
    
    public String getDuration() {
        return this.duration;
    }
}
