@Login
Feature: Login Scenarios
  Scenario Outline: Login with invalid credential
    When I click Allow
    And I click Login link and open login page
    And I enter invalid email as "<email>"
    And I enter valid password as "<password>"
    And I click on login
    Then I should get error1 message for login as "<err1>"
    Examples:
      | email                | password  | err1                  |  |
      | jswadhin449gmail.com | 1Swadhinj | Invalid email address |  |

  Scenario Outline: Login with invalid credential
    When I click Allow
    And I click Login link and open login page
    And I enter valid email as "<email>"
    And I enter invalid password as "<password>"
    And I click on login
    Then I should get error2 message for login as "<err2>"
    Examples:
      | email                 | password  | err2                              |  |
      | jswadhin449@gmail.com | 1Swadhinj | Email ID or password is incorrect |  |

  Scenario Outline: Login with valid credential and Verify Home page
    When I click Allow
    And I click Login link and open login page
    And I enter valid email as "<email>"
    And I enter valid password as "<password>"
    And I click on login
    And I click on Allow while using app
    And I click on the profile icon
    And I verify the profile name and temperature
    And I click on the Location and check-in
    And I verify the Feature Challenge
    And I connect to apple health
    Then I verify all element navigation bar
    Examples:
      | email                | password   |
      | jswadhin11@gmail.com | 1@Bhubhanj |
