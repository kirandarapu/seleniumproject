package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.pages.AddEmpPage;
import com.hrms.pages.DelEmpPage;
import com.hrms.pages.LoginPage;
import com.hrms.pages.VerifyPage;
import com.hrms.utility.BaseClass;

public class TC002 {
	@Test
	public static void tc001()throws Exception {
		BaseClass.openApplication();
		VerifyPage.verifyTitle("HRMS");
		LoginPage.login("admin", "admin");
		AddEmpPage.EnterFrame();
		DelEmpPage.delete_btn();
		AddEmpPage.ExitFrame();
		BaseClass.closeApplication();
		
		
	}

}
