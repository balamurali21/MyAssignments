package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataProvider {
	@Test(dataProvider = "fetchData")
	public void createLead (String cname, String fname, String lname, String pnum) {	
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.xpath("(//input[@class='inputBox'])[17]")).sendKeys(pnum);
		driver.findElement(By.name("submitButton")).click();
	}
	@DataProvider(name="fetchData")
	public String[][] getData () {
		String [][] data=new String[2][4];
		data [0][0]="Wipro";
		data [0][1]="Murali";
		data [0][2]="Krishnan";
		data [0][3]="97910";

		data [1][0]="TCS";
		data [1][1]="Ranju";
		data [1][2]="Krish";
		data [1][3]="79041";
		return data;

	}
}

