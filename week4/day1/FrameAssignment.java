package week4.day1.Target_locators;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class FrameAssignment {

	public static void main(String[] args) {
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String text = driver.findElement(By.xpath("//p[text()='You pressed OK!']")).getText();
		System.out.println(text);

		if (text.contains("You pressed OK")) {
			System.out.println("Verifed");
		}
		else {
			System.out.println("Not verified");
		}
	}

}
