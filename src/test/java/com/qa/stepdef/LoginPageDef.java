package com.qa.stepdef;

import com.qa.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageDef {
    @When("I click Allow")
    public void iClickAllow() throws InterruptedException {
        new LoginPage().clickAllow();
    }
    @When("I click Login link and open login page")
    public void iClickLoginLinkAndOpenLoginPage() throws InterruptedException {
        new LoginPage().clickLogin();
    }
    @When("I enter invalid email as {string}")
    public void iEnterInvalidEmailAs(String email) throws InterruptedException {
        new LoginPage().emailFieldTxt(email);
    }
    @When("I enter valid password as {string}")
    public void iEnterValidPasswordAs(String pass) throws InterruptedException {
        new LoginPage().passFieldTxt(pass);
    }
    @When("I click on login")
    public void iClickOnLogin() throws InterruptedException {
        new LoginPage().btnLoginClick();
    }
    @When("I should get error1 message for login as {string}")
    public void iShouldGetError2MessageForLoginAs(String err1) throws InterruptedException {
        new LoginPage().errorMessage1(err1);
    }
    @When("I enter valid email as {string}")
    public void iEnterValidEmailAs(String email) throws InterruptedException {
        new LoginPage().emailFieldTxt(email);
    }
    @When("I enter invalid password as {string}")
    public void iEnterInvalidPasswordAs(String pass) throws InterruptedException {
        new LoginPage().passFieldTxt(pass);
    }
    @Then("I should get error2 message for login as {string}")
    public void iShouldGetError1MessageForLoginAs(String err2) throws InterruptedException {
        new LoginPage().errorMessage2(err2);
    }
    @When("I click on Allow while using app")
    public void iClickOnAllowWhileUsingApp() throws InterruptedException {
        new LoginPage().clickAlwaysAllow();
    }
    @When("I click on the profile icon")
    public void iClickOnTheProfileIcon() throws InterruptedException {
        new LoginPage().clickProfile();
    }
    @When("I verify the profile name and temperature")
    public void iVerifyTheProfileNameAndTemperature() throws InterruptedException {
        new LoginPage().verifyName();
    }
    @When("I click on the Location and check-in")
    public void iClickOnTheLocation() throws InterruptedException {
        new LoginPage().clickLocation();
    }
    @When("I verify the Feature Challenge")
    public void iVerifyTheFeatureChallenge() throws InterruptedException {
        new LoginPage().clickGetGoing();
    }
    @When("I connect to apple health")
    public void iConnectToAppleHealth() throws InterruptedException {
        new LoginPage().clickAppleHealth();
    }
    @Then("I verify all element navigation bar")
    public void iVerifyAllElementNavigationBar() throws InterruptedException {
        new LoginPage().clickNavigationBar();
    }

}
