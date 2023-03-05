package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		//String title=driver.getTitle();
		//System.out.println(title);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//driver.findElement(By.className("decorativeSubmit")).click();
		//String title1=driver.getTitle();
		//System.out.println(title1);
		//driver.close();
		//driver.findElement(By.linkText("CRM/SFA")).click();
		//driver.findElement(By.linkText("Leads")).click();
		//driver.findElement(By.linkText("Create Lead")).click();
	}

}
