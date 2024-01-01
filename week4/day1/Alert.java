package week4.day1.Target_locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		org.openqa.selenium.Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		org.openqa.selenium.Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Bala");
		alert3.accept();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("(//button[contains(@class,'ui-button ui-widget ui-state')])[9]")).click();
		driver.findElement(By.xpath("(//span[text()='Show'])[6]")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[3]")).click();
		driver.close();

	}

}
