package week4.day2.ActionClassandWebtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Erail_Table_Assignment {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).clear();
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys("MAS");
		driver.findElement(By.xpath("//div[text()='Mgr Chennai Ctr']")).click();
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).clear();
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys("MDU");
		driver.findElement(By.xpath("//div[text()='Madurai Jn']")).click();
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		WebElement table = driver.findElement(By.xpath("(//table[contains(@class,'DataTable')])[1]"));
		List<WebElement> columnCount = table.findElements(By.xpath("(//table[contains(@class,'DataTable')])[1]//tr/td[2]"));
		System.out.println(columnCount.size());
		
		for (int i = 0; i <columnCount.size(); i++) {
			
			System.out.println(columnCount.get(i).getText());
			
		}
	}

}
