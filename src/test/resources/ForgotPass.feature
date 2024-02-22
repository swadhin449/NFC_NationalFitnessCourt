@ForgotPass
Feature: ForgotPass Scenarios
  Scenario Outline: Forgot Password with invalid credentials
    When I click on Login
    And I click on forgot password
    And I enter invalid email as "<email>" and click on submit
    Then I should get error message for as "<err>"
    Examples:
      | email                | err                  |
      | jswadhin11@gmail.com | Something went wrong |

  Scenario Outline: Forgot Password with valid credentials
    When I click on Login
    And I click on forgot password
    And I enter valid email as "<email>" and click on submit
    And I enter new Password and confirm password
    And I click on submit
    Then I login with email as "<email1>" and new password as "<pass>"

    Examples:
      | email                    | email1                   | pass       |
      | bhubhanjena287@gmail.com | bhubhanjena287@gamil.com | 1@Bhubhanj |

