package week5.day2;


import org.testng.annotations.Test;

public class LearnDependsOnMethod {
	@Test
	public void create() {
		System.out.println("Create lead");
		throw new RuntimeException();
	}
	@Test (dependsOnMethods = "create", alwaysRun = true)
	public void edit() {
		System.out.println("Edit lead");
	}
	@Test
	public void duplicate() {
		System.out.println("Duplicate lead");
	}

}
