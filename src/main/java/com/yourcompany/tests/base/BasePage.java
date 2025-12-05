
package com.yourcompany.tests.base;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.JavascriptExecutor;

public class BasePage { // --> Base class for Page Object Model (POM)
	public WebDriver driver;
	WebDriverWait wait;

	// Constructor to initialize the driver
	public BasePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	// Wait for element visibility
	public WebElement waitForElement(By locator) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	// Click element
	public void click(By locator) {
		WebElement element = waitForElement(locator);
		element.click();
	}

	// Enter text
	public void enterText(By locator, String text) {
		WebElement element = waitForElement(locator);
		element.clear();
		element.sendKeys(text);
	}

	// Javascript Executor for scrolling or clicking hidden elements
	public void executeJavaScript(String script) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(script);
	}
}
