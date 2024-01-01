package week3.day2;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintListCount {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> count = driver.findElements(By.className("a-price-whole"));
		int size = count.size();
		System.out.println(size);



	}

}
