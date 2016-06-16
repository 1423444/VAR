/*
 * AnswerCache.java
 * 
 * This file is part of the GoogleApiTest2 Example.
 * Written by Tobias Juenemann
 * 
 * Last updated: 16. June 2016
 */

import java.util.HashMap;
import java.util.Map;

public class AnswerCache {
	
	private static AnswerCache instance;
	
	private Map<String, Answer> map;
	
	private AnswerCache() {
		this.map = new HashMap<>();
	}
	
	public static AnswerCache getInstance() {
		if (AnswerCache.instance == null) {
			AnswerCache.instance = new AnswerCache();
		}
		return AnswerCache.instance;
	}
	
	public void createNewEntry(String route, Answer answer) {
		this.map.put(route, answer);
	}
	
	public boolean isAnswerInCache(String hashRoute) {
		return this.map.containsKey(hashRoute);
	}
	
	public Answer getAnswer(String hashRoute) {
		return this.map.get(hashRoute);
	}
}
