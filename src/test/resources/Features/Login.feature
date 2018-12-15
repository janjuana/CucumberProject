#Author:TeamJanjua
Feature: LoginFeature

  Scenario: Valid Login
    Validating valid login

    Given I open browser
    And I navigate to the FreeCRM
    When I enter "janjuana" and "Leeban1man"
    And I click login button
    Then I successfully logged in
    And I close browser

  Scenario Outline: Invalid Login
    Validating invalid login with invalid username and valid password

    Given I open browser
    And I navigate to the FreeCRM
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

    Given I open browser
    And I navigate to the FreeCRM
    When I enter "janjuana" and "Leeban114man"
    And I click login button
    Then I see error message
    And I close browser
