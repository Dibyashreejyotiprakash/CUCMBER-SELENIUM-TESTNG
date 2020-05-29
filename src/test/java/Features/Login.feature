Feature: Orange HRM Login validations
  Validation for login

Background:
	Given Open application

@smoke
 Scenario: Login with valid credentials
    When Login with valid username "admin" password "admin123"
    Then Verify Home Page
    
@regression
Scenario: Login with in-valid credentials
    Then Login with invalid username "admin" password "admin1234"
    
@regression
Scenario: Login with testdriven data
		When Login with valid credentials
		|admin|admin123|
    Then Verify Home Page
    
    
	

  
  
