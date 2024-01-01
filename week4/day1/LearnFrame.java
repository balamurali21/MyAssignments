package week4.day1.Target_locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		String text = driver.findElement(By.xpath("//button[contains(text(),'Hurray')]")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.switchTo().frame(driver.findElement(By.id("frame2")));
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		String text2 = driver.findElement(By.xpath("//button[contains(text(),'Hurray')]")).getText();
		System.out.println(text2);
		driver.switchTo().defaultContent();
		
	}

}
