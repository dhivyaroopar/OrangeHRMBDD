package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage_PF {
	
	
	@FindBy(xpath="//div[@class='oxd-topbar-header-title']/span/h6") WebElement headerTitle;
	@FindBy(xpath="//span[.='My Info']") WebElement MyInfo;
	@FindBy(xpath="//a[.='Contact Details']") WebElement contactDetails;
	@FindBy(xpath="//div[@class='oxd-grid-item oxd-grid-item--gutters']/div/div[2]/input") WebElement street1;
	@FindBy(xpath="//div[@class='oxd-grid-3 orangehrm-full-width-grid']/div[3]//input") WebElement city;
	@FindBy(xpath="//div[@class='oxd-grid-3 orangehrm-full-width-grid']/div[4]//input") WebElement state;
	@FindBy(xpath="//div[@class='oxd-grid-3 orangehrm-full-width-grid']/div[5]//input") WebElement zipcode;
	@FindBy(xpath="//div[@class='oxd-grid-3 orangehrm-full-width-grid']/div[6]/div/div[2]") WebElement countryDropdown;
	@FindBy(xpath="//form[@class='oxd-form']//div[@class='oxd-form-row'][2]//input") WebElement homePhone;
	@FindBy(xpath="//form[@class='oxd-form']//div[@class='oxd-form-actions']/button") WebElement saveBtn;
	
	@FindBy(xpath="//a[.='Emergency Contacts']") WebElement emergencyContacts;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--text']") WebElement addBtn;
	@FindBy(xpath="//div[@class='oxd-form-row']//input") WebElement emergencyContactName;
	@FindBy(xpath="//div[@class='oxd-form-row']/div/div[2]//input") WebElement relationship;
	@FindBy(xpath="//form[@class='oxd-form']/div[2]//input") WebElement emergencyPhone;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']") WebElement emergencySaveButton;
	@FindBy(xpath="//div[@class='orangehrm-container']/div/div[2]/div/div/div[2]") WebElement verifyEmergencyContact;
	
	@FindBy(xpath="//a[.='Dependents']") WebElement dependentsTab;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--text']") WebElement addDepBtn;
	@FindBy(xpath="//div[@class='oxd-grid-3 orangehrm-full-width-grid']/div[1]//input") WebElement depName;
	//@FindBy(xpath="//div[@class='oxd-select-text-input']") WebElement relation;
	//@FindBy(xpath="//div[contains(text(), 'Child')]") WebElement childRelation;
	@FindBy(xpath="//div[contains(@class,'oxd-select-text oxd-select-text--active')]/div[2]") WebElement relation;
	@FindBy(xpath="//*[text()='Child']") WebElement childRelation;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']") WebElement depSaveBtn;
	@FindBy(xpath="//div[@class='orangehrm-container']/div/div[2]/div/div/div[2]/div") WebElement verifyDepName;
	
	
	public static WebDriver driver;
	public HomePage_PF(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void getHeaderTitle() throws InterruptedException {
		 Thread.sleep(2000);
		 String name= headerTitle.getText();
		 Assert.assertEquals("Dashboard", name);
	}
	
	public void clickMyInfo() {
		MyInfo.click();
	}
	
	public void clickContactDetails() {
		contactDetails.click();
	}
	
	public void enterContactInfo() {
		street1.sendKeys("149 Main Street");
		city.sendKeys("Syracuse");
		state.sendKeys("New York");
		zipcode.sendKeys("08976");
		countryDropdown.click();
		homePhone.sendKeys("9870936272");
		saveBtn.click();
		
	}
	
	public void clickEmergencyContacts() {
		emergencyContacts.click();
	}
	
	public void clickAddBtn() {
		addBtn.click();
	}
	
	public void enterEmergencyContactDetails() {
		emergencyContactName.sendKeys("Dhivya");
		relationship.sendKeys("Friend");
		emergencyPhone.sendKeys("8976523242");
		emergencySaveButton.click();
	}
	
	public void verifyEmergencyContacts() throws InterruptedException {
		Thread.sleep(2000);
		String name = verifyEmergencyContact.getText();
		Assert.assertEquals("Dhivya", name);
	}
	
	public void clickDependentsTab() {
		dependentsTab.click();
	}
	public void clickAddDepBtn() {
		addDepBtn.click();
	}
	
	public void enterDependentDetails() throws InterruptedException {
		depName.sendKeys("Nancy");
		relation.click();
		Thread.sleep(3000);
		childRelation.click();
		depSaveBtn.click();
	}
	public void verifyDependentInfo() {
		String child =verifyDepName.getText();
		Assert.assertEquals("Nancy", child);
		System.out.println("Committing new changes to check git merge");
	}

}
