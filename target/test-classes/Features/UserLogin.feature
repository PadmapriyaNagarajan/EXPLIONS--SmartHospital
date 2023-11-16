Feature: Performing the task in menu bar for user login

Background: 	
Given User get into user login fields

@Radiology
Scenario: Check the functionality of Radiology

	When User clicks the radiology
	And User send data to radiology search field
	Then User clicks the pdf icon
	
@Ambulance
Scenario: Check the functionality of Ambulance

	When User clicks the ambulance
	Then User clicks the excel icon
	
@BloodBank
Scenario: Check the functionality of BloodBank

	When User clicks the Blood bank
	And User switches to next tab
	Then User send data to blood bank search field

@Whatsapp
Scenario: Check the functionality of Whatsapp

	When User clicks whatsapp
	And User send message in chat
	Then User click the send button