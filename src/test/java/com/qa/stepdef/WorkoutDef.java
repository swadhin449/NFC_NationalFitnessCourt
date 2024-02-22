package com.qa.stepdef;

import com.qa.pages.WorkoutPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WorkoutDef {
    @When("I click allow")
    public void iClickAllow() throws InterruptedException {
       new WorkoutPage().clickAllow();
    }
    @When("I click Login link and open Login page")
    public void iClickLoginLinkAndOpenLoginPage() throws InterruptedException {
        new WorkoutPage().clickLoginLink();
    }
    @When("I enter valid email {string}")
    public void iEnterValidEmail(String email) throws InterruptedException {
        new WorkoutPage().validEmail(email);
    }
    @When("I enter valid password {string}")
    public void iEnterValidPassword(String password) throws InterruptedException {
        new WorkoutPage().validPass(password);
    }
    @When("I click login")
    public void iClickLogin() throws InterruptedException {
        new WorkoutPage().clickLogin();
    }
    @When("click on workout section")
    public void clickOnWorkoutSection() throws InterruptedException {
        new WorkoutPage().clickWorkout();
    }
    @When("check all trainer")
    public void checkAllTrainer() throws InterruptedException {
        new WorkoutPage().clickTrainer();
    }
    @When("click on the feature challenge")
    public void clickOnTheFeatureChallenge() throws InterruptedException {
        new WorkoutPage().clickFeatureChallenge();
    }
    @When("click on Beginner How It Works Video")
    public void clickOnBeginnerHowItWorksVideo() throws InterruptedException {
        new WorkoutPage().clickBeginner1();
    }
    @When("click on Beginner CoreBuilder Video")
    public void clickOnBeginnerCoreBuilderVideo() throws InterruptedException {
        new WorkoutPage().clickBeginner2();
    }
    @When("click on Beginner Full Body Challenge Video")
    public void clickOnBeginnerFullBodyChallengeVideo() throws InterruptedException {
        new WorkoutPage().clickBeginner3();
    }
    @When("click on Beginner Home Workout Video")
    public void clickOnBeginnerHomeWorkoutVideo() throws InterruptedException {
        new WorkoutPage().clickBeginner4();
    }
    @When("click on Beginner Mobility and Balance Video")
    public void clickOnBeginnerMobilityAndBalanceVideo() throws InterruptedException {
        new WorkoutPage().clickBeginner5();
    }
    @When("click on Intermediate Core Builder Video")
    public void clickOnIntermediateCoreBuilderVideo() throws InterruptedException {
        new WorkoutPage().clickIntermediate1();
    }
    @When("click on Intermediate Full Body Challenge Video")
    public void clickOnIntermediateFullBodyChallengeVideo() throws InterruptedException {
        new WorkoutPage().clickIntermediate2();
    }
    @When("click on Intermediate Mobility and Balance Video")
    public void clickOnIntermediateMobilityAndBalanceVideo() throws InterruptedException {
        new WorkoutPage().clickIntermediate3();
    }
//    @When("click on Intermediate Special Forces Training Video")
//    public void clickOnIntermediateSpecialForcesTrainingVideo() throws InterruptedException {
//        new WorkoutPage().clickIntermediate4();
//    }
    @When("click on Intermediate Total Body Endurance Video")
    public void clickOnIntermediateTotalBodyEnduranceVideo() throws InterruptedException {
        new WorkoutPage().clickIntermediate5();
    }
    @When("click on Advanced Core Builder Video")
    public void clickOnAdvancedCoreBuilderVideo() throws InterruptedException {
        new WorkoutPage().clickAdvanced1();
    }
    @When("click on Advanced Full Body Challenge Video")
    public void clickOnAdvancedFullBodyChallengeVideo() throws InterruptedException {
        new WorkoutPage().clickAdvanced2();
    }
    @When("click on Advanced Home Workout Video")
    public void clickOnAdvancedHomeWorkoutVideo() throws InterruptedException {
        new WorkoutPage().clickAdvanced3();
    }
    @When("click on Advanced Mobility and Balance Video")
    public void clickOnAdvancedMobilityAndBalanceVideo() throws InterruptedException {
        new WorkoutPage().clickAdvanced4();
    }
    @Then("click on Advanced Special Forces Training Video")
    public void clickOnAdvancedSpecialForcesTrainingVideo() throws InterruptedException {
        new WorkoutPage().clickAdvanced5();
    }


}
