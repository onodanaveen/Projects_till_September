package com.june12;

public class Demo_Practice {
	
	public static void main(String[] args) {
		
		int a = 6, temp , c;
		temp = 1;
		
		for (int i = a; i > 0; i--) {
	//		c = temp - 1;
			temp= temp*i;
			System.out.println(temp);
		}
	}

}
