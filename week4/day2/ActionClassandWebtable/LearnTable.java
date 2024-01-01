package week4.day2.ActionClassandWebtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnTable {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement table = driver.findElement(By.xpath("(//table[@role='grid'])[2]"));
		List<WebElement> rowCount = table.findElements(By.tagName("tr"));
		System.out.println("The row count of the table is " + rowCount.size());
		List<WebElement> columnCount = table.findElements(By.tagName("th"));
		System.out.println("The column count of the table is " + columnCount.size());
	
		for (int i = 1; i < rowCount.size(); i++) {
			
			for (int j = 1; j < columnCount.size(); j++) 
				
				{System.out.print(driver.findElement(By.xpath("(//table[@role='grid'])[2]//tr["+i+"]/td["+j+"]")).getText() + " ");}
				 System.out.println();
				
			}
		driver.close();
			
		}
	}


