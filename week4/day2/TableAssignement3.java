package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TableAssignement3 {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement table = driver.findElement(By.xpath("(//table)[1]"));
		List<WebElement> lib = table.findElements(By.xpath("(//table)[1]//tr/td[1]"));
		for (int i = 0; i < lib.size()-1; i++) {
			System.out.println(lib.get(i).getText());
		}
		WebElement au = driver.findElement(By.xpath("(//table)[1]//tr[2]"));
		System.out.println(au.getText());
		
	}

}
