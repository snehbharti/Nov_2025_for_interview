package com.yourcompany.tests.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import utils.ConfigReader;

public class BaseTest {
// --> Base class for TestNG setup/teardown
	public WebDriver driver;

	WebDriverFactory factory = new WebDriverFactory();

//	@Parameters({ "browser", "env" })
//	@BeforeMethod
//	public void setUp(@Optional("chrome")String browser, @Optional("qa")String env) {
//		System.out.println("Main setup in Base test class");
//		System.out.println("your env variable is " + env);
//		ConfigReader cr = new ConfigReader(env);
//		System.out.println(cr.getProperty("url"));
//		String url = cr.getProperty("url");
//		System.out.println("browser data is--->"+ browser);
//		driver = factory.getDriver(browser, url);
//	}

	@BeforeMethod
	public void setUp() {
		 // Read system properties correctly
	    String env = System.getProperty("env", "qa");
	    String browser = System.getProperty("browser", "chrome");
	    //mvn clean test -Denv=uat -Dbrowser=chrome
	    //mvn clean test -Denv=uat -Dbrowser=chrome -DxmlSuiteFile=smoke.xml
  

	    ConfigReader cr = new ConfigReader(env);
	    String url = cr.getProperty("url");

	    System.out.println("URL from properties = " + url);
	    System.out.println("Browser data is ---> " + browser);
	    System.out.println("your env variable is: " + env);

	    driver = factory.getDriver(browser, url);
	}

	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
