package com.tasks;

public class Exception1 {
	
	public static void divide() throws Exception, Throwable {
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			throw new My_Exception();//object created,memory allocate
		}
	}
	public static void main(String[] args) throws Exception, Throwable {
		divide();
	}
}
