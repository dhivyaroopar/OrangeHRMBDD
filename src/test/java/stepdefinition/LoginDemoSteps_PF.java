package stepdefinition;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.HomePage_PF;
import pagefactory.LoginPage_PF;

public class LoginDemoSteps_PF {
	public static WebDriver driver;
	LoginPage_PF login;
	HomePage_PF home;
	
	//scenario 1
	@Given("User is already on Login Page")
	public void User_already_on_LoginPage() {
		driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		login = new LoginPage_PF(driver);
		login.enterUsername();
		login.enterPassword();
	}
	
	@Then("user clicks Login button")
	public void user_clicks_login_button() {
		login.clickOnLogin();
	}

	@Then("user is on homepage")
	public void user_is_on_homepage() throws InterruptedException {
		home = new HomePage_PF(driver);
		home.getHeaderTitle();
	}
	
	
}
