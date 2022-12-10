package week3.day1;

public class HDFC  extends SBI implements Cibil {

	public void minBalance() {
		// TODO Auto-generated method stub
		System.out.println("Minimum balance required is 1000");

	}

	public void maxLoanAmout() {
		// TODO Auto-generated method stub
		System.out.println("Max loan amount is 4lakh");

	}
	public void homeloan ()
	{
		System.out.println("Home loan provided");
	}
public static void main(String[] args) {
	HDFC mybank = new HDFC();
	mybank.minBalance();
	mybank.maxLoanAmout();
	mybank.homeloan();
	mybank.cibilMethod();
	
	//RBI rbi= new RBI();
	
	RBI rbi = new HDFC();
	rbi.maxLoanAmout();
	
	Cibil cibil = new SBI();
	cibil.cibilMethod();
}

public void cibilMethod() {
	// TODO Auto-generated method stub
	
}

}
