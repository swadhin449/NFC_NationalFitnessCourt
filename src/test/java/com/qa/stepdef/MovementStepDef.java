package com.qa.stepdef;

import com.qa.pages.MovementPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MovementStepDef {
    @When("I click on allow")
    public void iClickOnAllow() throws InterruptedException {
        new MovementPage().clickAllow();
    }
    @When("I click on Login link and open Login page")
    public void iClickOnLoginLinkAndOpenLoginPage() throws InterruptedException {
        new MovementPage().clickLoginLink();
    }
    @When("I enter valid email  {string}")
    public void iEnterValidEmail(String email) throws InterruptedException {
        new MovementPage().validEmail(email);
    }
    @When("I enter valid password  {string}")
    public void iEnterValidPassword(String pass) throws InterruptedException {
        new MovementPage().validPass(pass);
    }
    @When("I click on login button")
    public void iClickOnLoginButton() throws InterruptedException {
        new MovementPage().clickLogin();
    }
    @When("click on Movement section")
    public void clickOnMovementSection() throws InterruptedException {
        new MovementPage().clickMovement();
    }
    @When("click on core section")
    public void clickOnCoreSection() throws InterruptedException {
        new MovementPage().clickCore();
    }
    @When("click on squat section")
    public void clickOnSquatSection() throws InterruptedException {
        new MovementPage().clickSquat();
    }
    @When("click on push section")
    public void clickOnPushSection() throws InterruptedException {
        new MovementPage().clickPush();
    }
    @When("click on lunge section")
    public void clickOnLungeSection() throws InterruptedException {
        new MovementPage().clickLunge();
    }
    @When("click on pull section")
    public void clickOnPullSection() throws InterruptedException {
        new MovementPage().clickPull();
    }
    @When("click on agility section")
    public void clickOnAgilitySection() throws InterruptedException {
        new MovementPage().clickAgility();
    }
    @Then("click on bend section")
    public void clickOnBendSection() throws InterruptedException {
        new MovementPage().clickBend();
    }
}
