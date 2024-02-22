package com.qa.stepdef;

import com.qa.pages.ForgotPass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ForgotPassStepDef {
    @When("I click on Login")
    public void iClickOnLogin() throws InterruptedException {
        new ForgotPass().linkLogin();
    }
    @When("I click on forgot password")
    public void iClickOnForgotPassword() throws InterruptedException {
        new ForgotPass().linkForgot();
    }
    @When("I enter invalid email as {string} and click on submit")
    public void iEnterInvalidEmailAsAndClickOnSubmit(String email) throws InterruptedException {
        new ForgotPass().enterInvalidEmail(email);
    }
    @Then("I should get error message for as {string}")
    public void iShouldGetErrorMessageForAs(String error) throws InterruptedException {
        new ForgotPass().errMsg(error);
    }
    @When("I enter valid email as {string} and click on submit")
    public void iEnterValidEmailAsAndClickOnSubmit(String email) throws InterruptedException {
        new ForgotPass().enterValidEmail(email);
    }
    @When("I enter new Password and confirm password")
    public void iEnterNewPasswordAndConfirmPassword() throws InterruptedException {
        new ForgotPass().newPass();
    }
    @When("I click on submit")
    public void iClickOnSubmit() throws InterruptedException {
        new ForgotPass().clickSubmit();
    }
    @Then("I login with email as {string} and new password as {string}")
    public void iLoginWithEmailAsAndNewPasswordAs(String email1, String pass) throws InterruptedException {
        new ForgotPass().loginAction(email1,pass);
    }


}
