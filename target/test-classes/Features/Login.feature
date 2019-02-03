#Author:TeamJanjua
Feature: LoginFeature

  Background: 
    Given I open browser
    And I navigate to the FreeCRM

  @Smoke
  Scenario: Valid Login
    Validating valid login

    When I enter "janjuana" and "Leeban1man"
    And I click login button
    Then I successfully logged in
    And I close browser

  @Regression
  Scenario Outline: Invalid Login
    Validating invalid login with invalid username and valid password

    When I enter "<username>" and "<password>"
    And I click login button
    Then I see error message
    And I close browser

    Examples: 
      | username | password |
      | Messy    | Messy123 |
      | Jessy    | Jessy123 |

  Scenario: Invalid password
    Validating Invalid login with valid username and invalid password

    When I enter "janjuana" and "Leeban114man"
    And I click login button
    Then I see error message
    And I close browser
