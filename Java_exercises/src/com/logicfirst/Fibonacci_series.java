package com.logicfirst;

import java.util.Scanner;

public class Fibonacci_series {
	public static void main(String[] args) {
		
		Scanner rub = new Scanner(System.in);
		System.out.println("Enter the two numbers");

		int num1  = rub.nextInt();
		int num2 = rub.nextInt();
		System.out.println("Enter the limit ");
		int limit = rub.nextInt();
		int c=0;
		System.out.println("the fibonacci series for the given two numbers for the limit is ");
	/*	for(int i=0; i<=limit; i++) {
			c= num1 + num2;
			num1=num2;
			num2=c;
			System.out.println(c);
		}			*/
		int j=0;
		while (j < limit) {
			c= num1+num2;
			num1=num2;
			num2=c;
			System.out.println(c);
			j=j+1;
		}
		
	}

}
