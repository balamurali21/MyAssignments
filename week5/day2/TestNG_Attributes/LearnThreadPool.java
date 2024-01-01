package week5.day2.TestNG_Attributes;

import org.testng.annotations.Test;

public class LearnThreadPool {
	
	@Test(priority =1)
	public void duplicateAcct () {
		System.out.println("Duplicate account");
	}
@Test(priority = 0, invocationCount = 3)
	public void editAcct() {
		System.out.println("Edit account");
}
@Test(priority = 2, invocationCount = 5, threadPoolSize = 2)
	public void deleteAcct() {
	System.out.println("Delete account");
}
@Test(priority =-1 )
	public void createAcct() {
	System.out.println("Create account");
}

}
