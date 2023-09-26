package constructor;

public class B extends A{
	public B() {
		System.out.println("child Constructor");
		}
	public static void main(String[] args) {
		B b= new B();    //--> It executes the Parent class Constructor by default
	//	A b = new B();	//--> Upcasting takes place as the Parent class is assigned to 
						    // the child class
	}

}
