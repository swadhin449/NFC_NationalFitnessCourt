@Movement
Feature: MovementPage Scenarios
  Scenario Outline: Login with valid credential and Check all movements
    When I click on allow
    And I click on Login link and open Login page
    And I enter valid email  "<email>"
    And I enter valid password  "<password>"
    And I click on login button
    And click on Movement section
    And click on core section
    And click on squat section
    And click on push section
    And click on lunge section
    And click on pull section
    And click on agility section
    Then click on bend section
    Examples:
      | email               | password   |
      | ajena6786@gmail.com | 1@Swadhinj |