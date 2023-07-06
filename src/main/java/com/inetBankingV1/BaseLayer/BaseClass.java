package com.inetBankingV1.BaseLayer;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	// global variables
	public WebDriver driver;
	public String uName = "mngr513212";
	public String uPassword = "jevUhyg";
//	public static Logger logger;

	// start browser
	public void setup() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		// open webpage using url
		driver.get("https://demo.guru99.com/V4/index.php");
//		logger.info("URL is opened");

		// maximize Browser
		driver.manage().window().maximize();
//		logger.info("maximize the browser");

		// clear cookies
		driver.manage().deleteAllCookies();
//		logger.info("delete all coockies");

		// add implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		logger.info("add implicit wait");
		// add log file
//		logger = Logger.getLogger("inetBanking");
		PropertyConfigurator.configure("Log4j.properties");
	}

	// close browser
	public void tearDown() {
		driver.close();
//		logger.info("close browser");
	}

}
