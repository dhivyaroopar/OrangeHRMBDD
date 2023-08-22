package pagefactory;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	
	@FindBy(name="username") WebElement username;
	@FindBy(name="password") WebElement password;
	@FindBy(xpath="//button[@type='submit']") WebElement LoginBtn;
	
	
	public static WebDriver driver;
	public LoginPage_PF(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername() {
		username.sendKeys("Admin");
	}
	
	public void enterPassword() {
		password.sendKeys("admin123");
	}
	public void clickOnLogin() {
		LoginBtn.click();
	}
	
	

}
