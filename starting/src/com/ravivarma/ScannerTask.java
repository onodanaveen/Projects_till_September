package com.ravivarma;
import java.util.Scanner;

public class ScannerTask {
	public static void main(String[] args) {
		Scanner j = new Scanner(System.in);
		System.out.println("Enter any no.");
		int a = j.nextInt();
		int b,c=0;
		while(a!=0) {
			b=a%10;
			c=(c*10)+b;
			a=a/10;
		}
		System.out.println("The reverse of the entered value is "+c);
		
	}
}
