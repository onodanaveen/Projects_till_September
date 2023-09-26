package com.greens;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class RoughNote {
	public static void main(String[] args) {
		
		String Sentence = "of the people by the people for the people";
		
		String[] words = Sentence.split(" ");
		
		LinkedHashMap<String, Integer> Map = new LinkedHashMap<String, Integer>();
		
		for (String word : words) {
			
			if (Map.containsKey(word)) {
				
				Integer value = Map.get(word);
				
				Map.put(word, value+1);
			}else {
				Map.put(word, 1);
			}
			
			//System.out.println(Map);
			
		}
		System.out.println(Map);
		
		Set<Entry<String, Integer>> entrySet = Map.entrySet();
		
		for (Entry<String, Integer> entry : entrySet) {
			
			if (entry.getValue() > 1) {
				
				System.out.println(entry);
				
			}
			
		}
		
	}

}
