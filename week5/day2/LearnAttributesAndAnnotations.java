package week5.day2;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LearnAttributesAndAnnotations {

	@Test(priority=-1)
	
	public void openBrowser() {
		System.out.println("open browser");
	}
	@Test (priority=2, enabled= false)
	public void closeBrowser() {
		System.out.println("close browser");
	}
	@Test	(priority=1)	
	public void minimizeBrowser()  {
		System.out.println("minimize browser");
	}
	@Test 
	@Ignore
	public void maximizeBrowser() {
		System.out.println("maximize browser");
	}


}
