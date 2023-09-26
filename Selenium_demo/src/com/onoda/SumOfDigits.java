package com.onoda;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		System.out.println("Enter any no.");
		
		Scanner naveen = new Scanner(System.in);
		
		int number = naveen.nextInt();
		
		int b,c=0;
		
		while (number>0){
			b=number%10;
			c=c+b;
			number=number/10;
		}
		
		System.out.println("The sum of digits for the entered no. is "+c);
	}

}
