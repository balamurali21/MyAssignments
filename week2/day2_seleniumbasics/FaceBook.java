package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ranju");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Krish");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("99778866554");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Staycool@123");
		WebElement bdate = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select op1=new Select(bdate);
		op1.selectByValue("11");
		WebElement bmonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select op2=new Select(bmonth);
		op2.selectByIndex(8);
		WebElement byear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select op3=new Select(byear);
		op3.selectByVisibleText("1995");
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		driver.close();
	}
}

