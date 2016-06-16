/*
 * Google.java
 * 
 * This file is part of the GoogleApiTest2 Example.
 * Written by Tobias Juenemann
 * 
 * Last updated: 16. June 2016
 */

import com.google.gson.*;
import java.io.*;
import java.net.*;

public class Google {

	public static final String GOOGLEKEY = "";
	
	public Answer askGoogleMapsDistance(String shortOrigin, String shortDestination) {
		
		CityDirectory cities = CityDirectory.getInstance();
		
		String origin = cities.resolveShortName(shortOrigin);
		String destination = cities.resolveShortName(shortDestination);;
		
		String sURL = "https://maps.googleapis.com/maps/api/distancematrix/json" +
					  "?origins=" + origin +
					  "&destinations=" + destination +
					  "&mode=" + "driving" +
					  "&language=" + "de-DE" +
					  "&key=" + GOOGLEKEY;
		
		String distance = "";
		String duration = "";
		
		try {
			// Connect to the URL using java's native library
			URL url = new URL(sURL);
			HttpURLConnection request = (HttpURLConnection)url.openConnection();
			request.connect();
			
			// Convert to a JSON object
			JsonParser jp = new JsonParser(); //from GSON
			
			//Convert the input stream to a JSON element
			JsonElement root = jp.parse(new InputStreamReader((InputStream)request.getContent()));
			
			JsonObject obj = root.getAsJsonObject()
					.get("rows").getAsJsonArray().get(0).getAsJsonObject()
					.get("elements").getAsJsonArray().get(0).getAsJsonObject();
   
			JsonObject distanceObj = obj.get("distance").getAsJsonObject();
			distance = distanceObj.get("text").getAsString();
			
			JsonObject durationObj = obj.get("duration").getAsJsonObject();
			duration = durationObj.get("text").getAsString();
		}
		catch(Exception e) {
			System.err.println(e);
		}
		
		return new Answer(distance, duration);
	}
}