package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;


import com.hrms.utility.BaseClass;

////to maintain object and functions related to logout functionality
public class LogoutPage extends BaseClass {
	static By link_logout =By.linkText("Logout");
	///functions
	public static void logout() {
		driver.findElement(link_logout).click();
		Reporter.log("logout completed");
		
	}
	

}
