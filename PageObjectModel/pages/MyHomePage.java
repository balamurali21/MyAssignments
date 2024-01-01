package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import base.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod {
	
	public MyHomePage(EdgeDriver driver) {
		this.driver=driver;
	}
	public MyLeadsPage clickLeads() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage(driver);
	}
	

}
