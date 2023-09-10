package com.inetBankingV1.BaseLayer;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.inetBankingV1.utilityLayer.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	// global variables
	public WebDriver driver;
//	public String uName = "mngr526948";
//	public String uPassword = "sEbUren";
	public static Logger logger;

	// create object ReadConfigClass
	ReadConfig readconfig = new ReadConfig();

	// start browser
	@BeforeClass
	public void setup() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);

		logger = LogManager.getLogger("inetBanking");

		// open webpage using url
		driver.get(readconfig.getUrl());
		logger.info("Browser opened");

		// maximize Browser
		driver.manage().window().maximize();

		// clear cookies
		driver.manage().deleteAllCookies();

		// add implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// add log file

	}

	// close browser
	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
		logger.info("Browser close");

	}

}
