package com.tasks;

import java.util.HashMap;
import java.util.Map;

public class Hashmap_case_Insensitive extends HashMap<String, String> {
	
	@Override
	public String put(String key, String value) {	
		return super.put(key.toLowerCase(), value);
	}
	
	@Override
	public String get(Object key) {
		return super.get(key.toString().toLowerCase());
	}
	
	public static void main(String[] args) {
		
		Map<String, String> map = new Hashmap_case_Insensitive();
		
		map.put("abc", "one");
		map.put("Abc", "two");
		map.put("aBc", "three");
		
		System.out.println(map);
		
		int size = map.size();
		System.out.println(size);
		
		String string = map.get("ABC");
		System.out.println(string);
		
	}
	

}
