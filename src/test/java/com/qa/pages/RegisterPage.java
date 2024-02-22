package com.qa.pages;

import com.qa.utils.DriverManager;
import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.InteractsWithApps;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class RegisterPage {
    private AppiumDriver driver;
    TestUtils utils = new TestUtils();

    public RegisterPage(){
        this.driver = new DriverManager().getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }
    //public WebDriver driver;
    public String allowBtn = "Allow";
    public String fullNameTxt = "//XCUIElementTypeOther[@name=\"Full Name\"]/XCUIElementTypeOther/XCUIElementTypeTextField";
    public String emailTxt = "(//XCUIElementTypeOther[@name=\"Email Address\"])[2]/XCUIElementTypeOther[1]/XCUIElementTypeTextField";
    public String passwordTxt = "(//XCUIElementTypeOther[@name=\"Password\"])[2]/XCUIElementTypeOther[1]/XCUIElementTypeSecureTextField";
    public String registerBtn = "(//XCUIElementTypeOther[@name=\"REGISTER\"])[2]";
    public String errTextInvalidEmail = "//XCUIElementTypeStaticText[@name=\"Invalid email address\"]";
    public String errTextFieldEmpty1 = "(//XCUIElementTypeStaticText[@name=\"Field cannot be empty\"])[1]";
    public String errTextFieldEmpty2 = "(//XCUIElementTypeStaticText[@name=\"Field cannot be empty\"])[2]";
    public String errTextFieldEmpty3 = "(//XCUIElementTypeStaticText[@name=\"Field cannot be empty\"])[3]";
    public String errTextInvalidPass = "//XCUIElementTypeStaticText[@name=\"Password doesn’t match all the criterias\"]";
    public String errTextExistingUser = "This email is already registered. Try login instead.";
    public String infoBtn = "(//XCUIElementTypeOther[@name=\"Email Address\"])[2]/XCUIElementTypeOther[2]";
    public String viewBtn = "(//XCUIElementTypeOther[@name=\"Password\"])[2]/XCUIElementTypeOther[2]";
    public String linkTry = "Try a Different Email Address";
    public String troubleTxt = "//XCUIElementTypeStaticText[@name=\"Trouble verifying?\"]";
    public String linkResend = "Resend Verification Email";
    public String viewAccountTxt = "//XCUIElementTypeOther[@name=\"Verify Your Account Thank you for registering An email has been sent to bhubhanjena287@gnail.com with a link to verify your account. If you haven’t received the email after a few minutes, please check your spam folder. Resend Verification Email 0:00\"]";
    public String linkPolicy = "//XCUIElementTypeOther[@name=\" Safe and Privacy Policy \"]";
    public String linkTerm = "//XCUIElementTypeOther[@name=\"Terms. \"]";
    public String linkNfc = "//XCUIElementTypeOther[@name=\"app@nfchq.com \"]";

    //Personalize Page Element
    public String notification = "(//XCUIElementTypeOther[@name=\"Email Verification Successful Thank you for registering with Fitness Court\"])[3]";
    public String headerTxt = "//XCUIElementTypeStaticText[@name=\"Let’s personalize your outdoor wellness experience\"]";
    //Age range Element
    public String ageTxt = "//XCUIElementTypeStaticText[@name=\"Select an Age Range (in years)\"]";
    public String age1 = "//XCUIElementTypeOther[@name=\"14 - 17\"]";
    public String age2 = "//XCUIElementTypeOther[@name=\"18 - 29\"]";
    public String age3 = "//XCUIElementTypeOther[@name=\"30 - 49\"]";
    public String age4 = "//XCUIElementTypeOther[@name=\"50+\"]";

    //Select a Gender
    public String genTxt = "//XCUIElementTypeStaticText[@name=\"Select a Gender\"]";
    public String gen1 = "//XCUIElementTypeOther[@name=\"Male\"]";
    public String gen2 = "//XCUIElementTypeOther[@name=\"Female\"]";
    public String gen3 = "//XCUIElementTypeOther[@name=\"Not listed\"]";
    public String gen4 = "(//XCUIElementTypeOther[@name=\"Prefer not to answer\"])[1]";

    //Select Race and Ethnicity
    public String raceTxt = "//XCUIElementTypeStaticText[@name=\"Select a Race / Ethnicity\"]";
    public String race1 = "White";
    public String race2 = "Black /African American";
    public String race3 = "American Indian / Native Alaskan";
    public String race4 = "Asian";
    public String race5 = "Hispanic/Latino";
    public String race6 = "Native Hawaiian / Pacific Islander";
    public String race7 = "Other Race";
    public String race8 = "(//XCUIElementTypeOther[@name=\"Prefer not to answer\"])[2]";
    public String progressBar = "(//XCUIElementTypeOther[@name=\"Next Let’s personalize your outdoor wellness experience Select an Age Range (in years) 14 - 17 18 - 29 30 - 49 50+ Select a Gender Male Female Not listed Prefer not to answer Select a Race / Ethnicity White Black /African American American Indian / Native Alaskan Asian Hispanic/Latino Native Hawaiian / Pacific Islander Other Race Prefer not to answer Horizontal scroll bar, 1 page Previous Done Almost there! Where are you located? State City Vertical scroll bar, 2 pages\"])[5]/XCUIElementTypeOther[3]";
    public String nextBtn = "(//XCUIElementTypeOther[@name=\"Next\"])[3]";
    public String previousBtn = "Previous";

    //Select the State and City
    public String state = "(//XCUIElementTypeOther[@name=\"State\"])[3]/XCUIElementTypeOther/XCUIElementTypeTextField";
    public String city = "(//XCUIElementTypeOther[@name=\"City\"])[3]/XCUIElementTypeOther/XCUIElementTypeTextField";
    public String doneBtnStateCity = "Done";

    //Find a fitness court
    public String allowOnce = "Allow Once";
    public String whileUsing = "Allow While Using App";
    public String dontAllow = "Don’t Allow";
    public String findFCTxt = "Find a Fitness Court®";
    public String searchCity = "(//XCUIElementTypeOther[@name=\"Search City or State Abbreviation\"])[4]/XCUIElementTypeTextField";

    //Apple Health Access
    public String textAHA = "//XCUIElementTypeOther[@name=\"Apple Health Access By connecting your activity, you contribute to helping your city and state compete with others towards becoming the healthiest community across America! Your data will always stay anonymous. You can also enable this later under  Profile > Apple Health\"]";
    public String skip = "Skip For Now";
    public String connectAppleHealth = "CONNECT WITH APPLE HEALTH";
    public String turnOn = "Turn On All";
    public String turnOff = "Turn Off All";
    public String allowHealth = "Allow";
    //Welcome Page
    public String verifyPageTxt = "(//XCUIElementTypeOther[@name=\"Welcome to the Fitness Court® Get to know the Fitness Court® and start with your first workout I’ll Check Later\"])[6]";//label
    public String playButton = "(//XCUIElementTypeOther[@name=\"Get to know the Fitness Court® and start with your first workout\"])[3]/XCUIElementTypeOther";
    public String forward = "";
    public String backward = "";
    public String playPause = "";
    public String share = "";
    public String backBtn = "";
    public String shareClose = "Close";
    public String gmail = "//XCUIElementTypeCell[@name=\"Gmail\"]/XCUIElementTypeOther/XCUIElementTypeOther[2]";
    public String gmailTo = "//XCUIElementTypeButton[@name=\"jswadhin11@gmail.com\"]";
    public String gmailSend = "Send button";
    public String gmailBack = "Back";
    public String later = "I’ll Check Later";

    //Home Landing
    public String onlyUsing = "Keep Only While Using";
    public String allowAlways = "Change to Always Allow";
    public String homeDontAllow = "Don’t Allow";
    public String homeOk = "OK";
    public String featureTxt = "Featured Challenge";




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

    public void fullName(String fullName) throws InterruptedException {
        Thread.sleep(3000);
        WebElement ele1 = driver.findElement(By.xpath(fullNameTxt));
        ele1.sendKeys(fullName);
        Thread.sleep(2000);
    }
    public void emailBox(String email) throws InterruptedException {
        WebElement ele2 = driver.findElement(By.xpath(emailTxt));
        ele2.sendKeys(email);
        Thread.sleep(2000);
    }
    public void passwordBox(String pass) throws InterruptedException {
        WebElement ele3 = driver.findElement(By.xpath(passwordTxt));
        ele3.sendKeys(pass);
        Thread.sleep(2000);
    }
    public void registerBtn() throws InterruptedException {
        Thread.sleep(5000);
        WebElement ele4 = driver.findElement(By.xpath(registerBtn));
        ele4.click();
        Thread.sleep(2000);
    }
    public void accessAllow() throws InterruptedException {
        Thread.sleep(2000);
        WebElement btn = driver.findElement(AppiumBy.accessibilityId(allowBtn));
        btn.click();
        Thread.sleep(3000);
    }
    public void clickInfo() throws InterruptedException {
        WebElement btn1 = driver.findElement(By.xpath(infoBtn));
        btn1.click();
        Thread.sleep(2000);
    }
    public void clickView() throws InterruptedException {
        WebElement btn2 = driver.findElement(By.xpath(viewBtn));
        btn2.click();
        Thread.sleep(3000);
    }
    public void tryAnotherMail() throws InterruptedException {
        WebElement tryMail = driver.findElement(AppiumBy.accessibilityId(linkTry));
        tryMail.click();
        Thread.sleep(3000);
    }
    public void anotherMail(String email2) throws InterruptedException {
        WebElement ele2 = driver.findElement(By.xpath(emailTxt));
        ele2.clear();
        Thread.sleep(3000);
        ele2.sendKeys(email2);
        Thread.sleep(3000);
    }
    public void clickRegister() throws InterruptedException {
        WebElement ele3 = driver.findElement(By.xpath(passwordTxt));
        ele3.click();
        Thread.sleep(2000);
        WebElement ele = driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"REGISTER\"])[2]"));
        ele.click();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    }
    public void viewAccountText() throws InterruptedException {
        //WebElement txt = driver.findElement(By.xpath(viewAccountTxt));
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(122));
        //System.out.println(txt.isDisplayed());
        //System.out.println(txt.isEnabled());
        Thread.sleep(10000);
    }
    public void resendMail() throws InterruptedException {
        WebElement ele = driver.findElement(AppiumBy.accessibilityId("Resend Verification Email"));
        ele.click();
        //driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"Resend Verification Email\"]")).click();
        Thread.sleep(25000);
    }
    public void txtHeader() throws InterruptedException {
        WebElement txt = driver.findElement(By.xpath(headerTxt));
        String data = txt.getAttribute("label");
        Assert.assertEquals(data,"Let’s personalize your outdoor wellness experience");
        Thread.sleep(3000);
    }
    public void ageClick() throws InterruptedException {
        WebElement txt = driver.findElement(By.xpath(ageTxt));
        String data = txt.getAttribute("label");
        Assert.assertEquals(data,"Select an Age Range (in years)");
        Thread.sleep(3000);
        WebElement ageA = driver.findElement(By.xpath(age1));
        ageA.click();
        Thread.sleep(2000);
        WebElement ageB = driver.findElement(By.xpath(age2));
        ageB.click();
        Thread.sleep(2000);
        WebElement ageC = driver.findElement(By.xpath(age3));
        ageC.click();
        Thread.sleep(2000);
        WebElement ageD = driver.findElement(By.xpath(age4));
        ageD.click();
        Thread.sleep(2000);
    }
    public void specificAgeRange() throws InterruptedException {
        WebElement ageB = driver.findElement(By.xpath(age2));
        ageB.click();
        Thread.sleep(2000);
    }
    public void genderClick() throws InterruptedException {
        WebElement txt = driver.findElement(By.xpath(genTxt));
        String data = txt.getAttribute("label");
        Assert.assertEquals(data,"Select a Gender");
        Thread.sleep(3000);
        WebElement genderA = driver.findElement(By.xpath(gen1));
        genderA.click();
        Thread.sleep(2000);
        WebElement genderB = driver.findElement(By.xpath(gen2));
        genderB.click();
        Thread.sleep(2000);
        WebElement genderC = driver.findElement(By.xpath(gen3));
        genderC.click();
        Thread.sleep(2000);
        WebElement genderD = driver.findElement(By.xpath(gen4));
        genderD.click();
        Thread.sleep(2000);
    }
    public void specificGender() throws InterruptedException {
        WebElement genderA = driver.findElement(By.xpath(gen1));
        genderA.click();
        Thread.sleep(3000);
    }
    public void raceClick() throws InterruptedException {
        WebElement txt = driver.findElement(By.xpath(raceTxt));
        String data = txt.getAttribute("label");
        Assert.assertEquals(data,"Select a Race / Ethnicity");
        Thread.sleep(3000);

        WebElement raceA = driver.findElement(AppiumBy.accessibilityId(race1));
        raceA.click();
        Thread.sleep(2000);

        WebElement raceB = driver.findElement(AppiumBy.accessibilityId(race2));
        raceB.click();
        Thread.sleep(2000);

        WebElement raceC = driver.findElement(AppiumBy.accessibilityId(race3));
        raceC.click();
        Thread.sleep(2000);

        WebElement raceD = driver.findElement(AppiumBy.accessibilityId(race4));
        raceD.click();
        Thread.sleep(2000);

        WebElement raceE = driver.findElement(AppiumBy.accessibilityId(race5));
        raceE.click();
        Thread.sleep(2000);

        WebElement raceF = driver.findElement(AppiumBy.accessibilityId(race6));
        raceF.click();
        Thread.sleep(2000);

        WebElement raceG = driver.findElement(AppiumBy.accessibilityId(race7));
        raceG.click();
        Thread.sleep(2000);

        WebElement raceH = driver.findElement(By.xpath(race8));
        raceH.click();
        Thread.sleep(2000);

    }
    public void specificRace() throws InterruptedException {
        WebElement raceD = driver.findElement(AppiumBy.accessibilityId(race4));
        raceD.click();
        Thread.sleep(2000);

        WebElement bar = driver.findElement(By.xpath(progressBar));
        System.out.println(bar.isEnabled());
        System.out.println(bar.isDisplayed());
        Thread.sleep(2000);
    }
    public void nextClick() throws InterruptedException {
        WebElement next = driver.findElement(By.xpath(nextBtn));
        next.click();
        Thread.sleep(3000);
    }
    public void previousClick() throws InterruptedException {
        //click on previous
        WebElement pre = driver.findElement(AppiumBy.accessibilityId(previousBtn));
        pre.click();
        Thread.sleep(3000);
        //click on next
        WebElement next = driver.findElement(By.xpath(nextBtn));
        next.click();
        Thread.sleep(3000);
    }
    public void selectCityState() throws InterruptedException {
//        WebElement ele = driver.findElement(By.xpath(state));
//        ele.sendKeys("Arizona");
//        Thread.sleep(5000);
//        WebElement ele2 = driver.findElement(By.xpath(city));
//        ele2.sendKeys("Ajo");
        Thread.sleep(20000);
    }

    public void clickDone() throws InterruptedException {
        WebElement dn = driver.findElement(AppiumBy.accessibilityId(doneBtnStateCity));
        dn.click();
        Thread.sleep(3000);
    }
    public void clickAllowWhileUsingApp() throws InterruptedException {
        WebElement allow = driver.findElement(AppiumBy.accessibilityId(whileUsing));
        allow.click();
        Thread.sleep(3000);
    }
    public void clickFitnessCourt() throws InterruptedException {
        //WebElement court = driver.findElement(By.xpath(searchCity));
        //court.sendKeys("Seymour");
        //new RegisterPage().selectOptionFromDropdown(court,"Seymour");
        Thread.sleep(12000);
    }
    public void appleHealth() throws InterruptedException {
        WebElement connect = driver.findElement(AppiumBy.accessibilityId(connectAppleHealth));
        connect.click();
        Thread.sleep(3000);

        WebElement turnon = driver.findElement(AppiumBy.accessibilityId(turnOn));
        turnon.click();
        Thread.sleep(2000);

//        WebElement turnoff = driver.findElement(AppiumBy.accessibilityId(turnOff));
//        turnoff.click();
//        Thread.sleep(2000);
//
//        turnon.click();
//        Thread.sleep(2000);

        WebElement allow = driver.findElement(AppiumBy.accessibilityId(allowHealth));
        allow.click();
        Thread.sleep(2000);
    }
    public void welcomeScreen() throws InterruptedException {
        WebElement ele = driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"Get to know the Fitness Court® and start with your first workout\"])[3]/XCUIElementTypeOther"));
        ele.click();
        Thread.sleep(4000);
    }
    public void checkLater() throws InterruptedException {
        WebElement ele = driver.findElement(AppiumBy.accessibilityId(later));
        ele.click();
        Thread.sleep(3000);
    }
    public void homeLanding() throws InterruptedException {
        WebElement ele = driver.findElement(AppiumBy.accessibilityId(allowAlways));
        ele.click();
        Thread.sleep(3000);

        WebElement ele2 = driver.findElement(AppiumBy.accessibilityId(homeOk));
        ele2.click();
        Thread.sleep(3000);

        WebElement ele3 = driver.findElement(AppiumBy.accessibilityId(featureTxt));
        String data = ele3.getAttribute("label");
        Assert.assertEquals(data,"Featured Challenge");
        System.out.println("Welcome To Homepage");
    }
    public void errorMessage(String error) throws InterruptedException {
        WebElement eleA = driver.findElement(By.xpath(errTextFieldEmpty1));
        String dataA = eleA.getAttribute("label");
        System.out.println(dataA);
        Assert.assertEquals(dataA,error);
        Thread.sleep(2000);
        WebElement eleB = driver.findElement(By.xpath(errTextFieldEmpty2));
        String dataB = eleB.getAttribute("label");
        Assert.assertEquals(dataB,error);
        Thread.sleep(2000);
        WebElement eleC = driver.findElement(By.xpath(errTextFieldEmpty3));
        String dataC = eleC.getAttribute("label");
        Assert.assertEquals(dataC,error);
        Thread.sleep(2000);
    }
    public void errorMessage1(String error1) throws InterruptedException {
        WebElement ele5 = driver.findElement(By.xpath(errTextInvalidEmail));
        String data1 = ele5.getAttribute("label");
        Assert.assertEquals(data1,error1);
        Thread.sleep(2000);
    }
    public void errorMessage2(String error2) throws InterruptedException {
        WebElement ele6 = driver.findElement(By.xpath(errTextInvalidPass));
        String data2 = ele6.getAttribute("label");
        Assert.assertEquals(data2,error2);
        Thread.sleep(2000);
    }
    public void errorMessage3(String error3) throws InterruptedException {
        WebElement ele7 = driver.findElement(AppiumBy.accessibilityId(errTextExistingUser));
        String data3 = ele7.getAttribute("label");
        Assert.assertEquals(data3,error3);
        Thread.sleep(2000);
    }
}
