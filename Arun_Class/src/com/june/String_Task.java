package com.june;

public class String_Task {
	
	private static void wordsCountInString() {
		String s = "Union minister house burnt down in violence";
		
		int count =0, count1 = 0;
		String[] split = s.split(" ");
		
		for (String word : split) {
			count++;
			
		}
		System.out.println("number of words is "+ count );
		
		String[] split2 = s.split("");
		for (String letter : split2) {
			count1++;
			
		}
		System.out.println("number of letters including space is "+ count1);
		
		int temp = count1 -count +1;
		System.out.println("number of letters excluding space is "+ temp);
	}
	
	public static void main(String[] args) {
		wordsCountInString();
	}

}
