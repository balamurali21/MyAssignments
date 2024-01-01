package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadsFeature_Steps {
public EdgeDriver driver;
	
	@Given("Open the browser")
	public void openBrowser() {
		driver = new EdgeDriver();
	}
	@And("Open the url")
	public void openUrl() {
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@And("Enter the user name as {string}")
	public void enterUname(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
	}
	@And("Enter passwrd as {string}")
	public void enterPword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	@When("Click logon button")
	public void clickLogonButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Home Page should be displayed")
	public void verifyHome_page() {
		String title = driver.getTitle();
		if (title.contains("Leaftaps")) {
			System.out.println("Homepage is displayed");
		}
		else {
			System.out.println("Homepage is not displayed");
		}
	}
	@When("Click on CRMSFA button button")
	public void click_on_crm_sfa_button_button() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("CRM/SFA"))));
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@And("Click on Leads button")
	public void clickOnLeads () {
		driver.findElement(By.linkText("Leads")).click();
	}
	@And("Click on CreateLead")
	public void clickCreatButton () {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@Given("Enter company name as (.*)$")
	public void enterCompName (String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		
		
	}
	@And("Enter First name as (.*)$")
	public void enterFirstname (String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	}
	@And("Enter Last name as (.*)$")
	public void enterLastname (String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	}
	@And("Enter mob no. as (.*)$")
    public void enterPhonNum(String phNo ) {
    	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
    }
	@When("Click on Create Lead")
	public void clickOnCreate () {
		driver.findElement(By.name("submitButton")).click();
    }
	@Then("View Leads page should be displayed")
	public void view_leads_page_should_be_displayed() {
		String title = driver.getTitle();
		if (title.contains("View Lead")) {
			System.out.println("Lead is created");
		}
		else {
			System.out.println("Lead is not created");
		}
			
		}
	}

