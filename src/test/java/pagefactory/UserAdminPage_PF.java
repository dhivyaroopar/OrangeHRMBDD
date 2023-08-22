package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserAdminPage_PF {
	@FindBy(xpath="//div[@class='oxd-topbar-header-title']/span/h6") WebElement title;
	@FindBy(xpath="//a[.='Admin']") WebElement adminTab;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']") WebElement addbutton;
	

}
