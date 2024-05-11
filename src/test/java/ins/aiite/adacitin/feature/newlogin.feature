

Feature: Login Page Validation with Values
Background:
		Given Launch browser
 		And User enters the URL "https://adactinhotelapp.com/"

		@Sanity 
  	Scenario: Login using valid credentials
  	Given Launch the browser "chrome"
 		And User enters the URL "https://adactinhotelapp.com/"
    When User enters username "Anandha1997"
    And user enters password "Serv@456kl"
    And clicks login button
    Then validate the home page
    And validate the user icon
    But signin icon is not enabled

		@Regression
    Scenario: Login using invalid credentials
    Given Launch the browser "edge"
 		And User enters the URL "https://adactinhotelapp.com/"
    When User enters username "daisyrubycatarine"
    And user enters password "RDAGO"
    And clicks login button
    Then validate the home page
    And validate the user icon
    But signin icon is not enabled
    
    @RegressionWithBackground     
    Scenario: Login using invalid username credentials     
    When User enters username "daisyrubycatharin"
    And user enters password "RDAYGO"
    And clicks login button
    Then validate the home page
    And validate the user icon
    But signin icon is not enabled
    
    @RegressionWithBackground   
    Scenario: Login using invalid password credentials    
    When User enters username "daisyrubycatharin"
    And user enters password "RDAYG"
    And clicks login button
    Then validate the home page
    And validate the user icon
    But signin icon is not enabled
    
    
        
    
    
    
    
   

 