package stepdefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.HomePage_PF;
import pagefactory.LoginPage_PF;
import pagefactory.RecruitmentPage_PF;

public class RecruitmentSteps_PF {
	WebDriver driver;
	LoginPage_PF login;
	HomePage_PF home;
	RecruitmentPage_PF recruitment;
	
	@Given("User is in home page")
	public void user_is_in_home_page() throws InterruptedException {
		recruitment= new RecruitmentPage_PF(HomePage_PF.driver);
		recruitment.getTitle();
	    
	}

	@Given("User clicks recruitment tab")
	public void user_clicks_recruitment_tab() throws InterruptedException {
	    //recruitment= new RecruitmentPage_PF(HomePage_PF.driver);
	    recruitment.gotoRecruitment();
	}

	@When("User clicks AddCandidate button")
	public void user_clicks_add_candidate_button() {
		recruitment.clickAdd();
	}

	@When("User clicks Candidate details and clicks save")
	public void user_clicks_candidate_details_and_clicks_save() {
	    recruitment.enterCandidateDetails();
	}

	@Then("Candidate is successfully created")
	public void candidate_is_successfully_created() throws InterruptedException {
	    recruitment.verifyCandidateisAdded();
	}

	@When("User clicks on shortlist the candidate")
	public void user_clicks_on_shortlist_the_candidate() {
	    recruitment.clickShortlist();
	}

	@Then("Candidate status is shortlisted")
	public void candidate_status_is_shortlisted() throws InterruptedException {
	   recruitment.verifyShortlist();
	}

	@When("User clicks on schedule interview")
	public void user_clicks_on_schedule_interview() {
	    recruitment.clickScheduleInterview();
	}

	@When("User enters interview information and schedules it")
	public void user_enters_interview_information_and_schedules_it() throws InterruptedException {
	    recruitment.enterInterviewDetails();
	}

	@Then("Candidate status is Interview Scheduled")
	public void candidate_status_is_interview_scheduled() {
		recruitment.verifyInterviewScheduled();
	}

	@When("User clicks on Mark Interview Passed and clicks save")
	public void user_clicks_on_mark_interview_passed_and_clicks_save() {
		recruitment.clickInterviewPassed();
	}

	@Then("Candidate status is Interview Passed")
	public void candidate_status_is_interview_passed() throws InterruptedException {
		recruitment.verifyInterviewPassed();
	}

	@When("User clicks Offer Job and clicks save")
	public void user_clicks_offer_job_and_clicks_save() {
		recruitment.clickOfferJob();
	}

	@Then("Candidate status is Job Offered")
	public void candidate_status_is_job_offered() {
		recruitment.verifyJobOffered();
	}

	@When("User clicks on Hire and clicks save")
	public void user_clicks_on_hire_and_clicks_save() {
		recruitment.clickHire();
	}

	@Then("Candidate status is Hired")
	public void candidate_status_is_hired() {
		recruitment.verifyHired();
	}

	@Then("User prints the candidate history table")
	public void user_prints_the_candidate_history_table() {
		recruitment.printTable();
	}

	@When("User clicks on Recruitment tab")
	public void user_clicks_on_recruitment_tab() throws InterruptedException {
		recruitment.gotoRecruitment();
	}

	@When("user enters candidate title and name and clicks search")
	public void user_enters_candidate_title_and_name_and_clicks_search() throws InterruptedException {
	    recruitment.enterCandidateSearchDetails();
	}

	@Then("Candidate details is displayed and verify status is Hired")
	public void candidate_details_is_displayed_and_verify_status_is_hired() {
		recruitment.verifyStatus();
	    
	}


}
