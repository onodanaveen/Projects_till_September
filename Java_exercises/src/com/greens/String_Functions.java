package com.greens;

public class String_Functions {
	public static void main(String[] args) {
		String s = "naveen";
		boolean with = s.startsWith("n");
		System.out.println(with);
		
		float  e = 92.08f;
		int a = (int) e;
		System.out.println(a);
		
		
			try {
				System.out.println(10 / 0);
			} catch (Exception e1) {
				e1.printStackTrace();
				System.exit(0);   // how to avoid the finally block - answer
			} finally {
				System.out.println("process completed");
			}
			
			try {
				System.out.println(10/0);
			} catch (ArithmeticException e1) {
				e1.printStackTrace();
			} catch (RuntimeException e2) {
				System.out.println("JINM");
				
			} catch (Exception e2) {
			}
			
		
		char chara = s.charAt(2);
		System.out.println(chara);
		
		int length = s.length();
		String temp = " ";
		for (int i = (length-1); i >= 0; i--) {
			
			char charAt = s.charAt(i);
			temp = temp + charAt;
		//	System.out.println(temp);	
		}
		
		String replace = s.replace('n', 'x');
		System.out.println(replace);
		
		String name = "Steven*Smith%48";
		String replaceAll = name.replaceAll("[a-zA-Z]", "&");
		System.out.println(replaceAll);
		
		String trim = replaceAll.trim();
		System.out.println(trim);
		
		String trim2 = trim.trim();
		System.out.println(trim2);
	}

}
