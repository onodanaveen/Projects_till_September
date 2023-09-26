package com.logicfirst;

public class Factorial {
	public static void main(String[] args) {
		
		int n = 6;
		
		int temp = n;
		
		int a=1;
		
		while (temp >0) {
			
			a = (a*temp );
					
			temp = (temp-1) ;
			
	//		System.out.println(a);
			
		}
		
		System.out.println("The factorial of given no. " + n + " is " + a);
	}

}
