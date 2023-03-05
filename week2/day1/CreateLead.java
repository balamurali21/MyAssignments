package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bala Murali");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Krishnan");
		WebElement opt = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select emp=new Select(opt);
		emp.selectByVisibleText("Employee");
		WebElement mc = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select payPer=new Select(mc);
		payPer.selectByValue("9001");
		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select corp=new Select(ownership);
		corp.selectByIndex(5);
		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select in=new Select(country);
		in.selectByVisibleText("India");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);

	}

}
