Feature: Testing the functionality of the SmartHospital

  @Birth
  Scenario: check the birth functionality
    Given user is navigate to login page 
    When user need to click the birth and death record
    And user click the birth record
    And user click the Add birth record
    And user enters the require values
    Then user need to click save
