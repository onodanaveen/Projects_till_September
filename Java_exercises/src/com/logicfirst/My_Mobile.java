package com.logicfirst;

public class My_Mobile {
	
	//variables/ state
	// Instance variable
	int screenSize = 12;
	int cost = 12600;
	char logo = 'S';
	float amps = 1.5f;
	long mobileNo = 9524775509l;
	boolean isTouch = true;
	String brand = "Galaxy M30s";
	
	//Behaviours
	public void make_Calls() {
		System.out.println("Making calls");
	}
	private void pay_money() {
		// TODO Auto-generated method stub
		System.out.println("Payment done successfully");
	}
	private void view_Gallery() {
		// TODO Auto-generated method stub
		System.out.println("Beautiful pics are seen");
	}
	public static void main(String[] args) {
		//to access all the components of class main method is created
		//Create an object and Instantiate 
		
		//Syntax
		// ClassName object = new ClassName()--Constructor
		// A class can have a multiple number of objects
		
		My_Mobile obj = new My_Mobile();
		
		int price = obj.cost;
		System.out.println(price);
		System.out.println(obj.screenSize);
		System.out.println(obj.isTouch);
		
		//access the methods using the object
		obj.make_Calls();
		obj.pay_money();
		obj.view_Gallery();
	}

}
