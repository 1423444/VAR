/*
 * CityDirectory.java
 * 
 * This file is part of the GoogleApiTest2 Example.
 * Written by Tobias Juenemann
 * 
 * Last updated: 16. June 2016
 */

import java.util.HashMap;
import java.util.Map;

public class CityDirectory {
	
	private static CityDirectory instance;
	
	private Map<String, String> map;
	
	private CityDirectory() {
		this.map = new HashMap<>();
		
		this.map.put("HQ", "Mannheim"); // Hauptsitz
		this.map.put("OB", "Berlin");   // Filiale
		this.map.put("OH", "Hamburg");  // Filiale
		this.map.put("OM", "München");  // Filiale
	}
	
	public static CityDirectory getInstance() {
		if (CityDirectory.instance == null) {
			CityDirectory.instance = new CityDirectory ();
		}
		return CityDirectory.instance;
	}
	
	public String resolveShortName(String shortName) {
		return this.map.get(shortName);
	}
}
