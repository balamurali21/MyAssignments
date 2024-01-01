package week4.day2.ActionClassandWebtable;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws IOException {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement mouseHover = driver.findElement(By.xpath("(//a[text()='makeup'])[2]"));
		Actions act=new Actions(driver);
		act.moveToElement(mouseHover).perform();
		driver.findElement(By.xpath("//a[text()='Face']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list=new ArrayList<String> (windowHandles);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getTitle());
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./snap/img1.png");
		FileUtils.copyFile(src, des);
	}

}
