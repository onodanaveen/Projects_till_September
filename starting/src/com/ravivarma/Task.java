package com.ravivarma;

public class Task extends EmployeeDetails{
	public void name() {
		super.name();
	}
	public void age() {
		super.age();
	}
	public void experience() {
		super.experience();
	}
	public void employeeID() {
		super.employeeID();
	}
	public void gender() {
		super.gender();
	}
	public static void main(String[]args) {
		Task b =new Task();
		b.name();
		b.age();
		b.experience();
		b.employeeID();
		b.gender();
	}
}
