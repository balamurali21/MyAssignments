package week4.day1.Target_locators;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnWindow {

	public static void main(String[] args) {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		System.out.println(driver.getTitle());
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listWindows =new ArrayList<String>(windowHandles);
		driver.switchTo().window(listWindows.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.quit();
	}

}
