package week4.day2.ActionClassandWebtable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_Assignment {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame(0);
		WebElement src = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement des = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(src, des).perform();
		System.out.println(des.getCssValue("background-color"));
		driver.close();

	}

}
