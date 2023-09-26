package com.Demo;

public class Reverse_String_Buffer {
	public static void main(String[] args) {
		StringBuffer sbf = new StringBuffer("Geeks of Geeks");
		System.out.println(sbf);
		
		StringBuffer reverse = sbf.reverse();
		System.out.println(reverse);
		
		StringBuilder sbd = new StringBuilder("Naveen Nan");
	//	String string = sbd.toString();
		StringBuilder reverse2 = sbd.reverse();
//		String string = reverse2.toString();
		System.out.println(reverse2);
	//	System.out.println(string);
		
		String s = "Rocky Bhai";
		
		int length = s.length();
		
		String temp = "";
		
		for (int i = (length -1); i >=0 ; i--) {
			char value = s.charAt(i);
			temp = temp + value;
			
		}
		System.out.println(temp);
	}

}
