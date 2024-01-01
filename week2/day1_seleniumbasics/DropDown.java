package week2.day1_seleniumbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		WebElement selectTool = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select se=new Select(selectTool);
		se.selectByVisibleText("Selenium");		
		driver.findElement(By.xpath("(//div[contains(@class,'ui-selectonemenu')])[2]")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(@class,'ui-selectonemenu')])[4]")).click();
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[contains(@class,ui-autocomplete)])[1]")).click();
		driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(@class,'ui-selectonemenu')])[6]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@id='j_idt87:lang_items']//li[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[contains(@class,'ui-selectonemenu')])[8]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@id='j_idt87:value_items']//li[2]")).click();
	}
}
