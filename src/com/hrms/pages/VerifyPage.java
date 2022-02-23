package com.hrms.pages;

import org.testng.Reporter;

import com.hrms.utility.BaseClass;

public class VerifyPage extends BaseClass  {
	public static void verifyTitle(String Title) {
		if(driver.getTitle().equals("HRMS")) {
			Reporter.log("title matched");
		}
		else {
			Reporter.log("title not matched and expected title"+driver.getTitle());
		}
	}
	

}
