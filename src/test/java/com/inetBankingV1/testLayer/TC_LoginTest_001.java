package com.inetBankingV1.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBankingV1.BaseLayer.BaseClass;
import com.inetBankingV1.pageLayer.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	@Test
	public void loginTest() {
		// open Browser
		setup();

		// object of LoginPage
		LoginPage lp = new LoginPage(driver);

		// call methods from loginPage Class
		// enter UserId
		lp.enterUserName(uName);
//		logger.info("enter userId");

		// enter password
		lp.enterpassword(uPassword);
//		logger.info("enter password");

		// click on login
		lp.clickOnLoginButton();
//		logger.info("click on login button");

		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
//			logger.info("verify Title");
//			logger.info("Test Case TC_LoginTest_001 is passed");

//			System.out.println("Test Case TC_LoginTest_001 is passed");

		} else {
			Assert.assertTrue(false);
//			logger.info("verify Title");
//			logger.info("Test Case TC_LoginTest_001 is failed");

//			System.out.println("Test Case TC_LoginTest_001 is failed");
		}

		// close browser
		tearDown();
	}

}
