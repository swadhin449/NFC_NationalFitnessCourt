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

public class LoginPage {
    private AppiumDriver driver;
    TestUtils utils = new TestUtils();

    public LoginPage(){
        this.driver = new DriverManager().getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }
    public String allowBtn = "Allow";
    public String loginLink = "(//XCUIElementTypeOther[@name=\"Login\"])[2]";
    public String emailTxt = "(//XCUIElementTypeOther[@name=\"Email Address\"])[2]/XCUIElementTypeOther/XCUIElementTypeTextField";
    public String passTxt = "(//XCUIElementTypeOther[@name=\"Password\"])[2]/XCUIElementTypeOther[1]/XCUIElementTypeSecureTextField";
    public String viewPass = "(//XCUIElementTypeOther[@name=\"Password\"])[2]/XCUIElementTypeOther[2]";

    public String btnLogin = "(//XCUIElementTypeOther[@name=\"LOGIN\"])[2]";

    //public String forgotLink = "(//XCUIElementTypeOther[@name=\"Forgot Password?\"])[2]";
    public String onceLink = "Allow Once";
    public String whileUsingLink = "Allow While Using App";
    public String dontLink = "Don’t Allow";
    public String keepWhileUsingLink = "Keep Only While Using";
    public String changeAlwaysAllowLink = "Change to Always Allow";
    public String dont = "Don’t Allow";
    public String ok = "OK";
    public String profile = "(//XCUIElementTypeOther[@name=\"B\"])[2]";
    public String name = "Bhubhan!";
    public String locationLink = "//XCUIElementTypeOther[@name=\"Abs Nfc fitness C...\"]";
    public String checkin = "CHECK-IN NOW";
    public String cancel = "(//XCUIElementTypeOther[@name=\"Looks like you are too far Try checking in once you are in a Fitness Court®. RETRY Bottom Sheet Why Check-In? Track the time you spend working out at the Fitness Court® and help your City and State compete to be the healthiest in America Coming Soon Get exciting rewards based on the Check-In counts: NFC Caps 30 Check-Ins NFC T-shirts 60 Check-Ins Free sessions 120 Check-Ins How to  Check-In to a  Fitness Court®  1 Step inside the Fitness Court®. 2 Tap on the Check-In icon on the app and confirm. You need to provide access to your location in order to Check-In. Go to Settings > Fitness Court App > Location permission (Allow) Horizontal scroll bar, 1 page Bottom Sheet handle\"])[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther";
    public String headerFeature = "Featured Challenge";
    public String getGoing = "//XCUIElementTypeOther[@name=\"GET GOING\"]";
    public String startWorkout = "//XCUIElementTypeOther[@name=\"START WORKOUT\"]";
    public String share = "share";
    public String cancel2 = "//XCUIElementTypeOther[@name=\"Cancel\"]";
    public String close = "Close";
    public String health = "(//XCUIElementTypeOther[@name=\"Match made For health By connecting your activity, you help contribute your activity stats to help your city and state compete with other cities and states across America!\"])[2]";
    public String appleHealth = "CONNECT WITH APPLE HEALTH";
    public String skip = "Skip For Now";
    public String turnOn = "Turn On All";
    public String healthAllow = "Allow";
    public String healthDirection = "(//XCUIElementTypeOther[@name=\"Health Stats Last updated: 03:42 PM\"])[1]/XCUIElementTypeOther[2]";
    public String back = "//XCUIElementTypeOther[@name=\"My Health Stats\"]/XCUIElementTypeOther[1]";
    public String toYourCity = "Bring A Fitness Court® To Your City";
    public String work = "WORKOUT";
    public String home = "HOME";
    public String check = "CHECK-IN";
    public String cancelCheck = "";
    public String move = "MOVEMENTS";
    public String loc = "LOCATIONS";
    public String err1 = "//XCUIElementTypeStaticText[@name=\"Invalid email address\"]";
    public String err2 = "//XCUIElementTypeStaticText[@name=\"Email ID or password is incorrect\"]";


    public void clickAllow() throws InterruptedException {
        Thread.sleep(2000);
        WebElement btn = driver.findElement(AppiumBy.accessibilityId(allowBtn));
        btn.click();
        Thread.sleep(3000);
    }
    public void clickLogin() throws InterruptedException {
        WebElement lnk1 = driver.findElement(By.xpath(loginLink));
        lnk1.click();
        Thread.sleep(3000);
    }
    public void emailFieldTxt(String email) throws InterruptedException {
        WebElement ele = driver.findElement(By.xpath(emailTxt));
        ele.sendKeys(email);
        Thread.sleep(3000);
    }
    public void passFieldTxt(String password) throws InterruptedException {
        WebElement ele = driver.findElement(By.xpath(passTxt));
        ele.sendKeys(password);
        Thread.sleep(3000);
        WebElement ele2 = driver.findElement(By.xpath(viewPass));
        ele2.click();
        Thread.sleep(3000);
    }
    public void btnLoginClick() throws InterruptedException {
        WebElement ele = driver.findElement(By.xpath(btnLogin));
        ele.click();
        Thread.sleep(7000);
    }
    public void errorMessage1(String error1) throws InterruptedException {
        WebElement ele = driver.findElement(By.xpath(err1));
        String data = ele.getAttribute("label");
        Assert.assertEquals(data,error1);
        Thread.sleep(3000);
    }
    public void errorMessage2(String error2) throws InterruptedException {
//        WebElement ele = driver.findElement(By.xpath(err2));
//        String data1 = ele.getAttribute("label");
//        Assert.assertEquals(data1,error2);
        Thread.sleep(4000);
    }
    public void clickAlwaysAllow() throws InterruptedException {
        WebElement clk = driver.findElement(AppiumBy.accessibilityId(whileUsingLink));
        clk.click();
        Thread.sleep(2000);
        WebElement ele = driver.findElement(AppiumBy.accessibilityId(changeAlwaysAllowLink));
        ele.click();
        Thread.sleep(3000);
        WebElement ele1 = driver.findElement(AppiumBy.accessibilityId(ok));
        ele1.click();
        Thread.sleep(3000);
    }
    public void clickProfile() throws InterruptedException {
        WebElement ele = driver.findElement(By.xpath(profile));
        ele.click();
        Thread.sleep(3000);
        WebElement ele2 = driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"B\"])[1]/XCUIElementTypeOther[1]"));
        ele2.click();
        Thread.sleep(3000);
    }
    public void verifyName() throws InterruptedException {
        WebElement ele = driver.findElement(AppiumBy.accessibilityId(name));
        String data = ele.getAttribute("label");
        Assert.assertEquals(data,"Bhubhan!");
        Thread.sleep(3000);
    }
    public void clickLocation() throws InterruptedException {
        WebElement ele = driver.findElement(By.xpath(locationLink));
        ele.click();
        Thread.sleep(5000);
//        WebElement ele2 = driver.findElement(AppiumBy.accessibilityId(home));
//        ele2.click();
//        Thread.sleep(3000);
        WebElement ele3 = driver.findElement(AppiumBy.accessibilityId(checkin));
        ele3.click();
        Thread.sleep(3000);
        WebElement ele4 = driver.findElement(By.xpath(cancel));
        ele4.click();
        Thread.sleep(3000);
    }
    public void clickGetGoing() throws InterruptedException {
        WebElement ele = driver.findElement(By.xpath(getGoing));
        ele.click();
        Thread.sleep(3000);
        WebElement ele1 = driver.findElement(By.xpath(cancel2));
        ele1.click();
        Thread.sleep(3000);
    }
    public void clickAppleHealth() throws InterruptedException {
        WebElement btn = driver.findElement(By.xpath(health));
        btn.click();
        Thread.sleep(3000);
        WebElement ele = driver.findElement(AppiumBy.accessibilityId(appleHealth));
        ele.click();
        Thread.sleep(2000);
        WebElement ele2 = driver.findElement(AppiumBy.accessibilityId(turnOn));
        ele2.click();
        Thread.sleep(3000);
        WebElement ele3 = driver.findElement(AppiumBy.accessibilityId(healthAllow));
        ele3.click();
        Thread.sleep(3000);
    }
    public void clickNavigationBar() throws InterruptedException {
        WebElement ele = driver.findElement(AppiumBy.accessibilityId(work));
        ele.click();
        Thread.sleep(3000);
        WebElement ele2 = driver.findElement(AppiumBy.accessibilityId(check));
        ele2.click();
        Thread.sleep(2000);
        WebElement ele4 = driver.findElement(AppiumBy.accessibilityId(move));
        ele4.click();
        Thread.sleep(3000);
        WebElement ele5 = driver.findElement(AppiumBy.accessibilityId(loc));
        ele5.click();
        Thread.sleep(3000);
        WebElement ele6 = driver.findElement(AppiumBy.accessibilityId(home));
        ele6.click();
        Thread.sleep(3000);
    }




















}
