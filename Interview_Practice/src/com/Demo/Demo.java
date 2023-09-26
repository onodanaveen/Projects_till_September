package com.Demo;

public class Demo {
	
	public static void arithemetic_Exception(int a,int b) {
		// TODO Auto-generated method stub
		try {
			System.out.println(a/b);
		} catch (Exception e) {
			// TODO: handle exception
			throw new ArithmeticException("b should not be zero");
		}

	}
	
	public static void main(String[] args) {
		arithemetic_Exception(10, 0);
	}
	
	

}
