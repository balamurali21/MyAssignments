package week2.day1_seleniumbasics;

import org.openqa.selenium.edge.EdgeDriver;

public class Facebook {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.close();
	}

}
