package week3.day1;

public abstract class Loan implements RBI {
	public void goldLoan() {
		System.out.println("Gold Loan");
	}
	public void eduLoan() {
		System.out.println("Education Loan");

	}
	public abstract void vehicleLoan();

}
