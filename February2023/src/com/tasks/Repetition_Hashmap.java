package com.tasks;

import java.util.HashMap;

public class Repetition_Hashmap {
	public static void main(String[] args) {
		String s = "Reeenaa";  // Rena
		String s1 = "ReEenAaA";//RenA
		String temp = "";
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		char[] name = s.toCharArray();
		
//		for (int i = 0; i < name.length; i++) {
//			if (map.containsKey(name[i])) {
//				Integer value = map.get(name[i]);
//				map.put(name[i], value+1);
//				
//			}else {
//				map.put(name[i], 1);
//				temp = temp + name[i];
//			}
//			
//		}	
		for (char c : name) {
			if (map.containsKey(c)) {
				Integer value = map.get(c);
				map.put(c, value +1);
				
			}else {
				map.put(c, 1);
				temp = temp +c;
			}
		//	map
			
		}
		System.out.println(map);
		System.out.println(temp);
	}

}
