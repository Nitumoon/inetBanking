package com.inetBankingV1.testLayer;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.inetBankingV1.BaseLayer.BaseClass;
import com.inetBankingV1.pageLayer.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	@Test
	public void loginTest() throws InterruptedException {

		// object of LoginPage
		LoginPage lp = new LoginPage(driver);

		// call methods from loginPage Class
		// enter UserId
		lp.enterUserName(uName);
		logger.info("enter userId");

		// enter password
		lp.enterpassword(uPassword);
		logger.info("enter password");

		// click on login
		lp.clickOnLoginButton();
		logger.info("click on login button");

		// verify page title
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			AssertJUnit.assertTrue(true);
			logger.info("verify Title");
			logger.info("TC_LoginTest_001 is passed");

		} else {
			AssertJUnit.assertTrue(false);
			logger.info("verify Title");
			logger.info("Test Case TC_LoginTest_001 is failed");
		}

	}

}
