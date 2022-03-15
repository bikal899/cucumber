package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefination extends TestBase {
	LoginPage loginPage;
	WebDriver driver;
	@Before
	public void BeforeTest() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);

	}

	@Given("^User is on techfios login page$")
	public void user_is_on_techfios_login_page() {
		driver.get("https://techfios.com/billing/?ng=admin/");

	}

	@When("^User enter username as \"([^\"]*)\"$")
	public void User_enter_username_as(String Username) {
		loginPage.insertUsername(Username);

	}

	@When("^User enter password as \"([^\"]*)\"$")
	public void user_enter_password_as(String password) {
		loginPage.insertPassword(password);

	}

	@When("^User click on signin button$")
	public void user_click_on_signin_button() {
		loginPage.clickSignIn();

	}

	@Then("^User should land on Dashboard page$")
	public void user_should_land_on_Dashboard_page() {
		Assert.assertEquals("Dashboard- iBilling", loginPage.getTitle());
	}

	@Then("^User should not land on Dashboard page$")
	public void user_should_not_land_on_Dashboard_page() throws Throwable {
		Assert.assertEquals("Dashboard- iBilling(2)", loginPage.getTitle());
		throw new PendingException();
	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
