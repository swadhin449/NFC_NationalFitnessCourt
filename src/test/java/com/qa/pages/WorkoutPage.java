package com.qa.pages;

import com.qa.utils.DriverManager;
import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import io.appium.java_client.*;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WorkoutPage {
    private AppiumDriver driver;
    TestUtils utils = new TestUtils();

    public WorkoutPage(){
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
    public String workOut = "WORKOUT";
    //Trainer section
    public String markLauren = "(//XCUIElementTypeOther[@name=\"Mark Lauren\n" +
            "\"])[2]";
    public String robRiches = "(//XCUIElementTypeOther[@name=\"Rob Riches\n" +
            "\"])[2]";
    public String nfcTrainer = "(//XCUIElementTypeOther[@name=\"NFC Trainer\n" +
            "\"])[2]";
    public String ivette = "(//XCUIElementTypeOther[@name=\"Ivette Duran \n" +
            "\"])[2]";
    public String allTrainer = "(//XCUIElementTypeOther[@name=\"All \n" +
            "\"])[2]";
    //Feature challenge
    public String getGoingBtn = "GET GOING";
    public String btnShare = "//XCUIElementTypeOther[@name=\"share\"]";
    public String btnCancel = "//XCUIElementTypeOther[@name=\"Cancel\"]";
    public String shareClose = "Close";
    public String startWorkout = "START WORKOUT";
    //Video

    //Beginner
    //1
    public String howItWorks = "**/XCUIElementTypeOther[`label == \"HOW IT WORKS 3 Mins | Full Body\"`][2]";

    //2
    public String coreBuilder = "**/XCUIElementTypeOther[`label == \"CORE BUILDER 7 Mins | Full Body\"`][2]";

    //3
    public String fullBody = "**/XCUIElementTypeOther[`label == \"FULL BODY CHALLENGE 7 Mins | Full Body\"`][2]";

    //4
    public String homeWorkout = "**/XCUIElementTypeOther[`label == \"HOME WORKOUT 7 Mins | Full Body\"`][2]";

    //5
    public String mobilityBalance = "**/XCUIElementTypeOther[`label == \"MOBILITY AND BALANCE 7 Mins | Full Body\"`][2]";


    //Intermediate
    //1
    public String coreBuilder2 = "**/XCUIElementTypeOther[`label == \"CORE BUILDER 7 Mins | Full Body\"`][4]";


    //2
    public String fullBody2 = "**/XCUIElementTypeOther[`label == \"FULL BODY CHALLENGE 7 Mins | Full Body\"`][4]";

    //3
    public String mobility = "**/XCUIElementTypeOther[`label == \"MOBILITY AND BALANCE 7 Mins | Full Body\"`][4]";

    //4
    public String specialForce = "**/XCUIElementTypeOther[`label == \"SPECIAL FORCES TRAINING 7 Mins | Full Body\"`][2]";

    //5
    public String totalBody = "**/XCUIElementTypeOther[`label == \"TOTAL BODY ENDURANCE 7 Mins | Full Body\"`][2]";

    //Advanced
    //1
    public String coreBuilder3 = "**/XCUIElementTypeOther[`label == \"CORE BUILDER 7 Mins | Full Body\"`][6]";

    //2
    public String fullBody3 = "**/XCUIElementTypeOther[`label == \"FULL BODY CHALLENGE 7 Mins | Full Body\"`][6]";

    //3
    public String homeWorkout2 = "**/XCUIElementTypeOther[`label == \"HOME WORKOUT 7 Mins | Full Body\"`][4]";

    //4
    public String mobility2 = "**/XCUIElementTypeOther[`label == \"MOBILITY AND BALANCE 7 Mins | Full Body\"`][6]";

    //5
    public String specialForce2 = "**/XCUIElementTypeOther[`label == \"SPECIAL FORCES TRAINING 7 Mins | Full Body\"`][4]";


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
        Thread.sleep(5000);
        WebElement ele2 = driver.findElement(AppiumBy.accessibilityId("Allow While Using App"));
        ele2.click();
        Thread.sleep(2000);
        WebElement ele3 = driver.findElement(AppiumBy.accessibilityId("Change to Always Allow"));
        ele3.click();
        Thread.sleep(2000);
        WebElement ele4 = driver.findElement(AppiumBy.accessibilityId("OK"));
        ele4.click();
        Thread.sleep(3000);
        /*WebElement ele2 = driver.findElement(AppiumBy.accessibilityId(ok));
        ele2.click();
        Thread.sleep(2000);*/
    }
    public void clickWorkout() throws InterruptedException {
        WebElement ele = driver.findElement(AppiumBy.accessibilityId(workOut));
        ele.click();
        Thread.sleep(3000);
    }
    public void clickTrainer() throws InterruptedException {
        //MarkLauren
        WebElement ele = driver.findElement(By.xpath(markLauren));
        ele.click();
        Thread.sleep(2000);
        WebElement ml = driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"CORE BUILDER 7 Mins | Full Body\"])[1]"));
        ml.click();
        Thread.sleep(3000);
        WebElement share = driver.findElement(By.xpath(btnShare));
        share.click();
        Thread.sleep(3000);
        WebElement canShare = driver.findElement(AppiumBy.accessibilityId(shareClose));
        canShare.click();
        Thread.sleep(3000);
        WebElement cancel = driver.findElement(By.xpath(btnCancel));
        cancel.click();
        Thread.sleep(3000);
        //RobRiches
        WebElement ele2 = driver.findElement(By.xpath(robRiches));
        ele2.click();
        Thread.sleep(2000);
        WebElement rr = driver.findElement(AppiumBy.accessibilityId("STRENGTH 7 Mins | Full Body"));
        rr.click();
        Thread.sleep(3000);
        WebElement share1 = driver.findElement(By.xpath(btnShare));
        share1.click();
        Thread.sleep(3000);
        WebElement canShare1 = driver.findElement(AppiumBy.accessibilityId(shareClose));
        canShare1.click();
        Thread.sleep(3000);
        WebElement cancel1 = driver.findElement(By.xpath(btnCancel));
        cancel1.click();
        Thread.sleep(3000);
        //NFC Trainer
        WebElement ele3 = driver.findElement(By.xpath(nfcTrainer));
        ele3.click();
        Thread.sleep(2000);
        WebElement nfc = driver.findElement(AppiumBy.accessibilityId("HOW IT WORKS 3 Mins | Full Body"));
        nfc.click();
        Thread.sleep(3000);
        WebElement share2 = driver.findElement(By.xpath(btnShare));
        share2.click();
        Thread.sleep(3000);
        WebElement canShare2 = driver.findElement(AppiumBy.accessibilityId(shareClose));
        canShare2.click();
        Thread.sleep(3000);
        WebElement cancel2 = driver.findElement(By.xpath(btnCancel));
        cancel2.click();
        Thread.sleep(3000);
        //ivette
        WebElement ele5 = driver.findElement(By.xpath(ivette));
        ele5.click();
        Thread.sleep(2000);
        WebElement ive = driver.findElement(AppiumBy.accessibilityId("DYNAMIC MOBILITY 7 Mins | Full Body"));
        nfc.click();
        Thread.sleep(3000);
        WebElement share3 = driver.findElement(By.xpath(btnShare));
        share3.click();
        Thread.sleep(3000);
        WebElement canShare3 = driver.findElement(AppiumBy.accessibilityId(shareClose));
        canShare3.click();
        Thread.sleep(3000);
        WebElement cancel3 = driver.findElement(By.xpath(btnCancel));
        cancel3.click();
        Thread.sleep(3000);

        //All
        WebElement ele4 = driver.findElement(By.xpath(allTrainer));
        ele4.click();
        Thread.sleep(3000);
    }
    public void clickFeatureChallenge() throws InterruptedException {
        WebElement ele = driver.findElement(AppiumBy.accessibilityId(getGoingBtn));
        ele.click();
        Thread.sleep(3000);
        WebElement ele2 = driver.findElement(By.xpath(btnShare));
        ele2.click();
        Thread.sleep(3000);
        WebElement ele3 = driver.findElement(AppiumBy.accessibilityId(shareClose));
        ele3.click();
        Thread.sleep(3000);
        WebElement ele4 =  driver.findElement(By.xpath(btnCancel));
        ele4.click();
        Thread.sleep(3000);
    }
    public void clickBeginner1() throws InterruptedException {
        WebElement ele = driver.findElement(MobileBy.iOSClassChain(howItWorks));
        ele.click();
        Thread.sleep(2000);
        WebElement ele2 = driver.findElement(By.xpath(btnShare));
        ele2.click();
        Thread.sleep(2000);
        WebElement ele3 = driver.findElement(AppiumBy.accessibilityId(shareClose));
        ele3.click();
        Thread.sleep(2000);
        WebElement ele4 = driver.findElement(By.xpath(btnCancel));
        ele4.click();
        Thread.sleep(2000);
    }
    public void clickBeginner2() throws InterruptedException {
        WebElement ele = driver.findElement(MobileBy.iOSClassChain(coreBuilder));
        ele.click();
        Thread.sleep(5000);
        WebElement ele2 = driver.findElement(By.xpath(btnShare));
        ele2.click();
        Thread.sleep(2000);
        WebElement ele3 = driver.findElement(AppiumBy.accessibilityId(shareClose));
        ele3.click();
        Thread.sleep(2000);
        WebElement ele4 = driver.findElement(By.xpath(btnCancel));
        ele4.click();
        Thread.sleep(3000);
    }
    public void clickBeginner3() throws InterruptedException {
        WebElement ele = driver.findElement(MobileBy.iOSClassChain(fullBody));
        ele.click();
        Thread.sleep(2000);
        WebElement ele2 = driver.findElement(By.xpath(btnShare));
        ele2.click();
        Thread.sleep(2000);
        WebElement ele3 = driver.findElement(AppiumBy.accessibilityId(shareClose));
        ele3.click();
        Thread.sleep(2000);
        WebElement ele4 = driver.findElement(By.xpath(btnCancel));
        ele4.click();
        Thread.sleep(3000);
    }
    public void clickBeginner4() throws InterruptedException {
        WebElement ele = driver.findElement(MobileBy.iOSClassChain(homeWorkout));
        ele.click();
        Thread.sleep(2000);
        WebElement ele2 = driver.findElement(By.xpath(btnShare));
        ele2.click();
        Thread.sleep(2000);
        WebElement ele3 = driver.findElement(AppiumBy.accessibilityId(shareClose));
        ele3.click();
        Thread.sleep(2000);
        WebElement ele4 = driver.findElement(By.xpath(btnCancel));
        ele4.click();
        Thread.sleep(3000);
    }
    public void clickBeginner5() throws InterruptedException {
        WebElement ele = driver.findElement(MobileBy.iOSClassChain(mobilityBalance));
        ele.click();
        Thread.sleep(2000);
        WebElement ele2 = driver.findElement(By.xpath(btnShare));
        ele2.click();
        Thread.sleep(2000);
        WebElement ele3 = driver.findElement(AppiumBy.accessibilityId(shareClose));
        ele3.click();
        Thread.sleep(2000);
        WebElement ele4 = driver.findElement(By.xpath(btnCancel));
        ele4.click();
        Thread.sleep(3000);
    }
    public void clickIntermediate1() throws InterruptedException {
        WebElement ele = driver.findElement(MobileBy.iOSClassChain(coreBuilder2));
        ele.click();
        Thread.sleep(2000);
        WebElement ele2 = driver.findElement(By.xpath(btnShare));
        ele2.click();
        Thread.sleep(2000);
        WebElement ele3 = driver.findElement(AppiumBy.accessibilityId(shareClose));
        ele3.click();
        Thread.sleep(2000);
        WebElement ele4 = driver.findElement(By.xpath(btnCancel));
        ele4.click();
        Thread.sleep(3000);
    }
    public void clickIntermediate2() throws InterruptedException {
        WebElement ele = driver.findElement(MobileBy.iOSClassChain(fullBody2));
        ele.click();
        Thread.sleep(2000);
        WebElement ele2 = driver.findElement(By.xpath(btnShare));
        ele2.click();
        Thread.sleep(2000);
        WebElement ele3 = driver.findElement(AppiumBy.accessibilityId(shareClose));
        ele3.click();
        Thread.sleep(2000);
        WebElement ele4 = driver.findElement(By.xpath(btnCancel));
        ele4.click();
        Thread.sleep(3000);
    }
    public void clickIntermediate3() throws InterruptedException {
        WebElement ele = driver.findElement(MobileBy.iOSClassChain(mobility));
        ele.click();
        Thread.sleep(2000);
        WebElement ele2 = driver.findElement(By.xpath(btnShare));
        ele2.click();
        Thread.sleep(2000);
        WebElement ele3 = driver.findElement(AppiumBy.accessibilityId(shareClose));
        ele3.click();
        Thread.sleep(2000);
        WebElement ele4 = driver.findElement(By.xpath(btnCancel));
        ele4.click();
        Thread.sleep(3000);
    }
//    public void clickIntermediate4() throws InterruptedException {
//        WebElement ele = driver.findElement(MobileBy.iOSClassChain(specialForce));
//        ele.click();
//        Thread.sleep(2000);
//        WebElement ele2 = driver.findElement(By.xpath(btnShare));
//        ele2.click();
//        Thread.sleep(2000);
//        WebElement ele3 = driver.findElement(AppiumBy.accessibilityId(shareClose));
//        ele3.click();
//        Thread.sleep(2000);
//        WebElement ele4 = driver.findElement(By.xpath(btnCancel));
//        ele4.click();
//        Thread.sleep(3000);
//    }
    public void clickIntermediate5() throws InterruptedException {
        WebElement ele = driver.findElement(MobileBy.iOSClassChain(totalBody));
        ele.click();
        Thread.sleep(2000);
        WebElement ele2 = driver.findElement(By.xpath(btnShare));
        ele2.click();
        Thread.sleep(2000);
        WebElement ele3 = driver.findElement(AppiumBy.accessibilityId(shareClose));
        ele3.click();
        Thread.sleep(2000);
        WebElement ele4 = driver.findElement(By.xpath(btnCancel));
        ele4.click();
        Thread.sleep(3000);
    }
    public void clickAdvanced1() throws InterruptedException {
        WebElement ele = driver.findElement(MobileBy.iOSClassChain(coreBuilder3));
        ele.click();
        Thread.sleep(2000);
        WebElement ele2 = driver.findElement(By.xpath(btnShare));
        ele2.click();
        Thread.sleep(2000);
        WebElement ele3 = driver.findElement(AppiumBy.accessibilityId(shareClose));
        ele3.click();
        Thread.sleep(2000);
        WebElement ele4 = driver.findElement(By.xpath(btnCancel));
        ele4.click();
        Thread.sleep(3000);
    }
    public void clickAdvanced2() throws InterruptedException {
        WebElement ele = driver.findElement(MobileBy.iOSClassChain(fullBody3));
        ele.click();
        Thread.sleep(2000);
        WebElement ele2 = driver.findElement(By.xpath(btnShare));
        ele2.click();
        Thread.sleep(2000);
        WebElement ele3 = driver.findElement(AppiumBy.accessibilityId(shareClose));
        ele3.click();
        Thread.sleep(2000);
        WebElement ele4 = driver.findElement(By.xpath(btnCancel));
        ele4.click();
        Thread.sleep(3000);
    }
    public void clickAdvanced3() throws InterruptedException {
        WebElement ele = driver.findElement(MobileBy.iOSClassChain(homeWorkout2));
        ele.click();
        Thread.sleep(2000);
        WebElement ele2 = driver.findElement(By.xpath(btnShare));
        ele2.click();
        Thread.sleep(2000);
        WebElement ele3 = driver.findElement(AppiumBy.accessibilityId(shareClose));
        ele3.click();
        Thread.sleep(2000);
        WebElement ele4 = driver.findElement(By.xpath(btnCancel));
        ele4.click();
        Thread.sleep(3000);
    }
    public void clickAdvanced4() throws InterruptedException {
        WebElement ele = driver.findElement(MobileBy.iOSClassChain(mobility2));
        ele.click();
        Thread.sleep(2000);
        WebElement ele2 = driver.findElement(By.xpath(btnShare));
        ele2.click();
        Thread.sleep(2000);
        WebElement ele3 = driver.findElement(AppiumBy.accessibilityId(shareClose));
        ele3.click();
        Thread.sleep(2000);
        WebElement ele4 = driver.findElement(By.xpath(btnCancel));
        ele4.click();
        Thread.sleep(3000);
    }
    public void clickAdvanced5() throws InterruptedException {
        WebElement ele = driver.findElement(MobileBy.iOSClassChain(specialForce2));
        ele.click();
        Thread.sleep(2000);
        WebElement ele2 = driver.findElement(By.xpath(btnShare));
        ele2.click();
        Thread.sleep(2000);
        WebElement ele3 = driver.findElement(AppiumBy.accessibilityId(shareClose));
        ele3.click();
        Thread.sleep(2000);
        WebElement ele4 = driver.findElement(By.xpath(btnCancel));
        ele4.click();
        Thread.sleep(3000);
    }




}
