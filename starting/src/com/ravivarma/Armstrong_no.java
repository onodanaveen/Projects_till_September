package com.ravivarma;

import java.util.Scanner;

public class Armstrong_no {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Enter the value");
		int d = t.nextInt();
		int a = d, b, c = 0;
		while (a != 0) {
			b = a % 10;
			c = c + (b * b * b);
			a = a / 10;
		}
		if (c == d)
			System.out.println("The given no. " + c + " is armstrong no.");
		else
			System.out.println("the no. is not an armstrong no.");
	}

}
