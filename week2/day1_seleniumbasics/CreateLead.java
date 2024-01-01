package week2.day1_seleniumbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {

		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bala");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Krishnan");
		WebElement opt = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select emp=new Select(opt);
		emp.selectByVisibleText("Employee");
		WebElement opt2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select mc=new Select(opt2);
		mc.selectByValue("9001");
		WebElement opt3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownership=new Select(opt3);
		ownership.selectByIndex(5);
		WebElement opt4 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select country=new Select(opt4);
		country.selectByVisibleText("India");
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text);
		
		if (text.contains("Wipro")) {
			System.out.println("Lead is created");
		}
		else {
			System.out.println("Lead is not created");
		}
		
		//driver.close();
	}

}
