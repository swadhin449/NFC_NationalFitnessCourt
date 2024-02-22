package com.qa.pages;

import com.qa.utils.DriverManager;
import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.InteractsWithApps;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MovementPage {
    private AppiumDriver driver;
    TestUtils utils = new TestUtils();

    public MovementPage(){
        this.driver = new DriverManager().getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }
    public String allowBtn = "Allow";
    public String login = "Login";
    public String emailTxtField = "Email Address";
    public String passTxtField = "Password";
    public String passView = "**/XCUIElementTypeOther[`label == \"Password\"`][2]/XCUIElementTypeOther[2]";
    public String loginBtn = "LOGIN";
    public String ok = "OK";
    public String movement = "MOVEMENTS";
    //1
    public String core = "1 Core";
    public String coreVideo = "GLUTE BRIDGE Beginner";
    public String cancel1 = "(//XCUIElementTypeOther[@name=\"1 | Core Move here to start the core workout GLUTE BRIDGE Beginner ALTERING KNEE TUCK Beginner PLANK Intermediate BICYCLES Intermediate SHOULDER TAPS Intermediate WINDSHIELD WIPERS Intermediate MOUNTAIN CLIMB Intermediate V-UPS Advance SINGLE LEG GLUTE BRIDGE Advance Active Muscle Groups Horizontal scroll bar, 1 page\"])[7]/XCUIElementTypeOther[1]";
    //2
    public String squat = "2 Squat";
    public String squatVideo = "BOX JUMP Beginner";
    public String cancel2 = "(//XCUIElementTypeOther[@name=\"2 | Squat Move here to start the squat workout BOX JUMP Beginner STANDING PLANK Beginner DROP JUMP Advance T-ARM SQUAT Advance STEP-UPS Advance DANCER’S STRETCH Advance LATERAL STEP-OVERS Advance PLYO TOE TOUCHES Advance SINGLE LEG JUMP BOX Advance SINGLE LEG GET UP Advance Active Muscle Groups Horizontal scroll bar, 1 page\"])[7]/XCUIElementTypeOther[1]";
    //3
    public String push = "3 Push";
    public String pushVideo = "NEUTRAL GRIP PUSH-UPS Beginner";
    public String cancel3 = "(//XCUIElementTypeOther[@name=\"3 | Push Move here to start the push workout NEUTRAL GRIP PUSH-UPS Beginner PEC STRETCH Beginner TRICEP PRESS Intermediate WIDE GRIP PRESS Intermediate CHEST FLY Intermediate CHEST DIP Advance CLOSE GRIP PUSH UP Advance MILITARY PRESS Advance RING PUSH UPS Advance WIDE GRIP PUSH UP  Advance Active Muscle Groups Horizontal scroll bar, 1 page\"])[7]/XCUIElementTypeOther[1]";
    //4
    public String lunge = "4 Lunge";
    public String lungeVideo = "REVERSE LUNGE Beginner";
    public String cancel4 = "(//XCUIElementTypeOther[@name=\"4 | Lunge Move here to start the lunge workout REVERSE LUNGE Beginner STATIONARY LUNGE Beginner LATERAL LUNGE Intermediate IRON MIKES Advance SAXON STRETCH Advance WAKLING LUNGE Advance BOX LUNGE Advance BROAD JUMPS Advance SAXON TWIST Advance VERTICAL TWIST Advance Active Muscle Groups Horizontal scroll bar, 1 page\"])[7]/XCUIElementTypeOther[1]";
    //5
    public String pull = "5 Pull";
    public String pullVideo = "STANDING ROW Beginner";
    public String cancel5 = "(//XCUIElementTypeOther[@name=\"5 | Pull Move here to start the pull workout STANDING ROW Beginner ASSISTED PULL UP Intermediate RING CURL Intermediate RING ROW Intermediate SINGLE ARM ROW Intermediate UNDERHAND LET ME UPS Intermediate REVERSE FLY Intermediate WIDE GRIP PULL UP Intermediate FACE PULL Advance TWIST AND REACH Advance Active Muscle Groups Horizontal scroll bar, 1 page\"])[7]/XCUIElementTypeOther[1]";
    //6
    public String agility = "6 Agility";
    public String agilityVideo = "BROAD JUMP Beginner";
    public String cancel6 = "(//XCUIElementTypeOther[@name=\"6 | Agility Move here to start the agility workout BROAD JUMP Beginner DOT JUMP Beginner BURPEE Intermediate LATERAL SHUFFLE Intermediate 1-LEGGED DOT JUMP Advance HIGH KNEES Advance SPEED SKATERS Advance STARFISH BURPEES Advance SUPERMAN BURPEES Advance X DRILL Advance Active Muscle Groups Horizontal scroll bar, 1 page\"])[7]/XCUIElementTypeOther[1]";
    //7
    public String bend = "7 Bend";
    public String bendVideo = "BEND & REACH Beginner";
    public String cancel7 = "(//XCUIElementTypeOther[@name=\"7 | Bend Move here to start the bend workout BEND & REACH Beginner STATIC HYPEREXTENSION Beginner HYPEREXTENSION Intermediate PRONE LEG EXTENSIONS Intermediate REVERSE HYPEREXTENSION Intermediate FLOOR TOUCH Intermediate GLUTE HAM RAISE Advance ONE LEGGED RDL Advance SIDE BEND Advance SUPERMAN HYPEREXTENSION Advance Active Muscle Groups Horizontal scroll bar, 1 page\"])[7]/XCUIElementTypeOther[1]";




    //App opening and closing
    public void closeApp() throws InterruptedException {
        switch(new GlobalParams().getPlatformName()){
            case "Android":
                ((InteractsWithApps) driver).terminateApp(driver.getCapabilities().
                        getCapability("appPackage").toString());
                break;
            case "iOS":
                ((InteractsWithApps) driver).terminateApp(driver.getCapabilities().
                        getCapability("bundleId").toString());
        }
        Thread.sleep(5000);
    }

    public void launchApp() throws InterruptedException {
        switch(new GlobalParams().getPlatformName()){
            case "Android":
                ((InteractsWithApps) driver).activateApp(driver.getCapabilities().
                        getCapability("appPackage").toString());
                break;
            case "iOS":
                ((InteractsWithApps) driver).activateApp(driver.getCapabilities().
                        getCapability("bundleId").toString());
        }
        Thread.sleep(5000);
    }

    public void clickAllow() throws InterruptedException {
        WebElement ele = driver.findElement(AppiumBy.accessibilityId(allowBtn));
        ele.click();
        Thread.sleep(3000);
    }
    public void clickLoginLink() throws InterruptedException {
        WebElement ele = driver.findElement(AppiumBy.accessibilityId(login));
        ele.click();
        Thread.sleep(5000);
    }
    public void validEmail(String Email) throws InterruptedException {
        WebElement btn = driver.findElement(AppiumBy.accessibilityId(emailTxtField));
        btn.sendKeys(Email);
        Thread.sleep(3000);
    }
    public void validPass(String Pass) throws InterruptedException {
        WebElement ele = driver.findElement(AppiumBy.accessibilityId(passTxtField));
        ele.sendKeys(Pass);
        Thread.sleep(3000);
        WebElement ele2 = driver.findElement(MobileBy.iOSClassChain(passView));
        ele2.click();
        Thread.sleep(2000);
    }
    public void clickLogin() throws InterruptedException {
        WebElement ele = driver.findElement(AppiumBy.accessibilityId(loginBtn));
        ele.click();
        Thread.sleep(3000);
        WebElement ele2 = driver.findElement(AppiumBy.accessibilityId("Allow While Using App"));
        ele2.click();
        Thread.sleep(2000);
        WebElement ele3 = driver.findElement(AppiumBy.accessibilityId("Change to Always Allow"));
        ele3.click();
        Thread.sleep(2000);
        WebElement ele4 = driver.findElement(AppiumBy.accessibilityId("OK"));
        ele4.click();
        Thread.sleep(3000);

    }
    public void clickMovement() throws InterruptedException {
        WebElement ele = driver.findElement(AppiumBy.accessibilityId(movement));
        ele.click();
        Thread.sleep(3000);
    }
    public void clickCore() throws InterruptedException {
        WebElement ele = driver.findElement(AppiumBy.accessibilityId(core));
        ele.click();
        Thread.sleep(3000);
        WebElement ele2 = driver.findElement(By.xpath(cancel1));
        ele2.click();
        Thread.sleep(3000);
    }
    public void clickSquat() throws InterruptedException {
        WebElement ele = driver.findElement(AppiumBy.accessibilityId(squat));
        ele.click();
        Thread.sleep(3000);
        WebElement ele2 = driver.findElement(By.xpath(cancel2));
        ele2.click();
        Thread.sleep(3000);
    }
    public void clickPush() throws InterruptedException {
        WebElement ele = driver.findElement(AppiumBy.accessibilityId(push));
        ele.click();
        Thread.sleep(3000);
        WebElement ele2 = driver.findElement(By.xpath(cancel3));
        ele2.click();
        Thread.sleep(3000);
    }
    public void clickLunge() throws InterruptedException {
        WebElement ele = driver.findElement(AppiumBy.accessibilityId(lunge));
        ele.click();
        Thread.sleep(3000);
        WebElement ele2 = driver.findElement(By.xpath(cancel4));
        ele2.click();
        Thread.sleep(3000);
    }
    public void clickPull() throws InterruptedException {
        WebElement ele = driver.findElement(AppiumBy.accessibilityId(pull));
        ele.click();
        Thread.sleep(3000);
        WebElement ele2 = driver.findElement(By.xpath(cancel5));
        ele2.click();
        Thread.sleep(3000);
    }
    public void clickAgility() throws InterruptedException {
        WebElement ele = driver.findElement(AppiumBy.accessibilityId(agility));
        ele.click();
        Thread.sleep(3000);
        WebElement ele2 = driver.findElement(By.xpath(cancel6));
        ele2.click();
        Thread.sleep(3000);
    }
    public void clickBend() throws InterruptedException {
        WebElement ele = driver.findElement(AppiumBy.accessibilityId(bend));
        ele.click();
        Thread.sleep(3000);
        WebElement ele2 = driver.findElement(By.xpath(cancel7));
        ele2.click();
        Thread.sleep(3000);
    }
















}
