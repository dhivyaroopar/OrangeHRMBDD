#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag3
Feature: Orange HRM Recruitment feature

  Scenario: Orange HRM Recruitment feature
    Given User is in home page
    And User clicks recruitment tab
    When User clicks AddCandidate button
    When User clicks Candidate details and clicks save
    Then Candidate is successfully created
    
    When User clicks on shortlist the candidate
    Then Candidate status is shortlisted
    When User clicks on schedule interview
		And User enters interview information and schedules it
		Then Candidate status is Interview Scheduled
		
		When User clicks on Mark Interview Passed and clicks save
		Then Candidate status is Interview Passed
		When User clicks Offer Job and clicks save
		Then Candidate status is Job Offered
		When User clicks on Hire and clicks save
		Then Candidate status is Hired
		And User prints the candidate history table
		
		When User clicks on Recruitment tab
		And user enters candidate title and name and clicks search
		Then Candidate details is displayed and verify status is Hired
		

