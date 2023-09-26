package com.logicfirst;

import java.util.Scanner;

public class Reverse_String {
	public static void main(String[] args) {
		Scanner sys = new Scanner(System.in);
		System.out.println("Enter any string");
		
		String name = sys.nextLine(); 
		

		System.out.println(name);
		
	//	String name = "Jackie chan";
		String temp = "";
		
		
		int len = name.length();
		
		System.out.println("The length of the given string is " +len);
		
		
		System.out.println("The reverse of the given String is ");
		for(int i = (len-1); i>=0 ; i--) {

			char value = name.charAt(i);
			temp = temp + value;
		}
		System.out.println(temp);
	}

}

