package com.tasks;

public class ProgramDemo {
public static void main(String[] args) {
	 String s = "alpha123beta123";
	 String alphabets = "";
	 String temp = "";
	 String result = "";
	 int count =0;
     
	 int length = s.length();
	 
	 for (int i = 0; i < length; i++) {
		 char c = s.charAt(i);
		 if (Character.isDigit(c)) {
			 if (count ==0) {
				 count++;
				 for (int j = alphabets.length()-1; j >= 0; j--) {
					temp = temp+ alphabets.charAt(j);
				}
				 System.out.println(temp);
	//			 alphabets = "*";
				result = result+temp + c;
	//			System.out.println(alphabets);
			}else {
				result = result + c;
				alphabets="";
				
			}
			
		}else {
			alphabets = alphabets +c;
			count = 0;
		}
		
	}System.out.println(result);
}
}