package com.hrms.testscripts;

import org.testng.annotations.Test;


import com.hrms.pages.AddEmpPage;
import com.hrms.pages.DelEmpPage;
import com.hrms.pages.LoginPage;
import com.hrms.pages.VerifyPage;
import com.hrms.pages.LogoutPage;
import com.hrms.utility.BaseClass;

public class TC001 {
	/// TO PROVIDE TEST STEPS
	@Test
	public static void tc001()throws Exception {
		BaseClass.openApplication();
		VerifyPage.verifyTitle("HRMS");
		LoginPage.login("admin", "admin");
		VerifyPage.verifyTitle("Orange HRM");
		
		AddEmpPage.EnterFrame();
		AddEmpPage.Addbtn();
		
		LogoutPage.logout();
		AddEmpPage.ExitFrame();
		BaseClass.closeApplication();
		
	}
	

}
