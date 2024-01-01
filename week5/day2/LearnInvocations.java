package week5.day2;

import org.testng.annotations.Test;

public class LearnInvocations {

	@Test (invocationCount = 3, invocationTimeOut = 2000, threadPoolSize =2)
	private void create() {
		
		System.out.println("Create acct");
		
	}
	@Test
	private void edit() {

		System.out.println("Edit acct");
	}
	@Test
	private void delete() {

		System.out.println("Delete acct");
	}
}
