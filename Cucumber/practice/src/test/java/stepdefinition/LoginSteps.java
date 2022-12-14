package stepdefinition;

import java.time.Duration;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginPage;

public class LoginSteps {

	@Given("The user is on the login page")
	public void the_user_is_on_the_login_page() {
	    TestBase.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    System.out.println("User lanaded on the login page");
	}

	@When("The user enters the username as {string} and password as {string}")
	public void the_user_enters_the_username_as_and_password_as(String username, String password) {
	    LoginPage loginPage = new LoginPage(TestBase.getDriver());
	    loginPage.enterUserName(username);
	    loginPage.enterPassword(password);
	    loginPage.clickLogin();
	}

	@Then("The user should be able to login to the application succesfully")
	public void the_user_should_be_able_to_login_to_the_application_succesfully() {
	    System.out.println("Successfully Logged in");
	}
}
