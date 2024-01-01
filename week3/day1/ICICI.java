package week3.day1;

public class ICICI extends Loan {

	public void savingsAcct() {
		System.out.println("Savings Acct for ICICI bank");
	}
	public void currentAcct() {
		System.out.println("Current Acct ICICI bank");	
	}
	@Override
	public void vehicleLoan() {
		System.out.println("Vehicle Loan");	
	}
	private void iciciBankOffers() {

		System.out.println("ICICI Bank offers");
	}
	private void iciciBankBeneifits() {
		System.out.println("ICICI Bank benefits");
	}

	public static void main(String[] args) {
		ICICI info=new ICICI();
		info.savingsAcct();
		info.currentAcct();
		info.goldLoan();
		info.eduLoan();
		info.vehicleLoan();
		info.iciciBankOffers();
		info.iciciBankBeneifits();

	}

}
