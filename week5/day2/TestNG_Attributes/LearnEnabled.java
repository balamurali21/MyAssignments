package week5.day2.TestNG_Attributes;

import org.testng.annotations.Test;

public class LearnEnabled {
	
@Test(priority =1)
	public void duplicateAcct () {
		System.out.println("Duplicate account");
	}
@Test(priority = 0)
	public void editAcct() {
		System.out.println("Edit account");
}
@Test(priority = 2, enabled=false)
	public void deleteAcct() {
	System.out.println("Delete account");
}
@Test(priority =-1 )
	public void createAcct() {
	System.out.println("Create account");
}

}
