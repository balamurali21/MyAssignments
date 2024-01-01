package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnTable {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).clear();
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys("MAS");
		driver.findElement(By.xpath("//div[text()='Mgr Chennai Ctr']")).click();
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).clear();
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys("MDU");
		driver.findElement(By.xpath("//div[text()='Madurai Jn']")).click();
		driver.findElement(By.xpath("//input[@id='buttonFromTo']")).click();
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
	    WebElement table = driver.findElement(By.xpath("//table[contains(@class,'stickyTrainLi')]"));
	    List<WebElement> row = table.findElements(By.xpath("//table[contains(@class,'stickyTrainLi')]//tr/td[2]"));
	    System.out.println(row.size());
	    
	    
	    for (int i = 0; i < row.size(); i++) {
	    	System.out.println(row.get(i).getText());
			
		}
		

	}

}
