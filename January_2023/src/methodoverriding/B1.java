package methodoverriding;

public class B1 {
	public void Rapido() {
		System.out.println("Bike Taxi");
	}
	
	public void Ola() {
		System.out.println("Cab");
	}
	
	public static void main(String[] args) {
		
		B1 b = new B1();
		b.Rapido();
		b.Ola();
	}

}
