package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import base.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod {
	
	public HomePage(EdgeDriver driver) {
		this.driver=driver;
	}

	public MyHomePage clickCRMSFA() {
	// TODO Auto-generated method stub
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
}


}
