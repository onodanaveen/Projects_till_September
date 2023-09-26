package com.ravivarma;
import java.util.Scanner;
public class Vowels_Switch {
	public static void main(String[] args) {
		Scanner baby = new Scanner(System.in);
		System.out.println("Enter any alphabet");
		char ai = baby.next().charAt(0);
		switch(ai) {
		case ('a'):
			System.out.println("The given value is vowel");
		break;
		case ('e'):
			System.out.println("The given value is vowel");
		break;
		case ('i'):
			System.out.println("The given value is vowel");
		break;
		case ('o'):
			System.out.println("The given value is vowel");
		break;
		case ('u'):
			System.out.println("The given value is vowel");
		break;
		default: 
			System.out.println("The given value is constanant");
		}
		
	}

}
