package com.inetBankingV1.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	// constructor
	public LoginPage(WebDriver driver) {
		driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "uid")
	WebElement uName;

	@FindBy(name = "password")
	WebElement uPassword;

	@FindBy(name = "btnLogin")
	WebElement loginBtn;

	public void enterUserName(String uname) {
		uName.sendKeys(uname);
	}

	public void enterpassword(String upasswd) {
		uPassword.sendKeys(upasswd);
	}

	public void clickOnLoginButton() {
		loginBtn.click();
	}

}
