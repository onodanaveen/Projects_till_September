package com.Demo;

public class OutOfBound {
	public static void main(String[] args) {
		
	
	String s = "naveen";
	
	for(int i=4;i>= 0; i--) {
		char c = s.charAt(i);
		System.out.println(c);
	}

}
}