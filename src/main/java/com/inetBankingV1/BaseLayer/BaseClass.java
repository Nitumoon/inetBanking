package com.inetBankingV1.BaseLayer;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	// global variables
	public WebDriver driver;
	public String uName = "mngr513212";
	public String uPassword = "jevUhyg";
	public static Logger logger;

	// start browser
	@BeforeClass
	public void setup() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);

		logger = LogManager.getLogger("inetBanking");

//		logger.info("for info only");
//		logger.debug("for debug only");
//		logger.error("error message");
//		logger.warn("warning message");

		// open webpage using url
		driver.get("https://demo.guru99.com/V4/index.php");
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
