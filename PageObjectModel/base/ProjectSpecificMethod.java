package base;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import util.ReadExcel;

public class ProjectSpecificMethod {
	public EdgeDriver driver;
	public String excelfile;
	@BeforeMethod
	public void LaunchBrowser() {
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver =new EdgeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
	@DataProvider(name="getdata")
	public String [][] getData () throws IOException{
		String[][] inputData = ReadExcel.inputData(excelfile);
		return inputData;
	}
	}
	


