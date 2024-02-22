package com.qa.stepdef;

import com.qa.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MoreSectionStepDef {
    @When("I click  Allow")
    public void iClickAllow() throws InterruptedException {
        new LoginPage().clickAllow();
    }
    @When("I click Login link and open login")
    public void iClickLoginLinkAndOpenLoginPage() throws InterruptedException {
        new LoginPage().clickLogin();
    }
    @When("I enter valid email as  {string}")
    public void iEnterInvalidEmailAs(String email) throws InterruptedException {
        new LoginPage().emailFieldTxt(email);
    }
    @When("I enter valid password as  {string}")
    public void iEnterValidPasswordAs(String pass) throws InterruptedException {
        new LoginPage().passFieldTxt(pass);
    }
    @When("I click on  login")
    public void iClickOnLogin() throws InterruptedException {
        new LoginPage().btnLoginClick();
    }
    @When("I click on more and click on profile")
    public void iClickOnMoreAndClickOnProfile() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I click on my preference and set daily reminder")
    public void iClickOnMyPreferenceAndSetDailyReminder() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I click on my health stats")
    public void iClickOnMyHealthStats() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I click on invite friend")
    public void iClickOnInviteFriend() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I click on shop nfc apparel")
    public void iClickOnShopNfcApparel() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I click on about nfc")
    public void iClickOnAboutNfc() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I click become an ambassador")
    public void iClickBecomeAnAmbassador() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I click on learn about")
    public void iClickOnLearnAbout() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I click on all four social link")
    public void iClickOnAllFourSocialLink() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
