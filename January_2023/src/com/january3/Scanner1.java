package com.january3;

import java.util.Scanner;

public class Scanner1 {
	
	public static void main(String[] args) {
		
		String s = "madam";
		
		String s1 = "adamm";
		
		int count =0 ;
		
		for (int i = 0; i < s1.length(); i++) {
			
		//	int count = 0;
			
			char c = s.charAt(i);
			
			if (c== 'a'|| c=='d'||c== 'm') {
				
				count++; 
				
			}
			
		}
		if (count == s1.length()) {
			
			System.out.println("s is anagram of s1 as "+count + " letters match");
		}
		else {
			System.out.println("s is not anagram of s1 as "+count + " letters match");
		}
		
				
	}

}
