package constructor;

public class A {
	
	public A(int i) {
		System.out.println(i);
		
	}
	
	public A() {
		System.out.println("Parent Constructor");
		}

	private void A(int number) {
		System.out.println(number);
	}
	
	public static void main(String[] args) {
		A a = new A();
		A a1 = new A(125);
	}

}
