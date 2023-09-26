package com.Dec12;

public class List_demo {
	public static void main(String[] args) {
		{
			String name = "baba";
			
			String temp = "";
			
			int length = name.length();
			
			for (int i = length-1; i >= 0; i--) {
				
				char C = name.charAt(i);
				
				temp = temp + C;
				
			}
			System.out.println(temp);
		}
		{
			String s = "plip plip";
			
			String blank = "";
			
			String[] split = s.split("");
			
			for (String string : split) {
				
				
				blank = blank + string;
				
			}
			System.out.println(blank);
		}
	}

}
