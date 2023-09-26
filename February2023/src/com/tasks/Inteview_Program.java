package com.tasks;

public class Inteview_Program {
	public static void main(String[] args) {
		String s = "alpha123beta";
		
		String[] split = s.split("", 1);
		
		for (String s1 : split) {
			System.out.print(s1);
		}
		//ateb123ahpla
		String alphatemp = "";
		String numerictemp = "";
		
		int length = s.length();
		
		for (int i = length-1; i>=0; i--) {
			char c = s.charAt(i);
			if (c>='a' && c<= 'z') {
				alphatemp = alphatemp +c;
				
			}else {
				alphatemp = c+alphatemp ;
		//		break;
			}
		//	alphatemp =alphatemp + numerictemp;
		}
	//	System.out.println(alphatemp);
	}

}
