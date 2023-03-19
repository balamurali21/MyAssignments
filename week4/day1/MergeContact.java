package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MergeContact {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Merge Contacts')]")).click();
		driver.findElement(By.xpath("(//table[@id='widget_ComboBox_partyIdFrom']//following::img)[1]")).click();
		Set<String> windowSets = driver.getWindowHandles();
		List <String> windowsLists=new ArrayList<String>(windowSets);
		driver.switchTo().window(windowsLists.get(1));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='10157']")).click();
		driver.switchTo().window(windowsLists.get(0));
		driver.findElement(By.xpath("(//table[@id='widget_ComboBox_partyIdFrom']//following::img)[2]")).click();	
		Set<String> windowSets1 = driver.getWindowHandles();
		List <String> windowsLists1=new ArrayList<String>(windowSets1);
		driver.switchTo().window(windowsLists1.get(1));	
		driver.findElement(By.xpath("//a[text()='10164']")).click();
		driver.switchTo().window(windowsLists.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Alert confirmation = driver.switchTo().alert();
		confirmation.accept();
		System.out.println(driver.getTitle());

	}

}
