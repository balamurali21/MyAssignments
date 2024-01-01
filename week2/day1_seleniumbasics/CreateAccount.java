package week2.day1_seleniumbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Acct");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Murali");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("org.testleaf");
		driver.findElement(By.xpath("//input[@id='annualRevenue']")).sendKeys("340,000");
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select op1=new Select(industry);
		op1.selectByIndex(3);
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select op2=new Select(ownership);
		op2.selectByVisibleText("S-Corporation");
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select op3=new Select(source);
		op3.selectByValue("LEAD_EMPLOYEE");
		WebElement mc = driver.findElement(By.id("marketingCampaignId"));
		Select op4=new Select(mc);
		op4.selectByIndex(6);
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select op5=new Select(state);
		op5.selectByValue("TX");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.close();
	}

}
