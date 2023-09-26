package com.tasks;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_Practice {
	
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		
		l.add("naveen");
		l.add("Family");
		l.add("kapilan");
		
		System.out.println(l);
		
		int size = l.size();
		System.out.println(size);
		
		String string = l.get(2);
		System.out.println(string);
		
		for (String string1 : l) {
			System.out.println(string1);
			
		}
		System.out.println();
		Iterator<String> iterator = l.iterator();
		while (iterator.hasNext()) {
			String string2 = (String) iterator.next();
			System.out.println(string2);
			
		}
		
		
	}
	

}
