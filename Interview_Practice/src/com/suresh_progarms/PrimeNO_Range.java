package com.suresh_progarms;

public class PrimeNO_Range {
	public static void main(String[] args) {
		
		int count = 0;
		int prime = 0;
		
		for (int n = 2; n < 100; n++) {
			count =0;
			for (int i = 2; i < n; i++) {
				if (n%i == 0) {
					count = count+1;
				}
			}
			if (count==0) {
				System.out.println(n+ " is prime");
				prime= prime+1;
			}
			else {
				System.out.println(n + " is not prime");
			}
			
		}
		System.out.println("the total no. of prime no. between 1 and 100 is "+prime);
	}
}
