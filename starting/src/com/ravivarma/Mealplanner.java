package com.ravivarma;
import java.util.Scanner;

public class Mealplanner {
	public static void main() {
		Scanner u = new Scanner(System.in);
		System.out.println("Enter the limit");
		
		int number = u.nextInt();
		int b,c=0;
		while(number>0) {
			b=number%10;
			c=(c*10)+b;
			number=number/10;
		}
		System.out.println("the reverse is "+c);
	}

}
