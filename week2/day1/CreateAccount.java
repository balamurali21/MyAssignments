package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Bala");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("ABCD");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("EFGH");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("1 paise");
		WebElement industryName = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select cs=new Select(industryName);
		cs.selectByValue("IND_SOFTWARE");
		WebElement ownership = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select sCrop=new Select(ownership);
		sCrop.selectByVisibleText("S-Corporation");
		WebElement source = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select emp=new Select(source);
		emp.selectByValue("LEAD_EMPLOYEE");
		WebElement marketingCampaign = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select eCommerce=new Select(marketingCampaign);
		eCommerce.selectByIndex(6);
		WebElement state = driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
		Select tx=new Select(state);
		tx.selectByValue("TX");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	}

}
