package com.june;

public class String_Programs {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java"); // --> new memory created
		String s4 = new String("java");
		StringBuffer s5 = new StringBuffer("java");
		StringBuffer s6 = new StringBuffer("java");// --> only has object comparison, 
												//.equals not compares string value, but string location
		
		System.out.println(s1 == s2 );// == checks the memory locations
		System.out.println(s3 == s4);
	}

}
