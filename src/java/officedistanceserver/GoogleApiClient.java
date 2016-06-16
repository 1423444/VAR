package officedistanceserver;

/*
 * Main.java
 * 
 * This file is part of the GoogleApiTest Example.
 * Written by Tobias Juenemann
 * 
 * Last updated: 16. June 2016
 */

import com.google.gson.*;
import java.io.*;
import java.net.*;

public class GoogleApiClient {

	public static final String GOOGLEKEY = "AIzaSyB3yClq91w0dANqfTR-gM4a2TMxVrZiVbk";
	
	public String [] sendRequest(String origin, String dest) {
            
		String sURL = "https://maps.googleapis.com/maps/api/distancematrix/json" +
					  "?origins=" + origin +
					  "&destinations=" + dest +
					  "&mode=" + "driving" +
					  "&language=" + "de-DE" +
					  "&key=" + GOOGLEKEY;
		
		/*
		 * Output Example:
		 * 
		 * {
		 *    "destination_addresses" : [ "Hamburg, Deutschland" ],
		 *    "origin_addresses" : [ "Mannheim, Deutschland" ],
		 *    "rows" : [
		 *       {
		 *          "elements" : [
		 *             {
		 *                "distance" : {
		 *                   "text" : "570 km",
		 *                   "value" : 570371
		 *                },
		 *                "duration" : {
		 *                   "text" : "5 Stunden, 20 Minuten",
		 *                   "value" : 19190
		 *                },
		 *                "status" : "OK"
		 *             }
		 *          ]
		 *       }
		 *    ],
		 *    "status" : "OK"
		 * }
		 * 
		 */
		
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
			String distance = distanceObj.get("text").getAsString();
			
			JsonObject durationObj = obj.get("duration").getAsJsonObject();
			String duration = durationObj.get("text").getAsString();
        		return new String[] {duration, distance};

		}
		catch(Exception e) {
			System.err.println(e);
		}
                return new String [] {};
        }
        
}