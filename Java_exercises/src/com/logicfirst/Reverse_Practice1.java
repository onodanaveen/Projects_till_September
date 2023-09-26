package com.logicfirst;

public class Reverse_Practice1 {

	public static void main (String[] args) {
		int n = 343;
		
		int a =n;
		
		int temp = 0;
		
		while (a>0) {
			
			int b = a%10;
			
			temp = temp +(b*b*b);
			
			a= a/10;		
		}
		System.out.println("the result is "+temp);
		
		if (temp == n) {
			System.out.println(n + " is an armstrong number");
			
		}
		else {
			System.out.println(n + " is not an armstrong number");
		}
		
		int c =n;
		
		int temp1=0;
		
		while (c>0) {
			int d = c%10;
			
			temp1 = (temp1*10) + d;
			
			c=c/10;
			
		}
		
		System.out.println("the reverse of the number is "+ temp1);
		
		if (temp1==n) {
			System.out.println("the entered no. "+ n +" is a palindrome");
			
		}
		else {
			System.out.println("the no. "+ n + " is not a palindrome");
		}
		
		
		
	}
	
}