package com.qa.pages;

import com.qa.utils.DriverManager;
import com.qa.utils.TestUtils;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ForgotPass {
    private AppiumDriver driver;
    TestUtils utils = new TestUtils();

    public ForgotPass(){
        this.driver = new DriverManager().getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }
    public String allowBtn = "Allow";
    public String loginLink = "(//XCUIElementTypeOther[@name=\"Login\"])[2]";
    public String forLink = "(//XCUIElementTypeOther[@name=\"Forgot Password?\"])[2]";
    public String emailForgot = "(//XCUIElementTypeOther[@name=\"Email Address\"])[2]/XCUIElementTypeOther/XCUIElementTypeTextField";
    public String submitBtn = "SUBMIT";
    public String errorMsg = "//XCUIElementTypeStaticText[@name=\"Something went wrong\"]";
    public String resendLink = "Resend Reset Password Link";
    public String emailField = "(//XCUIElementTypeOther[@name=\"Email Address\"])[2]/XCUIElementTypeOther/XCUIElementTypeTextField";
    public String passField = "(//XCUIElementTypeOther[@name=\"Password\"])[2]/XCUIElementTypeOther[1]/XCUIElementTypeSecureTextField";
    public String view = "(//XCUIElementTypeOther[@name=\"Password\"])[2]/XCUIElementTypeOther[2]";
    public String loginBtn = "(//XCUIElementTypeOther[@name=\"LOGIN\"])[2]";



    public void linkLogin() throws InterruptedException {
        WebElement ele = driver.findElement(AppiumBy.accessibilityId(allowBtn));
        ele.click();
        Thread.sleep(3000);
        WebElement ele2 = driver.findElement(By.xpath(loginLink));
        ele2.click();
        Thread.sleep(3000);
    }
    public void linkForgot() throws InterruptedException {
        WebElement ele = driver.findElement(By.xpath(forLink));
        ele.click();
        Thread.sleep(3000);
    }
    public void enterInvalidEmail(String email) throws InterruptedException {
        WebElement ele = driver.findElement(By.xpath(emailForgot));
        ele.sendKeys(email);
        Thread.sleep(3000);
        WebElement ele2 = driver.findElement(AppiumBy.accessibilityId(submitBtn));
        ele2.click();
        Thread.sleep(3000);
        ele2.click();
        Thread.sleep(3000);

    }
    public void errMsg(String error) throws InterruptedException {
        WebElement ele = driver.findElement(By.xpath(errorMsg));
        String data = ele.getAttribute("label");
        Assert.assertEquals(error,data);
        Thread.sleep(3000);
    }
    public void enterValidEmail(String email1) throws InterruptedException {
        WebElement ele = driver.findElement(By.xpath(emailForgot));
        ele.sendKeys(email1);
        Thread.sleep(3000);
        WebElement ele2 = driver.findElement(AppiumBy.accessibilityId(submitBtn));
        ele2.click();
        Thread.sleep(3000);
        ele2.click();
        Thread.sleep(30000);
    }
    public void newPass() throws InterruptedException {
        WebElement ele = driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"New Password\"])[2]/XCUIElementTypeOther[1]/XCUIElementTypeSecureTextField"));
        ele.sendKeys("1@Bhubhanj");
        Thread.sleep(2000);
        WebElement ele2 = driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"Confirm Password\"])[2]/XCUIElementTypeOther[1]/XCUIElementTypeSecureTextField"));
        ele2.sendKeys("1@Bhubhanj");
        Thread.sleep(2000);
    }
    public void clickSubmit() throws InterruptedException {
        WebElement ele = driver.findElement(AppiumBy.accessibilityId("Done"));
        ele.click();
        Thread.sleep(3000);
    }
    public void loginAction(String email2, String pass) throws InterruptedException {
        WebElement ele5 = driver.findElement(AppiumBy.accessibilityId("LOGIN"));
        ele5.click();
        Thread.sleep(3000);
        WebElement ele = driver.findElement(By.xpath(emailField));
        ele.sendKeys(email2);
        Thread.sleep(3000);
        WebElement ele2 = driver.findElement(By.xpath(passField));
        ele2.sendKeys(pass);
        Thread.sleep(3000);
        WebElement ele3 = driver.findElement(By.xpath(view));
        ele3.click();
        Thread.sleep(3000);
        WebElement ele4 = driver.findElement(By.xpath(loginBtn));
        ele4.click();
        Thread.sleep(3000);
    }

}
