package Base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utilities.ScreenshotUtility;
import io.appium.java_client.android.AndroidDriver;

public class setup {
    public AndroidDriver driver;
    @BeforeTest
    public AndroidDriver Launchapp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","Android");
        caps.setCapability("deviceName","LRWKDQTWCIZD7XKZ");
        caps.setCapability("automationName","UiAutomator2");
        caps.setCapability("appPackage", "com.rvappstudios.flashlight");
        caps.setCapability("appActivity", "com.rvappstudios.flashlight.SplaceActivity"); 
        // caps.setCapability("autoGrantPermissions", true);


        // Set the adb execution timeout to a higher value
        caps.setCapability("adbExecTimeout", 30000);

        // real device name
        caps.setCapability("udid","LRWKDQTWCIZD7XKZ");
        // emulator device name
        // caps.setCapability("udid", "emulator-5554");
        // for code to work on both Win and MAC, we use File.separator
        String appURL = System.getProperty("user.dir")+ File.separator + "app" + File.separator + "flashlight.apk";
        caps.setCapability("app", appURL);
        

        // setting up appium code
        URL url = new URL("http://127.0.0.1:4723/");
        driver = new AndroidDriver(url, caps);
        return driver;
    }

    // @AfterMethod
    // public void screenShot(ITestResult result){
    //     if(ITestResult.FAILURE==result.getStatus()){
    //         try{
    //             ScreenshotUtility utils=new ScreenshotUtility();
    //             utils.takeScreenshotForFailure(driver);
    //         }
    //         catch (Exception exception){
    //             System.out.println(exception.toString());
    //         }
    //     }
    //     else{
    //         try{
    //             ScreenshotUtility utils=new ScreenshotUtility();
    //             utils.takeScreenshotForSuccess(driver);
    //         }
    //         catch (Exception exception){
    //             System.out.println(exception.toString());
    //         }
    //     }
    // }

    @AfterTest
    public void close() throws InterruptedException{
        driver.quit();
    }

    
}
