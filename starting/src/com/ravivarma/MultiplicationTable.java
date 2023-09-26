package com.ravivarma;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		System.out.println("Enter the value for multiplication table");
		int a = r.nextInt();
		int b=1,c;
		for (int i=0;i<10;i++) {
			c=b*a;
			System.out.println(a+"*"+b+"="+c);
			b=++b;
		}
	}

}
