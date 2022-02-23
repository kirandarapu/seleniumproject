package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;

public class DelEmpPage extends BaseClass {
	///objects
	static By checkbox_select=By.name("chkLocID[]");
	static By btn_delete=By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[2]");
	
//functions
	public static void delete_btn()throws Exception {
		driver.findElement(checkbox_select).click();
		driver.findElement(btn_delete).click();
		Thread.sleep(4000);
		Reporter.log("employee deleted");
	}
}
