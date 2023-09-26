package com.logicfirst;

import java.util.Scanner;

public class Numerology {
	
	public static void main(String[] args) {
		Scanner mayil = new Scanner(System.in);
		
		System.out.println("Enter the Name");
		
		String words = mayil.nextLine();
		
		int length = words.length();
		
		int temp = 7 ;
		
		System.out.println(length + " letter name");
		
		for (int i = 0; i < length; i++) {
			
			char value = words.charAt(i);
			
	//		System.out.print(value);
			
			if (value == 'a' || value == 'j' || value == 'i' || value == 'y' || value == 'q') {
				temp = temp +1;
			} 
			else if (value == 'b' || value  == 'k' || value == 'r') {
				temp = temp +2;
			}
			else if (value == 'c' || value == 'g' || value == 'l' || value == 's') {
				temp = temp +3;
			}
			else if (value == 'd' || value == 'm' || value == 't') {
				temp = temp +4;
			}
			else if (value == 'e' || value == 'h' || value == 'n' || value =='x') {
				temp = temp +5;
			}
			else if (value == 'u' || value  == 'v' || value == 'w') {
				temp = temp +6;
			}
			else if (value == 'o' || value  == 'z') {
				temp = temp +7;
			}
			else if (value == 'f' || value  == 'p') {
				temp = temp +8;
			}	
		}
		System.out.println( "The sum of letters by numerology is :"+temp);
		
		int a ,b ,c =0,d,e, f=0;
		
		a = temp;
		
		while (a>0) {
			
			b= a%10;
			
			c=c+b;
			
			a=a/10;
			
		}
		System.out.println("Sum of above no. is "+ c);
		
		d  = c;
		
		while (d>0) {
			
			e= d%10;
			
			f= f+e;
			
			d= d/10;
		}
		
		System.out.println("The Name No. is "+ f);
		
	}

}
