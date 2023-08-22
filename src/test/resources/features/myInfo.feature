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
@tag2
Feature: Orange HRM MyInfo Feature

  Scenario: Orange HRM MyInfo Test Scenario
    Given User is on home page
  	And User clicks on MyInfo Tab
  	When User clicks on Contact Details
  	And User enters contact info and clicks save button
  	Then New user contact is created

		When User clicks on Emergency Contacts
		When User clicks on Add emergency contact button
		And User enters emergency contact info and clicks save button
		Then New emergency contact is created
		
		When User clicks on Dependents tab
		When User clicks on Add Dependents button
		And User enters dependent info and clicks save button
		Then New dependent user is created
		
 