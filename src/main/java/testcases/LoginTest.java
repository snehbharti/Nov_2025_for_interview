package testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WindowType;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.yourcompany.tests.base.BaseTest;

import pages.LoginPage;

public class LoginTest extends BaseTest {

//	@Override
//	@Parameters({ "browser", "env" })
//	@BeforeMethod
//	public void setUp(String browser, String env) {
//		System.out.println("your env variable is" + env + "your current class name" + this.getClass());
//		// run parent setup first01.2.5
//		super.setUp(browser, env);
//
//		// add extra steps
//		System.out.println("Extra setup in child class");
//		driver.manage().window().maximize();
//	}
	@Override
	@Parameters({ "browser", "env" })
	@BeforeMethod
	public void setUp() {
		String env = System.getProperty("env", "qa");
		String browser = System.getProperty("browser", "chrome");

		super.setUp();

		// add extra steps
		System.out.println("Extra setup in child class");
		driver.manage().window().maximize();
	}

	@Test()
	public void testLogin() {
		LoginPage loginPage = new LoginPage(driver);
//        loginPage.enterUsername("testuser");
//        loginPage.enterPassword("password");
//        loginPage.clickLogin();
//        Assert.assertEquals(loginPage.getPageTitle(), "Home Page");

		Reporter.log("Testing Sneh ", true);
		driver.switchTo().activeElement();
		// Alert t=driver.switchTo().alert();
		// driver.manage().window(WindowType.TAB);

	}
}
