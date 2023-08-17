package implementations;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.an.E;
import io.cucumber.java.en.Given;
import io.cucumber.java.en_scouse.An;
import locators.Locators;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Implementations {
    public static AndroidDriver driver;
    public static String platformName;
    public static String deviceName;
    public static String app;
    public static String AutomationName;
    // create an object of properties class
    static Properties properties = new Properties();
    public static void properties() throws IOException {

        // create an object of FileInputStream and store the location of config files inside it
        FileInputStream inputStream = new FileInputStream("C:\\Users\\divjot.kaur\\IdeaProjects\\apidemoandroid2\\src\\config.properties");

        // load the config file
        properties.load(inputStream);

        //get the values from config-file
        platformName = properties.getProperty("platformName");
        deviceName= properties.getProperty("deviceName");
        app = properties.getProperty("app");
        AutomationName = properties.getProperty("AutomationName");

    }
    public static void desiredCapability(){
        // use try and catch block to handle the exceptions
        try{
            // call the method properties()
            properties();
            // create an object of desired capabilities to get a session id
            DesiredCapabilities dc = new DesiredCapabilities();
            // set the capabilities like automation name, device name, platform name,
            // path of apk file etc.
            dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName);
            dc.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
            dc.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
            dc.setCapability(MobileCapabilityType.APP, app);
            dc.setCapability(MobileCapabilityType.NO_RESET, true);
            dc.setCapability(MobileCapabilityType.FULL_RESET, false);

            // create an object of class URL and store remote host = 127.0.0.1;
            // remote port = 4723, path = /wd/hub
            URL url = new URL("http://127.0.0.1:4723/wd/hub");

            // store url and desired capabilities inside the AndroidDriver
            driver = new AndroidDriver(url, dc);

            //  provide implicit wait of 5 seconds
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }
        // handles the exception using catch block
        catch(Exception e){
            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }
    public static void tapAccessibilityButton(){
        // use try and catch block to handle the exceptions
        try{
            // get the path of button accessibility
            MobileElement accessibility = (MobileElement) driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Access'ibility\")");
            // create touch action class object
            TouchAction action = new TouchAction(driver);
            // tap on the button using TouchAction class
            action.tap(TapOptions.tapOptions().withElement(ElementOption.element(accessibility)))
                    .release().perform();
        }
        // handles the exception using catch block
        catch(Exception e){
            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }
    public static void tapFirstElements(){
        // use try and catch block to handle the exceptions
        try{
            // create xpath of firstElement and store it inside MobileElement
            MobileElement firstElement = (MobileElement) driver.findElement(Locators.nodeQuerying);
            //create an object of TouchAction class
            TouchAction action = new TouchAction(driver);
            // tap on it using TouchAction class
            action.tap(TapOptions.tapOptions().withElement(ElementOption.element(firstElement)))
                    .release().perform();
        }
        // handles the exception using catch block
        catch(Exception e){
            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }
    public static void tapRadioButton(){
        // use try and catch block to handle the exceptions
        try{
//          // create xpath of radioButton and store it inside MobileElement
            MobileElement radioButton = (MobileElement) driver.findElement(Locators.doTaxesButton);
            //create an object of TouchAction class
            TouchAction action = new TouchAction(driver);
            // tap on it using TouchAction class
            action.tap(TapOptions.tapOptions().withElement(ElementOption.element(radioButton)))
                    .release().perform();
        }
        // handles the exception using catch block
        catch(Exception e){
            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }
    public static void clickView(){
        // use try and catch block to handle the exceptions
        try{
            // click on view button
            MobileElement view = (MobileElement) driver.findElement(Locators.views);
            view.click();
        }
        // handles the exception using catch block
        catch(Exception e){
            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }
    public static void clickExpandableList(){
        // use try and catch block to handle the exceptions
        try{
            // click on expandList button
            MobileElement expandList = (MobileElement) driver.findElement(Locators.expandableList);
            expandList.click();
        }
        // handles the exception using catch block
        catch(Exception e){
            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }
    public static void clickAndHold(){
        // use try and catch block to handle the exceptions
        try{
            // store the xpath of customAdaptor using MobileElement
            MobileElement customAdaptor = (MobileElement) driver.findElement(Locators.customAdaptor);
            // create an object of TouchAction class
            TouchAction action = new TouchAction(driver);
            // press and hold on it using longpress() method
            action.longPress(LongPressOptions.longPressOptions().
                    withElement(ElementOption.element(customAdaptor))).release().perform();
        }
        // handles the exception using catch block
        catch(Exception e){
            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }
    public static void clickAutoComplete(){
        // use try and catch block to handle the exceptions
        try{
            // click on autoComplete button
            MobileElement autoComplete =(MobileElement) driver.findElement(Locators.autoComplete);
            autoComplete.click();
        }
        // handles the exception using catch block
        catch(Exception e){
            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }
    public static void clickViewAgain(){
        // use try and catch block to handle the exceptions
        try{
            // click on view button
            MobileElement view = (MobileElement) driver.findElement(Locators.views);
            view.click();
        }
        // handles the exception using catch block
        catch(Exception e){
            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }
    public static void clickScreenTop(){
        // use try and catch block to handle the exceptions
        try{
            // click on screen top button
            MobileElement screenTop = (MobileElement) driver.findElement(Locators.screenTop);
            screenTop.click();
        }
        // handles the exception using catch block
        catch(Exception e){
            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }
    public static void searchDropDown(){
        // use try and catch block to handle the exceptions
        try{
            // click on add text button
            MobileElement addText = (MobileElement) driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"io.appium.android.apis:id/edit\")");
            // write United
            addText.sendKeys("United");
            // now press enter using key events
            driver.pressKey(new KeyEvent().withKey(AndroidKey.ENTER));
            // now press delete for the dropdown to be appeared
            driver.pressKey(new KeyEvent().withKey(AndroidKey.DEL));
            // move to 3rd option using DPAD_DOWN option of key events
            driver.pressKey(new KeyEvent().withKey(AndroidKey.DPAD_DOWN));
            driver.pressKey(new KeyEvent().withKey(AndroidKey.DPAD_DOWN));
            driver.pressKey(new KeyEvent().withKey(AndroidKey.DPAD_DOWN));
            // press enter to the 3rd option
            driver.pressKey(new KeyEvent().withKey(AndroidKey.ENTER));
        }
        // handles the exception using catch block
        catch(Exception e){
            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }
    public static void clickMultipleItems(){
        // use try and catch block to handle the exceptions
        try{
            // press click on multiple items button
            MobileElement multipleItems = (MobileElement) driver.findElement(Locators.MultipleItems);
            multipleItems.click();
        }
        // handles the exception using catch block
        catch(Exception e){
            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }
    public static void addTextInMultiple(){
        // use try and catch block to handle the exceptions
        try{
            // pass united to the add text
            MobileElement addText = (MobileElement) driver.findElement(Locators.addText);
            addText.sendKeys("United");
            // press enter using keyEvents
            driver.pressKey(new KeyEvent().withKey(AndroidKey.ENTER));
            // press delete for the dropdown to be appeared
            driver.pressKey(new KeyEvent().withKey(AndroidKey.DEL));
            // to select the second option from the dropdown
            driver.pressKey(new KeyEvent().withKey(AndroidKey.DPAD_DOWN));
            driver.pressKey(new KeyEvent().withKey(AndroidKey.DPAD_DOWN));
            // select the second option by pressing enter
            driver.pressKey(new KeyEvent().withKey(AndroidKey.ENTER));
            // again pass united to the add text area for selecting multiple vales
            addText.sendKeys("United");
            // press enter
            driver.pressKey(new KeyEvent().withKey(AndroidKey.ENTER));
            // press delete for the dropdown to be appeared
            driver.pressKey(new KeyEvent().withKey(AndroidKey.DEL));
            // to select the third option from the dropdown
            driver.pressKey(new KeyEvent().withKey(AndroidKey.DPAD_DOWN));
            driver.pressKey(new KeyEvent().withKey(AndroidKey.DPAD_DOWN));
            driver.pressKey(new KeyEvent().withKey(AndroidKey.DPAD_DOWN));
            // select the third option by pressing enter
            driver.pressKey(new KeyEvent().withKey(AndroidKey.ENTER));
        }
        // handles the exception using catch block
        catch(Exception e){
            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }
    public static void scrollViewPage(){
        // use try and catch block to handle the exceptions
        try{
            // click on view button
            MobileElement views = (MobileElement) driver.findElement(Locators.views);
            views.click();
            // scroll the page using UiScrollable class that further using UiSelector class
            // for locating the elements
            MobileElement pageScroll = (MobileElement) driver.
                    findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"android:id/list\")).scrollIntoView(new UiSelector().text(\"WebView\"))");
        }
        // handles the exception using catch block
        catch(Exception e){
            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }
    public static void scrollHorizontally(){
        // use try and catch block to handle the exceptions
        try{
            // click on view button
            MobileElement views = (MobileElement) driver.findElement(Locators.views);
            views.click();
            // click on tab button
            MobileElement tabs = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"android:id/list\")).getChildByText(new UiSelector().className(\"android.widget.TextView\"),\"Tabs\")");
            tabs.click();
            // click on scrollable button
            MobileElement scrollable = (MobileElement) driver.findElementByAndroidUIAutomator("new UiSelector().text(\"5. Scrollable\")");
            scrollable.click();
            //  scroll the page horizontally by using method setAsHorizontalList(), and UiScrollable
            //  class that further using UiSelector class
            //  for locating the elements
           driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"android:id/tabs\")).setAsHorizontalList().scrollIntoView(new UiSelector().text(\"TAB 20\"))").click();
        }
        // handles the exception using catch block
        catch(Exception e){
            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }
    public static void getTextOfScrollable(){
        // use try and catch block to handle the exceptions
        try{
            // get the text present inside tab 20
            String getText = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Content for tab with tag Tab 20\")").getText();
            System.out.println("Text inside tab 20 is : "+getText);
        }
        // handles the exception using catch block
        catch(Exception e){
            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }
    public static void handlesToastMessages(){
        // use try and catch block to handle the exceptions
        try{
            // click on views
            MobileElement views = (MobileElement) driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Views\")");
            views.click();
            // click on spinner button
            MobileElement spinner = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"android:id/list\")).scrollIntoView(new UiSelector().text(\"Spinner\"))");
            spinner.click();
            // click on choose color button
            MobileElement chooseColor = (MobileElement) driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"io.appium.android.apis:id/spinner1\")");
            chooseColor.click();
            // choose color blue from it
            MobileElement blueColor = (MobileElement) driver.findElementByAndroidUIAutomator("new UiSelector().text(\"blue\")");
            blueColor.click();
            //handle toast message and print the toast message
            String toastMessage = driver.findElement(Locators.toastMessage).getText();
            System.out.println("Toast message is : "+toastMessage);
            // also verify the toast message
            Assert.assertEquals("Spinner2: position=0 id=0",toastMessage);
        }
        // handles the exception using catch block
        catch(Exception e){
            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }
    public static void clickDateWidgets(){
        // use try and catch block to handle the exceptions
        try{
            // click on date widgets
            MobileElement dateWidgets = (MobileElement) driver.findElement(Locators.dateWidgets);
            dateWidgets.click();
        }
        // handles the exception using catch block
        catch(Exception e){
            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }
    public static void clickInline(){
        // use try and catch block to handle the exceptions
        try{
            // click on inline button
            MobileElement inline = (MobileElement) driver.findElement(Locators.clickInline);
            inline.click();
        }
        // handles the exception using catch block
        catch(Exception e){
            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }
    public static void swipeLeft(){
        // use try and catch block to handle the exceptions
        try{
            // create an object of TouchAction class
            TouchAction action  = new TouchAction(driver);
            // tap on hours
            MobileElement hour = (MobileElement) driver.findElement(Locators.hours);
            action.tap(TapOptions.tapOptions().withElement(ElementOption.element(hour))).release().perform();
            // get the xpath of 15 and 45 min
            MobileElement firstMin = (MobileElement) driver.findElement(Locators.firstMin);
            MobileElement secondMin = (MobileElement) driver.findElement(Locators.secondMin);

            // now perform swapping using longpress() method
            // long press the first element and move it to the second element
            action.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(firstMin))).
                    moveTo(ElementOption.element(secondMin)).release()
                    .perform();

        }
        // handles the exception using catch block
        catch(Exception e){
            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }
    public static void selectDragDrop(){
        // use try and catch block to handle the exceptions
        try{
            // click on drag and drop option
            MobileElement dragDrop = (MobileElement) driver.findElement(Locators.dragAndDropOption);
            dragDrop.click();
        }
        // handles the exception using catch block
        catch(Exception e){
            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }
    public static void performDragDrop(){
        // use try and catch block to handle the exceptions
        try{
            // get the xpath of source and destination
            MobileElement source = (MobileElement) driver.findElement(Locators.firstCircle);
            MobileElement destination = (MobileElement) driver.findElement(Locators.secondCircle);
            // create an object of TouchAction class
            TouchAction action  = new TouchAction(driver);
            // perform drag and drop by long press on first elements and then move it to the
            // second element
            action.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(source)))
                            .moveTo(ElementOption.element(destination)).release().perform();

        }
        // handles the exception
        catch(Exception e){
            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }
}
