package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	private static final By USER_NAME = By.id("name");
	private static final By PWD = By.id("password");
	private static final By LOGIN = By.id("login");
	
	
	public void enterUserName(String user) {
		driver.findElement(USER_NAME).sendKeys(user);
	}
	public void enterPassword(String pwd) {
		driver.findElement(PWD).sendKeys(pwd);
	}
	
	public void clickLogin() {
		driver.findElement(LOGIN).click();
	}
}
