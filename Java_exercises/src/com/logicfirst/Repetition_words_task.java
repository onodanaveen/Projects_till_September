package com.logicfirst;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repetition_words_task {
	public static void main(String[] args){
		String s = "java selenium jenkins java maven java selenium";

		String[] words = s.split(" ");

		Map<String,Integer> map = new LinkedHashMap<String,Integer>();

		for(String word : words){
			if(map.containsKey(word)){
				Integer value = map.get(word);
					
				map.put(word,value+1);
			}

			else{
				map.put(word,1);
			}
		}
		System.out.println(map);

		Set<Entry<String,Integer>> entryset = map.entrySet();

		for(Entry<String,Integer> entry : entryset){
		
			if(entry.getValue() >1){
				System.out.println(entry);
			}
		}
	}

}
