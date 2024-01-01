package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import base.ProjectSpecificMethod;

public class ViewLeadPage extends ProjectSpecificMethod {

	
	public ViewLeadPage(EdgeDriver driver) {
		this.driver=driver;
	}

	public ViewLeadPage VerifyFName() {
	        String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
	        System.out.println(text+"Lead  Created");
	        return this;
	    }

	}

