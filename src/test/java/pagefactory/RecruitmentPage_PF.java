package pagefactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RecruitmentPage_PF {
	
	@FindBy(xpath="//div[@class='oxd-topbar-header-title']/span/h6") WebElement title;
	@FindBy(xpath="//a[.='Recruitment']") WebElement recruitmentTab;
	@FindBy(xpath="//i[@class='oxd-icon bi-plus oxd-button-icon']") WebElement addBtn;
	@FindBy(name="firstName") WebElement firstName;
	@FindBy(name="lastName") WebElement lastName;
	@FindBy(xpath="//div[@class='oxd-select-text oxd-select-text--active']/div[2]") WebElement vacancyDrpdown;
	@FindBy(xpath="//*[text()='Senior QA Lead']") WebElement role;
	@FindBy(xpath="//form[@class='oxd-form']/div[3]//input") WebElement email;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']") WebElement saveBtn;
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p oxd-text--subtitle-2']") WebElement verifySuccess;
	
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--success']") WebElement shortlist;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']") WebElement save2;
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p oxd-text--subtitle-2']") WebElement verifyShortlisted;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--success']") WebElement scheduleInterview;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']") WebElement save3;
	@FindBy(xpath="//form[@class='oxd-form']/div[2]//input") WebElement interviewTitle;
	@FindBy(xpath="//input[@placeholder='Type for hints...']") WebElement interviewer;
	@FindBy(xpath="//form[@class='oxd-form']/div[2]/div/div[3]//input") WebElement dateDrpdown;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']") WebElement save4;
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p oxd-text--subtitle-2']") WebElement verifyInterviewScheduled;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--success']") WebElement interviewPassed;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']") WebElement save5;
	@FindBy(xpath="//div[@class='orangehrm-recruitment-actions']//button[@class='oxd-button oxd-button--medium oxd-button--success'][2]") WebElement offerJob;
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p oxd-text--subtitle-2']") WebElement verifyInterviewPassed;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']") WebElement save6;
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p oxd-text--subtitle-2']") WebElement verifyJobOffered;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--success']") WebElement hireBtn;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']") WebElement save7;
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p oxd-text--subtitle-2']") WebElement verifyHired;
	@FindBy(xpath="//div[@class='orangehrm-container']") WebElement table;
	@FindBy(xpath="//div[contains(@class,'oxd-select-text oxd-select-text--active')]/div[2]") WebElement jobTitle;
	@FindBy(xpath="//*[text()='QA Lead']") WebElement selectTitle;
	@FindBy(xpath="//input[@placeholder='Type for hints...']") WebElement candidateName;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']") WebElement search;
	@FindBy(xpath="//div[@class='oxd-table-body']/div/div/div[6]") WebElement finalStatus;
	
	@FindBy(xpath="//div[@class='oxd-table']/div[@class='oxd-table-body']/div[@class='oxd-table-card']") List<WebElement> canditateHistoryList;
	//@FindBy(css=".oxd-table-cell:nth-child(1)") List<WebElement> canditateHistoryList1;
	//@FindBy(css=".oxd-table-cell:nth-child(2)") List<WebElement> canditateHistoryList2;
	
	public static WebDriver driver;
	public RecruitmentPage_PF(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void getTitle() {
		//Thread.sleep(2000);
		 String name= title.getText();
		 Assert.assertEquals("PIM", name);
	}
	
	public void gotoRecruitment() throws InterruptedException {
		Thread.sleep(2000);
		recruitmentTab.click();
	}
	public void clickAdd() {
		addBtn.click();
	}
	
	public void enterCandidateDetails() {
		firstName.sendKeys("James");
		lastName.sendKeys("Josh");
		vacancyDrpdown.click();
		role.click();
		email.sendKeys("abcde@gmail.com");
		saveBtn.click();
	}
	
	public void verifyCandidateisAdded() throws InterruptedException {
		Thread.sleep(1000);
		String name =verifySuccess.getText();
		Assert.assertEquals("Status: Application Initiated",name);
	}
	
	public void clickShortlist() {
		shortlist.click();
		save2.click();
	}
	
	public void verifyShortlist() throws InterruptedException {
		Thread.sleep(2000);
		String name2 = verifySuccess.getText();
		Assert.assertEquals("Status: Shortlisted", name2);		
	}
	
	public void clickScheduleInterview() {
		scheduleInterview.click();
		save3.click();
	}
	public void enterInterviewDetails() throws InterruptedException {
		interviewTitle.sendKeys("Associate IT Manager");
		Thread.sleep(3000);
		//Actions action = new Actions(driver);
		interviewer.sendKeys("Lisa");
		//action.keyDown(interviewer,Keys.SPACE).perform();
		Thread.sleep(2000);
		interviewer.sendKeys(Keys.ARROW_DOWN);
		//action.keyDown(interviewer,Keys.DOWN).perform();
		Thread.sleep(2000);
		interviewer.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		dateDrpdown.sendKeys("2023-07-15");
		save4.click();
	
	}
	
	public void verifyInterviewScheduled() {
		verifyInterviewScheduled.getText();
	}
	public void clickInterviewPassed() {
		interviewPassed.click();
		save5.click();
	}
	
	public void verifyInterviewPassed() throws InterruptedException {
		Thread.sleep(1000);
		verifyInterviewPassed.getText();
	}
	public void clickOfferJob() {
		offerJob.click();
		save6.click();
	}
	public void verifyJobOffered() {
		verifyJobOffered.getText();
	}
	
	public void clickHire() {
		hireBtn.click();
		save7.click();
	}
	
	public void verifyHired() {
		verifyHired.getText();
	}
	public void printTable() {
			
		for(WebElement canditateHis : canditateHistoryList)
		{
		System.out.println("Performance Date :: " +canditateHis.findElement(By.cssSelector(".oxd-table-cell:nth-child(1)")).getText());
		System.out.println("Performance Description :: "+canditateHis.findElement(By.cssSelector(".oxd-table-cell:nth-child(2)")).getText());
		}
	}
	public void enterCandidateSearchDetails() throws InterruptedException {
		jobTitle.click();
		Thread.sleep(2000);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectTitle);
		selectTitle.click();
		candidateName.sendKeys("James");
		//action.keyDown(interviewer,Keys.SPACE).perform();
		Thread.sleep(2000);
		interviewer.sendKeys(Keys.ARROW_DOWN);
		//action.keyDown(interviewer,Keys.DOWN).perform();
		Thread.sleep(2000);
		interviewer.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		search.click();
	}
	public void verifyStatus() {
		String status =finalStatus.getText();
		Assert.assertEquals("Hired", status);
	}

}