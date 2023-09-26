package com.ravivarma;

import java.util.Scanner;

public class Looping {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("enter the three digit value");
		int d = t.nextInt();
		int a = d, b, c = 0;
		while (a != 0) {
			b = a % 10;
			c = c + (b * b * b);
			a = a / 10;
		}
		if (c != d) {
			System.out.println("The entered value " + c + " is not an armstrong number");
		} else
			System.out.println("The entered value " + c + " is an armstrong number");

	}

}
