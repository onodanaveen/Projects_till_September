package com.june12;

import java.awt.List;
import java.util.Arrays;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Iterator_Concept {

	public static void main(String args[]) {
		
		int[] a = new int[5];
		Integer[] b = {10,20,30,50};
		
		java.util.List<Integer> l = Arrays.asList(b);
		
		System.out.println(l);
		
		java.util.Iterator<Integer> itr = l.iterator();
		
		while(itr.hasNext()) {
			Integer value = itr.next();
			System.out.println(value);
			
			if (value == 30) {
				
				itr.remove();
				
			}
			System.out.println(l);
		}
	}
}
