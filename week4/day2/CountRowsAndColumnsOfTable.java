package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CountRowsAndColumnsOfTable {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement table1 = driver.findElement(By.xpath("(//table)[1]"));
		List<WebElement> rowCount1 = table1.findElements(By.tagName("tr"));
		System.out.println("The row count of table 1 is " + rowCount1.size());
		List<WebElement> columnCount1 = table1.findElements(By.tagName("th"));
		System.out.println("The column count of table 1 is " + columnCount1.size());
		WebElement table2 = driver.findElement(By.xpath("(//table)[2]"));
		List<WebElement> rowCount2 = table2.findElements(By.tagName("tr"));
		System.out.println("The row count of table 2 is " + rowCount2.size() );
		List<WebElement> columnCount2 = table2.findElements(By.tagName("th"));
		System.out.println("The row count of table 2 is " + columnCount2.size());
		
		
	}

}
