package com.ravivarma;
import java.util.Scanner;
public class Days_switch {
	public static void main(String[] args) {
		Scanner y = new Scanner(System.in);
		System.out.println("Enter the value from 0 to 7");
	//	int a = y.nextInt();
		char a;
		a= y.next().charAt(0); 
		switch (a) {
		case '1':
			System.out.println("Monday");
			break;
		case '2':
			System.out.println("Tuesday");
			break;
		case '3':
			System.out.println("Wednesday");
			break;
		case '4':
			System.out.println("Thursday");
			break;
		case '5':
			System.out.println("Friday");
			break;
		case '6':
			System.out.println("Saturday");
			break;
		case '0':
			System.out.println("Sunday");
			break;
			
		}
		
		}
		
	}


