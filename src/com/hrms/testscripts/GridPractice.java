package com.hrms.testscripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
public class GridPractice {

	
		WebDriver driver;
		@Test(priority=1)
	 void setup() throws Exception {
			
			String nodeurl="http://192.168.100.22:5556/wd/hub";
			DesiredCapabilities caps=DesiredCapabilities.chrome();
			caps.setBrowserName("chrome");
			caps.setPlatform(Platform.WIN10);
			
			System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\Drivers\\chromedriver.exe");
			driver=new RemoteWebDriver(new URL(nodeurl),caps);
		}
		
		@Test(priority=2)
	public void Login() {
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.name("username")).sendKeys("naveendarapu108@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Amma@9642842747");
		driver.findElement(By.name("login")).click();
		
		String capttext=driver.findElement(By.xpath("//*[@id=\'page-36']/div/div[1]/div/p[1]/strong")).getText();
		
		if(capttext.contains("naveendarapu108 ")) {
			System.out.println("Test passed ");
		}
		
		else {
			System.out.println("Test failed");
		}
		driver.close();
	}
		

	}


