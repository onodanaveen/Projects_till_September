package abstraction;

public class BankDetails extends Bank{

	@Override
	public void personalLoan() {
		System.out.println("25%");		
	}
	
	public static void main(String[] args) {
		
		BankDetails b = new BankDetails();
		b.personalLoan();
		b.homeLoan();
		b.educationalLoan();
	}

}
