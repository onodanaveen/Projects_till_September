package com.tasks;

public class Reverse_Solution {
	public static void main(String[] args) {
		String str = "alpha123beta123";
		String check = "";
		String end = "";
		String test ="";
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isDigit(c)) {
				if (count==0) {
					count++;
					for (int j = test.length()-1; j >= 0; j--) {
						String b = "" + test.charAt(j);
						check = check + b;
					}
					check = check + c;
					end = check + c;
					test ="";
				}
				else {
					check = check +c;
					end = check +c ;
					test = "";
				}
			}
			else {
				count = 0;
				String b = "" + c;
				test = test + b;
			}
		}
		System.out.println(end);
	}

}
