package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {
	
	public LoginPage(EdgeDriver driver) {
		this.driver=driver;
	}
	    
	public LoginPage enterUname (String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
		return this;
		
}

	public LoginPage enterPwd(String pwd) {
	
		driver.findElement(By.id("password")).sendKeys(pwd);
		return this;
	
	
}

	public HomePage clickLogin() {
	
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage(driver);
}
}
