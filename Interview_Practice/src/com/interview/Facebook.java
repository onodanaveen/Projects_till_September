package com.interview;

public class Facebook {
	
	public static void age_Limit(int age) throws My_Exception {
		if (age>=5) {
			System.out.println("Account create");
			System.out.println();
		}
		else {
			throw new My_Exception("Age limit");
		}
	}
	
	public static void valid_Email(String mail) throws My_Exception {
		if (mail.equals("Starc")) {
			System.out.println("Mail is correct");
		}
		else {
			throw new My_Exception("Error message");
		}
		
	}
	
	public static void main(String[] args) throws My_Exception {
		
		age_Limit(6);
		
		valid_Email("Starc");
	}
}
