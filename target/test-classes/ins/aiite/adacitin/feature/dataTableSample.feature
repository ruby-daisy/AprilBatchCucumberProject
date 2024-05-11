Feature: Login Page Validation using Data Table

		@asList
		Scenario: Login using credentials
   	Given Launch the given browser
 		And User enters the given URL
    When User enters form for asList
    |aiite1|
    |aiite2|
    
    @asLists
		Scenario: Login using credentials
   	Given Launch the given browser
 		And User enters the given URL
    When User enters form for asLists
    |Fname|Ruby|
    |Lname|Daisy|
    
    @asMap
		Scenario: Login using credentials
   	Given Launch the given browser
 		And User enters the given URL
    When User enters form for asMap
    |Fname|Ruby|
    |Lname|Daisy|
    |email|daisyrubyantony@gmail.com|
    
    @asMaps
		Scenario: Login using credentials
   	Given Launch the given browser
 		And User enters the given URL
    When User enters form for asMaps
    |Firstname|Lastname|gender|Age|email|
    |ruby|daisy|f|35|rubydaisyantony@gmail.com|
    |emy|hepzibah|f|11|abc@gmail.com|
    
    
    
