package week4.day2.ActionClassandWebtable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement source = driver.findElement(By.xpath("//p[text()='Drag to target']"));
		WebElement destination = driver.findElement(By.xpath("//span[text()='Droppable Target']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(source, destination).perform();
		WebElement src = driver.findElement(By.xpath("//span[text()='Drag me around']"));
		Point location = src.getLocation();
		int x = location.getX();
		System.out.println(x);
		int y = location.getY();
		System.out.println(y);
		act.dragAndDropBy(src, 150, -5).perform();
		System.out.println(src.getLocation().getX());
	
	}

}
