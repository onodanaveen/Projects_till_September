package com.logicfirst;

import java.util.Scanner;

public class Reverse_loop {
	public static void main(String[] args) {
		System.out.println("Enter any no.");
		Scanner ter = new Scanner(System.in);
		int number = ter.nextInt();
		int c=0,b;
		while (number>0) {
			b=number%10;
			c=(c*10)+b;
			number= number/10;
			
		}
		System.out.println("The reverse of the entered no. is "+ c);
	}

}
