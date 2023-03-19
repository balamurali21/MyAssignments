package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertAssignment {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		Alert simple = driver.switchTo().alert();
		simple.accept();
		String text = driver.findElement(By.xpath("//span[@id='simple_result']")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert confirmation = driver.switchTo().alert();
		confirmation.dismiss();
		String text1 = driver.findElement(By.xpath("//span[@id='result']")).getText();
		System.out.println(text1);
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Modal Dialog')]/following-sibling::a/span")).click();		
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert prompt = driver.switchTo().alert();
		String text2 = prompt.getText();
		System.out.println(text2);
		prompt.sendKeys("Testleaf");
		prompt.accept();
		String text3 = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(text3);
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("//span[text()='Yes']")).click();
		driver.findElement(By.xpath("(//span[text()='Show'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[contains(text(),'Min and Max')]/following-sibling::a/span)[1]")).click();
	}

}
