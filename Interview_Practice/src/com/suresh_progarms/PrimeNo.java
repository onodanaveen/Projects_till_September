package com.suresh_progarms;

public class PrimeNo {
	public static void main(String[] args) {
		 
		int n =9 ;
		int count = 0;
		
		for(int i = 2; i<n; i++) {
			if (n%i == 0) {
				count = count+1;
			}
		}
		if (count == 0) {
			System.out.println(" the no." + n +" is prime");
		}else {
			System.out.println("the no. "+ n + " is not prime");
		}
	}

}
