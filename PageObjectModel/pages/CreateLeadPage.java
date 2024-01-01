package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import base.ProjectSpecificMethod;

public class CreateLeadPage extends ProjectSpecificMethod {
	
	public CreateLeadPage(EdgeDriver driver) {
		this.driver=driver;
	}

	public CreateLeadPage cName(String cname) {
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		return this;
			
}
	
	public CreateLeadPage fName(String fname) {
	
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;
}

	public CreateLeadPage lName(String lname) {
	
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		return this;
}

	public ViewLeadPage submitCreateLead() {

		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
		
	
}

}
