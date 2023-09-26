package com.ravivarma;
import java.util.Scanner;
public class Switch_Demo {
	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		int a,b;
		System.out.println("Enter the two no.s");
		a =r.nextInt();
		b =r.nextInt();
		char operator;
		System.out.println("Choose any operation from +,-,*,/,%");
		operator = r.next().charAt(0);
		
		switch(operator) {
			case '+':
				System.out.println(a +"+"+b + "="+(a+b));
				break;
			case '-':
				System.out.println(a +"-"+b + "="+ (a-b));
				break;
			case '*':
				System.out.println(a +"*"+b + "="+ (a*b));
				break;
			case '/':
				System.out.println(a +"/"+b + "="+ (a/b));
				break;
			case '%':
				System.out.println(a + "%" +b + "=" +(a%b));
				break;
			
			
		}
		
		
		
	}

}
