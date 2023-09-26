package com.logicfirst;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repetition_with_Map {
	
	public static void main(String[] args) {
		
		String s = "of the people by the people for the people";	//Immutable
		
		String[] words = s.split(" ");
		
//		for (String splitted : words) {
			
//			System.out.println("The splitted words are "+ splitted);
//		}
		
		Map<String, Integer> map = new LinkedHashMap<String,Integer>();	//upcasting
		
		for(String word : words) {
			
			if(map.containsKey(word)) {
				
				Integer value = map.get(word);
				
				map.put(word, value +1);
			}
			else {
				
				map.put(word, 1);
			}	
		}
		System.out.println(map);
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();	//to iterate the Map we use entryset
		
		for (Entry<String, Integer> entry : entrySet) {
			
			if (entry.getValue() > 1) {
				System.out.println(entry);
			}
		}
	}

}
