package constructor;

public class Basic1 {
	
	public Basic1() {
		this(15);
		System.out.println("Constructor");
	}
	
	Basic1(int a){
		this("java");
		System.out.println(a);
	}
	
	Basic1(String n){
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		Basic1 ba = new Basic1();
		Basic1 baa  = new Basic1("naveen");
		
	}

}
