package com.suresh_progarms;

import java.util.LinkedHashMap;
import java.util.Map;

public class Repetition_Words {
	public static void main(String[] args) {
		String name = " gobi gobi gobi naveen mooku mooku";
		
		String[] words = name.split(" ");
		
		Map<String, Integer> map = new LinkedHashMap<String, Integer>(); 
		
		for (String word : words) {
			
			if (map.containsKey(word)) {
				
			}
			
		}
	}

}
