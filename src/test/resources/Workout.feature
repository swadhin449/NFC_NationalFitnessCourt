@WorkOut
Feature: WorkoutPage Scenarios
  Scenario Outline: Login with valid credential
    When I click allow
    And I click Login link and open Login page
    And I enter valid email "<email>"
    And I enter valid password "<password>"
    And I click login
    And click on workout section
    And check all trainer
    And click on the feature challenge
    And click on Beginner How It Works Video
    And click on Beginner CoreBuilder Video
    And click on Beginner Full Body Challenge Video
    And click on Beginner Home Workout Video
    And click on Beginner Mobility and Balance Video
    And click on Intermediate Core Builder Video
    And click on Intermediate Full Body Challenge Video
    And click on Intermediate Mobility and Balance Video
    #And click on Intermediate Special Forces Training Video
    And click on Intermediate Total Body Endurance Video
    And click on Advanced Core Builder Video
    And click on Advanced Full Body Challenge Video
    And click on Advanced Home Workout Video
    And click on Advanced Mobility and Balance Video
    Then click on Advanced Special Forces Training Video
    Examples:
      | email               | password   |  |
      | ajena6786@gmail.com | 1@Swadhinj |  |