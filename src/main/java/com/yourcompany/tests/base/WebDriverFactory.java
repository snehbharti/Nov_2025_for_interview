package com.yourcompany.tests.base;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

//This class manages WebDriver instantiation and setup (Chrome, Firefox, etc.).

	public WebDriver getDriver(String browser, String url) {
		WebDriver driver = null;
		
		ChromeOptions options = new ChromeOptions();

		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-infobars");
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--ignore-ssl-errors=yes");
		options.addArguments("--ignore-certificate-errors");
		options.addArguments("--disable-gpu");
		options.addArguments("--disable-dev-shm-usage"); // AWS/Linux required
		options.addArguments("--no-sandbox"); // Mandatory for AWS/CI
		options.addArguments("--headless=new"); // For AWS headless mode


		if (browser.equals("chrome")) {
			driver = new ChromeDriver(options);
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
//		else {
//			throw new BrowserNotSupportedException("Unsupported browser: " + browser);
//		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
}
