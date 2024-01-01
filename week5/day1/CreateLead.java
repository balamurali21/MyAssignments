package week5.day1.TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod {

@Test
	public void runCreateLead () {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bala");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9988771144");
		driver.findElement(By.name("submitButton")).click();
		
}
}






