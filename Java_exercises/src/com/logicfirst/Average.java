package com.logicfirst;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		System.out.println("Enter any three no.s");
		Scanner r = new Scanner(System.in);
		int number1 = r.nextInt();
		int number2 = r.nextInt();
		int number3 = r.nextInt();
		double average;
		average=(number1 +number2 + number3)/3;
		System.out.println("the average of the given three no. is "+ average);
	}

}
