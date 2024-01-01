package week4.day1.Target_locators;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowsAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//label[text()='FLIGHTS'])[2]")).click();
		Set<String> windows = driver.getWindowHandles();
		List<String> listWin = new ArrayList<String>(windows);
		driver.switchTo().window(listWin.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(listWin.get(0));
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
