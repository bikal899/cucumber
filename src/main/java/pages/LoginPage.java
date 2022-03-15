package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver)// constractor//
	{
		this.driver = driver;
	}

	// Web Element List
	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
	WebElement Username;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button")
	WebElement Signin;

	// Intecractable Methods
	public void insertUsername(String username) {
		Username.sendKeys(username);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void insertPassword(String password) {
		Password.sendKeys(password);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickSignIn() {
		Signin.click();
	}

	public String getTitle() {
		return driver.getTitle();
	}
}
