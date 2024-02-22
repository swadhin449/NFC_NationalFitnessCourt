package com.qa.stepdef;

import com.qa.pages.RegisterPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class RegisterStepDef {
    public WebDriver driver;

    @When("^I click on Allow$")
    public void iClickOnAllow() throws InterruptedException {
        new RegisterPage().accessAllow();
    }
    @When("^I enter the full name as \"([^\"]*)\"$")
    public void iEnterTheFullName(String fname) throws InterruptedException {
        new RegisterPage().fullName(fname);
    }
    @When("^I enter invalid Email as \"([^\"]*)\"$")
    public void iEnterInvalidEmail(String mail) throws InterruptedException {
        new RegisterPage().emailBox(mail);
    }
    @When("I enter valid Email as {string}")//
    public void iEnterValidEmailAs(String email) throws InterruptedException {
        new RegisterPage().emailBox(email);
    }
    @When("^I enter the password as \"([^\"]*)\"$")
    public void iEnterThePassword(String password) throws InterruptedException {
        new RegisterPage().passwordBox(password);
    }
    @When("^I enter existing Email as \"([^\"]*)\"$")
    public void iEnterExistingEmailAs(String email) throws InterruptedException {
        new RegisterPage().emailBox(email);
    }
    @When("^I click on register$")
    public void iClickOnRegister() throws InterruptedException {
        new RegisterPage().registerBtn();
    }
    @When("^I click on Info$")
    public void iClickOnInfo() throws InterruptedException {
        new RegisterPage().clickInfo();
    }
    @When("^I click on View$")
    public void iClickOnView() throws InterruptedException {
        new RegisterPage().clickView();
    }
    @When("^I click on try on another mail$")
    public void iClickOnTryOnAnotherMailAndVerifyTheText() throws InterruptedException {
        new RegisterPage().tryAnotherMail();
    }
    @When("^I entered another mail \"([^\"]*)\"$")
    public void iEnteredAnotherMail(String email2) throws InterruptedException {
        new RegisterPage().anotherMail(email2);
    }
    @When("I click register")
    public void iClickRegister() throws InterruptedException {
        new RegisterPage().clickRegister();
    }
    @When("^I verify the - verify your account text$")
    public void iVerifyTheVerifyYourAccountText() throws InterruptedException {
        new RegisterPage().viewAccountText();
    }
    @When("Wait for minutes and click on resend verification email")
    public void iClickOnResendVerificationEmailAfterWaitingMinutes() throws InterruptedException {
        new RegisterPage().resendMail();
    }
    @When("I verify the header of Age and Gender page")
    public void iVerifyTheHeaderOfAgeAndGenderPage() throws InterruptedException {
        new RegisterPage().txtHeader();
    }
    @When("I verify the age range header and check each Age range")
    public void iVerifyTheAgeRangeHeaderAndCheckEachAgeRange() throws InterruptedException {
        new RegisterPage().ageClick();
    }
    @When("I click one specific age range")
    public void iClickOneSpecificAgeRange() throws InterruptedException {
        new RegisterPage().specificAgeRange();
    }
    @When("I verify the gender header and check each gender")
    public void iVerifyTheGenderHeaderAndCheckEachGender() throws InterruptedException {
        new RegisterPage().genderClick();
    }
    @When("I click one specific gender")
    public void iClickOneSpecificGender() throws InterruptedException {
        new RegisterPage().specificGender();
    }
    @When("I verify the race header and check each race")
    public void iVerifyTheRaceEthnicityHeaderAndCheckEachRaceEthnicity() throws InterruptedException {
        new RegisterPage().raceClick();
    }
    @When("I click one specific race")
    public void iClickOneSpecificRaceEthnicity() throws InterruptedException {
        new RegisterPage().specificRace();
    }
    @When("I click on  next")
    public void iClickOnNext() throws InterruptedException {
        new RegisterPage().nextClick();
    }
    @When("I click on previous button after that click once again next")
    public void iClickOnPreviousButtonAfterThatClickOnceAgainNext() throws InterruptedException {
        new RegisterPage().previousClick();
    }
    @When("I select the state and city")
    public void iSelectTheStateAndCity() throws InterruptedException {
        new RegisterPage().selectCityState();
    }
    @When("I click on done")
    public void iClickOnDone() throws InterruptedException {
        new RegisterPage().clickDone();
    }
    @When("I click on Allow while using App")
    public void iClickOnAllowWhileUsingApp() throws InterruptedException {
        new RegisterPage().clickAllowWhileUsingApp();
    }
    @When("I search and select one fitness court")
    public void iSearchAndSelectOneCity() throws InterruptedException {
        new RegisterPage().clickFitnessCourt();
    }
    @When("I click on Connect with Apple Health and I allow")
    public void iClickOnConnectWithAppleHealthAndIAllow() throws InterruptedException {
        new RegisterPage().appleHealth();
    }
    @When("I verify the welcome page and I click on first workout video")
    public void iVerifyTheWelcomePageAndIClickOnFirstWorkoutVideo() throws InterruptedException {
        new RegisterPage().welcomeScreen();
    }
    @When("I click on I'll check later")
    public void iClickOnILlCheckLater() throws InterruptedException {
        new RegisterPage().checkLater();
    }
    @Then("I am in the Home landing page")
    public void iAmInTheHomeLandingPage() throws InterruptedException {
        new RegisterPage().homeLanding();
    }
    @Then("^I register$")
    public void iRegister() throws InterruptedException {
        new RegisterPage().registerBtn();
    }
    @Then("I should get error message as \"([^\"]*)\"$")
    public void iShouldGetErrorMessageAs(String err) throws InterruptedException {
        new RegisterPage().errorMessage(err);
    }
    @Then("^I should get error1 message as \"([^\"]*)\"$")
    public void iShouldGetError1Message(String err1) throws InterruptedException {
        new RegisterPage().errorMessage1(err1);
    }
    @Then("^I should get error2 message as \"([^\"]*)\"$")
    public void iShouldGetError2Message(String err2) throws InterruptedException {
        new RegisterPage().errorMessage2(err2);
    }
    @Then("^I should get error3 message as \"([^\"]*)\"$")
    public void iShouldGetError3Message(String err3) throws InterruptedException {
        new RegisterPage().errorMessage3(err3);
    }


}
