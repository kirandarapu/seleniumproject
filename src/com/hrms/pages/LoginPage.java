package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;

/// to maintain objects and functions related to login function
public class LoginPage extends BaseClass {
	//objects
	static By txt_LoginName= By.name("txtUserName");
	static By txt_Password =By.name("txtPassword");
	static By btn_Login = By.name("Submit");
	
	//functions
	public static void login(String un,String pw)throws Exception {
		driver.findElement(txt_LoginName).sendKeys(un);
		driver.findElement(txt_Password).sendKeys(pw);
		driver.findElement(btn_Login).click();
		Thread.sleep(4000);
		Reporter.log("login completed");
	}

}
