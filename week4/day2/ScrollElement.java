package week4.day2.ActionClassandWebtable;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollElement {

	public static void main(String[] args) throws IOException {
			EdgeDriver driver=new EdgeDriver();
			driver.get("https://www.nykaa.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("(//button[@kind='secondary'])[1]")).click();
			driver.findElement(By.xpath("//button[@type='button']")).click();
			WebElement scroll = driver.findElement(By.xpath("//a[text()='Contact Us']"));
			Actions act=new Actions(driver);
			act.scrollToElement(scroll).perform();
			File src = driver.getScreenshotAs(OutputType.FILE);
			File des = new File("/snap/img2.png");
			FileUtils.copyFile(src, des);

			}

}
