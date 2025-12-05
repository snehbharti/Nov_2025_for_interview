package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.yourcompany.tests.base.BasePage;

public class LoginPage extends BasePage {
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.id("loginButton");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterUsername(String username) {
        enterText(usernameField, username);
    }

    public void enterPassword(String password) {
        enterText(passwordField, password);
    }

    public void clickLogin() {
        click(loginButton);
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}
