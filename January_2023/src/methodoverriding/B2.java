package methodoverriding;

public class B2 extends B1 {
	
	public void Rapido() {
		super.Rapido();
		System.out.println("Also Food Delivery");
	}
	
	private void swiggy() {
		System.out.println("Food Delivery");
	}
	
	public void Ola() {
		super.Ola();
	}
	
	public static void main(String[] args) {
		B2 n = new B2();
		n.Rapido();
		n.swiggy();
		n.Ola();
	}
	

}
