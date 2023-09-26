package com.ravivarma;

import java.util.Scanner;

public class First_training {
	public static void main (String[] args) {
		Scanner newd = new Scanner(System.in);
		System.out.println("Enter your mark");
		
		int a = newd.nextInt();
		if(a>90){
			System.out.println("Your Grade is A+");
		}
		else if(a>80){
			System.out.println("Your Grade is B+ ");
		}
		else if(a>70) {
			System.out.println("Your Grade is C+");
		}
		else if (a>60) {
			System.out.println("Your Grade is D+");
		}
		else if (a>=50) {
			System.out.println("Your Grade is E+");
		}
		else if (a<50) {
			System.out.println("Your Grade is F and you Failed asshole");
		}
	}
}

