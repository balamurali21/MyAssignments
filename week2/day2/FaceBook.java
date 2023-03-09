package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//div[@class='_6ltg'])[2]/a")).click();
		driver.findElement(By.name("firstname")).sendKeys("Ranju");
		driver.findElement(By.name("lastname")).sendKeys("Krish");
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		driver.findElement(By.id("password_step_input")).sendKeys("123456");
		driver.findElement(By.xpath("//span[@class='_5k_4']//option[21]")).click();
		driver.findElement(By.xpath("//select[@id='month']/option[text()='Sep']")).click();
		driver.findElement(By.xpath("//select[@id='year']/option[text()='1996']")).click();
		driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/input[@value='1']")).click();
		driver.close();
		
	}

}
