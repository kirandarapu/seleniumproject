package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;

public class AddEmpPage extends BaseClass {
	///objects
	
	static By btn_add=By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[1]");
	static By txt_Firstname=By.name("txtEmpFirstName");
	static By txt_Lastname =By.name("txtEmpLastName");
	static By btn_Save=By.id("btnEdit");
	
	///functions
	public static void EnterFrame() {
		driver.switchTo().frame("rightMenu");
		Reporter.log("enter into frame");
	}
	public static void Addbtn() {
		
		driver.findElement(btn_add).click();
		driver.findElement(txt_Firstname).sendKeys("selenium");
		driver.findElement(txt_Lastname).sendKeys("tutor");
		driver.findElement(btn_Save).click();
		driver.switchTo().defaultContent();
	}
	public static void ExitFrame() {
		driver.switchTo().defaultContent();
		Reporter.log("exit from frame");
	}
	

}
