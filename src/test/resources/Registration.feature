@Registration
Feature: Registration Scenarios

  Scenario Outline: Register without any credentials
    When I click on Allow
    And I click on register
    Then I should get error message as "<err>"
    Examples:
      | err                   |  |
      | Field cannot be empty |  |

  Scenario Outline: Register with invalid email
    When I click on Allow
    And I enter the full name as "<fullName>"
    And I enter invalid Email as "<email>"
    And I enter the password as "<password>"
    And I register
    Then I should get error1 message as "<err1>"
    Examples:
      | fullName | email        | password   | err1                  |
      | Swadhin  | invalidEmail | 1@Swadhinj | Invalid email address |

  Scenario Outline: Register with invalid password
    When I click on Allow
    And I enter the full name as "<fullName>"
    And I enter valid Email as "<email>"
    And I enter invalid password as "<password>"
    And I register
    Then I should get error2 message as "<err2>"
    Examples:
      | fullName | email                | password    | err2                                     |
      | Swadhin  | jswadhin11@gmail.com | InvalidPass | Password doesn’t match all the criterias |

  Scenario Outline: Register with existing email
    When I click on Allow
    And I enter the full name as "<fullName>"
    And I enter existing Email as "<email>"
    And I enter the password as "<password>"
    And I register
    Then I should get error3 message as "<err3>"
    Examples:
      | fullName | email                | password   | err3                                                 |
      | Swadhin  | jswadhin11@gmail.com | 1@Swadhinj | This email is already registered. Try login instead. |

  Scenario Outline: Register with valid email and password
    When I click on Allow
    And I enter the full name as "<fullName>"
    And I enter valid Email as "<email>"
    And I enter the password as "<password>"
    And I click on Info
    And I click on View
    And I register
    And I click on try on another mail
    And I entered another mail "<email2>"
    And I click register
    And I verify the - verify your account text
    And Wait for minutes and click on resend verification email
    And I verify the header of Age and Gender page
    And I verify the age range header and check each Age range
    And I click one specific age range
    And I verify the gender header and check each gender
    And I click one specific gender
    And I verify the race header and check each race
    And I click one specific race
    And I click on  next
    And I click on previous button after that click once again next
    And I select the state and city
    And I click on done
    And I click on Allow while using App
    And I search and select one fitness court
    And I click on Connect with Apple Health and I allow
    And I verify the welcome page and I click on first workout video
    And I click on I'll check later
    Then I am in the Home landing page
    Examples:
      | fullName | email                   | password   | email2                  |
      | Swadhin  | Codeprism03@mailto.plus | 1@Swadhinj | Codeprism04@mailto.plus |