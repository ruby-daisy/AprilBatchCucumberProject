Feature: Login Page Validation for Null and Empty

@ScenarioOutline
		Scenario Outline: Login using invalid password credentials   
 		Given Launch browser
 		And User enters the URL "https://adactinhotelapp.com/" 
    When User enters username "<username>"
    And user enters password "<password>"
    And clicks login button
    Then validate the home page
    And validate the user icon
    But signin icon is not enabled
    Examples:
		|username|password|
		|Anandha1997|Serv@456kl|
		|abc|123|
		|pqr|456|
		|xyz|789|
		|||
		| | |