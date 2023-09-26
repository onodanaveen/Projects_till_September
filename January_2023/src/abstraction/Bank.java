package abstraction;

public abstract class Bank {
	
	public abstract void personalLoan(); 
	
	public void educationalLoan() {
			System.out.println("8%");
	}
	
	public void homeLoan() {
			System.out.println("12%");
	}
	
	public static void main(String[] args) {
	//	Bank b = new Bank();
	//	b.educationalLoan();
	//	b.homeLoan();
	//	b.personalLoan();
	}

}
