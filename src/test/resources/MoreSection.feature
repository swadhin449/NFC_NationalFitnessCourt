@MoreSection
Feature: MoreSection Scenarios
  Scenario Outline: Login with invalid credential and Profile Scenario
    When I click  Allow
    And I click Login link and open login
    And I enter valid email as  "<email>"
    And I enter valid password as  "<password>"
    And I click on  login
    And I click on more and click on profile
    And I click on my preference and set daily reminder
    And I click on my health stats
    And I click on invite friend
    And I click on shop nfc apparel
    And I click on about nfc
    And I click become an ambassador
    And I click on learn about
    Then I click on all four social link
    Examples:
      | email               | password   |
      | ajena6786@gmail.com | 1@Swadhinj |