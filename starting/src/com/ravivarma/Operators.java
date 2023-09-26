package com.ravivarma;

import java.util.Scanner;

public class Operators {
	public static void main(String[] args) {
		Scanner Thara = new Scanner(System.in);
		System.out.println("Enter the two values");
		int a = Thara.nextInt();
		int b = Thara.nextInt();
		int c;
		System.out.println("the fibonacci series for given two values is");
		for (int i=7;i<10;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}
	
	
}
