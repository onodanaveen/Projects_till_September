package com.tasks;

import java.util.Scanner;

public class W3c_Exercises {
	
	private static void inputtwonumbers() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a= s.nextInt();
		int b = s.nextInt();
	//	int c;
	//	c= a-b;
		
		System.out.println("The sum is"+ (a+b));
		System.out.println("The differnce is"+ (a-b));
		System.out.println("The product is"+ a*b);
		System.out.println("The division is"+ a/b);

	}
	private static void nextLinePrint() {
		System.out.println("Hello\nNaveen");
	}
	private static void multiplicationTables() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of multiplication table");
		int a = s.nextInt();
		System.out.println("The tables for number " + a +" is");
		for (int i = 1; i <= 10; i++) {
			System.out.println(a*i);
		}
	}
	
	private static void areaAndPerimeterOfCircle() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		int r = s.nextInt();
		System.out.println("The area is "+(3.14*r*r));
		System.out.println("The perimeter is "+(2*3.14*r));
	}
	
	private static void swappingTwoNumbers() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a,b,c ;
		a = s.nextInt();
		b = s.nextInt();
		
		c=a;
		a=b;
		b=c;
		System.out.println("After swapping "+ a +","+ b);
		
	}
	private static void reverse() {
		String s = "Naveen";
		String temp = "";
		for (int i = s.length()-1; i >=0 ; i--) {
			char c = s.charAt(i);
			temp = temp + c;
		}
		System.out.println(temp);
	}
	
	public static void main(String[] args) {
	//	nextLinePrint();
	//	inputtwonumbers();
	//	multiplicationTables();
	//	areaAndPerimeterOfCircle();
	//	swappingTwoNumbers();
		reverse();
	}

}
