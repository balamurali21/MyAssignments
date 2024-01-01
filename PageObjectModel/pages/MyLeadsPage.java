package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import base.ProjectSpecificMethod;

public class MyLeadsPage extends ProjectSpecificMethod {
	
	public MyLeadsPage(EdgeDriver driver) {
		this.driver=driver;
	}

	public CreateLeadPage clickCreateLead() {
	
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);
}


}
