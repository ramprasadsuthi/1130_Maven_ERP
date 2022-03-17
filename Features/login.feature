Feature: Login Module 

  @TC1
  Scenario: Verify admin user is able to login with valid user credentials
    Given ERP Application is launched 
    When User Enters username, password and click on login
    Then Validate the result 

