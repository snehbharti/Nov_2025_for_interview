package testcases;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.yourcompany.tests.base.BaseTest;

import pages.LoginPage;

public class SmokeTestCase extends BaseTest {

	@Test()
	public void testLogin() {
		System.out.println("smoke test case");
		Reporter.log(driver.getTitle()+"--->"+"smoke test case", true);

	}
}
