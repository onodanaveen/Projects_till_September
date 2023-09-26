package com.january3;

import java.util.stream.IntStream;

public class StringPractice {
	
	private void Practice() {
		String s = "Naveen";
		
		char c = s.charAt(3);
		System.out.println(c);
		
		int codePointAt = s.codePointAt(0);
		System.out.println(codePointAt);
		
	//	IntStream chars = s.chars();
		//System.out.println(chars);
		
		int codePointBefore = s.codePointBefore(0);
		System.out.println(codePointBefore);

	}
	
	public static void main(String[] args) {
		StringPractice sp = new StringPractice();
		sp.Practice();
	}

}
