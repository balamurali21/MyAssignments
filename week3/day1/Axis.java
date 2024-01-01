package week3.day1;

public class Axis extends Loan {

	public void savingsAcct() {
		System.out.println("Savings Acct for Axis bank");
	}

	public void currentAcct() {
		System.out.println("Current Acct Axis bank");
		}

	@Override
	public void vehicleLoan() {
		System.out.println("Vehicle Loan");

	}
	private void axisBankOffers() {

		System.out.println("Axis Bank offers");
	}
	private void axisBankBeneifits() {
		System.out.println("Axis Bank benefits");

	}
	public static void main(String[] args) {
		Axis info=new Axis();
		info.savingsAcct();
		info.currentAcct();
		info.goldLoan();
		info.eduLoan();
		info.vehicleLoan();
		info.axisBankOffers();
		info.axisBankBeneifits();
	}
}
