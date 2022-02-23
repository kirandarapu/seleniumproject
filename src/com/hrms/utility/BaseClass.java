package com.hrms.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

//to maintain common functionalities of whole application
public class BaseClass {
	public static WebDriver driver;
	public static void openApplication() {
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		Reporter.log("application opened");
	}
	public static void closeApplication() {
		driver.close();
		Reporter.log("application closed");
	}
	
	

}
