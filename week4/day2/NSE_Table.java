package week4.day2;

import java.time.Duration;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class NSE_Table {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@id='navbtn_stockmarket']")).click();
		driver.findElement(By.xpath("(//a[text()='NSE Bulk Deals'])[1]")).click();
		WebElement table = driver.findElement(By.xpath("(//table[contains(@class,'table table-bordered')])[1]"));
		List<WebElement> row = table.findElements(By.xpath("(//table[contains(@class,'table table-bordered')])[1]//tr/td[1]"));
		System.out.println(row.size());
		for (int i = 0; i < row.size(); i++) {
			System.out.println(row.get(i).getText());
			
		}
		Set<WebElement> row1=new LinkedHashSet<WebElement>(row);
		//System.out.println(row1.iterator());
		
		if (row.size()==row1.size()) {
			System.out.println("There is no dupliacte");
			
		}
		else {
			System.out.println("There is dupliacte");
		}

	}

}
