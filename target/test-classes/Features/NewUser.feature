Feature: Create an new Account

 Scenario: Successfully create new account
   Given I opening browser
   And I navigate FreeCrm
   When I am on site I clik on sign up
   And I click on Free Edition
   And I fill in new user information
   And I click agree terms box
   And I click on submit button
   And I fill in company name and number
   And I click on continue
   Then I have successfully created new user
   Then I will quit browser