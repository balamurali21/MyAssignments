package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

public class DuplicateLead extends ProjectSpecificMethod {
@Test
	public void runDuplicateLead() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.findElement(By.name("USERNAME")).sendKeys("DemoSalesManager");
		//driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//driver.findElement(By.className("loginButton")).click();**//
		//Thread.sleep(2000);
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("11223344");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.name("submitButton")).click();
		
	}

}


