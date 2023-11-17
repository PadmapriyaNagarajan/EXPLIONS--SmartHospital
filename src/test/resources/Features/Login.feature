Feature: User Login to Smart Hospital Application
 
Scenario: User Login with  Credentials
 
Given User landed in Smart Hospital HomePage
When User Clicks My Appoinments
And User adds new appointment and saves the data
And User Search with keyword
And User do the action as download as PDF
Then User See successfully download message
And User Clicks Pharmacy
Then User Search with BillNo
And User Clicks Pathology from Dashboard
And User Clicks the Calender 
Then User adds the Todo In Calender 
Then User can see the results in Calender