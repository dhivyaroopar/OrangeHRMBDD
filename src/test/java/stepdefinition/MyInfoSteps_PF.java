package stepdefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.HomePage_PF;
import pagefactory.LoginPage_PF;

public class MyInfoSteps_PF {
	WebDriver driver;
	LoginPage_PF login;
	HomePage_PF home;
	
	@Given("User is on home page")
	public void user_is_on_home_page() throws InterruptedException {
		home = new HomePage_PF(LoginPage_PF.driver);
		home.getHeaderTitle();
	}

	@Given("User clicks on MyInfo Tab")
	public void user_clicks_on_my_info_tab() {
	    home.clickMyInfo();
	}

	@When("User clicks on Contact Details")
	public void user_clicks_on_contact_details() {
	   home.clickContactDetails();
	}

	@When("User enters contact info and clicks save button")
	public void user_enters_contact_info_and_clicks_save_button() {
	    home.enterContactInfo();
	}

	@Then("New user contact is created")
	public void new_user_contact_is_created() {
	   System.out.println("New contact is successfully created");
	}

	@When("User clicks on Emergency Contacts")
	public void user_clicks_on_emergency_contacts() {
	    home.clickEmergencyContacts();
	}

	@When("User clicks on Add emergency contact button")
	public void user_clicks_on_add_emergency_contact_button() {
	    home.clickAddBtn();
	}

	@When("User enters emergency contact info and clicks save button")
	public void user_enters_emergency_contact_info_and_clicks_save_button() {
	    home.enterEmergencyContactDetails();
	}

	@Then("New emergency contact is created")
	public void new_emergency_contact_is_created() throws InterruptedException {
		home.verifyEmergencyContacts();
	}

	@When("User clicks on Dependents tab")
	public void user_clicks_on_dependents_tab() {
		home.clickDependentsTab();
	}

	@When("User clicks on Add Dependents button")
	public void user_clicks_on_add_dependents_button() {
	    home.clickAddDepBtn();
	}

	@When("User enters dependent info and clicks save button")
	public void user_enters_dependent_info_and_clicks_save_button() throws InterruptedException {
		home.enterDependentDetails();
	}

	@Then("New dependent user is created")
	public void new_dependent_user_is_created() {
		home.verifyDependentInfo();
	}


}
