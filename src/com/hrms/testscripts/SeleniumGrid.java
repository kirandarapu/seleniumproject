package com.hrms.testscripts;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid {
	public static void main(String args[])throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\Drivers\\chromedriver.exe");
		DesiredCapabilities caps= DesiredCapabilities.chrome();
		
		caps.setPlatform(Platform.WINDOWS);
		URL urlHub=null;
		urlHub=new URL("http://localhst:4444/wd/hub");
		RemoteWebDriver driver=new RemoteWebDriver(urlHub,caps);
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		System.out.println("Application opened");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		System.out.println("login completed");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("logout completed");
		driver.close();
		
		
		
	}

}
