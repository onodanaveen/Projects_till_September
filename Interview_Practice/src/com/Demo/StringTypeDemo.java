package com.Demo;

public class StringTypeDemo {
	public static void main(String[] args) {
	
			String s = "Sandhiya";
			String s1 = "Sandhiya";
			System.out.println(s);
			
			System.out.println(System.identityHashCode(s));
			
			System.out.println(s1);
			
			System.out.println(System.identityHashCode(s1));
			
			String r = s.concat(s1);// return name necessary to concat
			System.out.println(r);
			System.out.println(System.identityHashCode(r));
			
			System.out.println("*********************************");
			
			StringBuffer sb = new StringBuffer("Sandhiya");
			
			System.out.println(sb);
			System.out.println(System.identityHashCode(sb));
			
			StringBuffer sb1 = new StringBuffer("Sandhiya");
			
			System.out.println(sb1);
			System.out.println(System.identityHashCode(sb1));
			
			sb1.append(sb);
			System.out.println(sb1);
			System.out.println(System.identityHashCode(sb1));
			
			
			
}
}
