package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFeature_Steps {
	public EdgeDriver driver;
	
	@Given("Launch the browser")
	public void launchBrowser() {
		driver = new EdgeDriver();
	}
	@And("Load the url")
	public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps/control/login");
	}
	@And("Enter the username as {string}")
	public void enterUsername(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
	}
	@And("Enter password as {string}")
	public void enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	@When("Click login button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Homepage should be displayed")
	public void verifyHomepage() {
		String title = driver.getTitle();
		if (title.contains("Leaftaps")) {
			System.out.println("Homepage is displayed");
		}
		else {
			System.out.println("Homepage is not displayed");
		}
	}	
	@But("The leaftaps is not logged in")
	public void invalidCredentials () {
		System.out.println("Error message is displayed");	
	
	}

}
