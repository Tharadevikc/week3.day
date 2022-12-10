package week3.day1;

public class Mybank extends Yesbank{
	
	public static void main(String[] args) {
		Mybank bank= new Mybank();
		bank.minBalance();
		bank.maxLoanAmout();
		bank.homelone();
	}

	@Override
	public void maxLoanAmout() {
		// TODO Auto-generated method stub
		System.out.println("20000");
	}

	@Override
	public void homelone() {
		// TODO Auto-generated method stub
		System.out.println("homeloan");
	}

}

