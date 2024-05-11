

Feature: Login Page Validation for Null and Empty

		Scenario: Login using null credentials
    Given Launch browser
 		And User enters the URL "https://adactinhotelapp.com/"
    When User enters username ""
    And user enters password ""
    And clicks login button
    Then validate the home page
    And validate the user icon
    But signin icon is not enabled
    
    
    Scenario: Login using empty credentials
   	Given Launch browser
 		And User enters the URL "https://adactinhotelapp.com/"
    When User enters username "   " and password " "
    And clicks login button
    Then validate the home page
    And validate the user icon
    But signin icon is not enabled
    
    
    
    