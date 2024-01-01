package week3.day1;

public class AxisBank extends BankInfo {
	@Override
	public void deposit() {

		System.out.println("Axis deposit");
	}
	public static void main(String[] args) {
		AxisBank banking=new AxisBank ();
		banking.deposit();
		banking.saving();
		banking.fixed();
	}

}
