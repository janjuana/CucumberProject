#TeamJanjua
Feature: SignUpwithDT

  Scenario: Sign up to the FreeCRM
    Given I opening browser
    And I navigate FreeCrm
    When I am on site I clik on sign up
    And I Provide the following details
      | Edition      | FirstName | LastName | Email          | Confirm Email  | Username    | Password | ConfirmPassword | Company | PhoneNumber  |
      | Free Edition | John      | Doe      | jdoe@test.com  | jdoe@test.com  | jdoe1234566 | test123  | test123         | Syntax  | 571-223-9495 |
      | Free Edition | James     | lee      | oleo@gmail.com | oleo@gmail.com | oleo333     | test1234 | test1234        | Syntax  | 404-232-5960 |
    Then I will quit browser
