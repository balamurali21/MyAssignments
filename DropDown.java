package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		WebElement selectTool = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select se=new Select(selectTool);
		se.selectByVisibleText("Selenium");		
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s ui-c']")).click();
		driver.findElement(By.id("j_idt87:country_3")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[contains(@class,'ui-icon ui-icon-triangle')])[2]")).click();
		driver.findElement(By.id("j_idt87:city_2")).click();
		driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(@class,'ui-autocomplete-panel ui-widget-content')]//li[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@id='j_idt87:lang_items']//li[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@id='j_idt87:value_items']//li[4]")).click();
	}

}
