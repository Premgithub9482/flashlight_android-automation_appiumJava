// import java.io.File;
// import java.net.MalformedURLException;
// import java.net.URL;

// import org.openqa.selenium.By;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.remote.DesiredCapabilities;

// import io.appium.java_client.AppiumDriver;
// import io.appium.java_client.android.AndroidDriver;

// public class connectdevice {
//     public static void main(String[] args) throws MalformedURLException, InterruptedException {
//         DesiredCapabilities caps = new DesiredCapabilities();
//         caps.setCapability("platformName","Android");
//         // caps.setCapability("deviceName","pixel7");
//         caps.setCapability("automationName","uiautomator2");
//         // caps.setCapability("appPackage", "com.rvappstudios.flashlight");
//         // caps.setCapability("appActivity", "com.rvappstudios.flashlight.SplaceActivity");

//         // real device name
//         caps.setCapability("udid","LRWKDQTWCIZD7XKZ");
//         // emulator device name
//         // caps.setCapability("udid", "emulator-5554");

//         String appURL = System.getProperty("user.dir")+ File.separator + "app" + File.separator + "weather-6-0-3.apk";
//         caps.setCapability("app", appURL);
        

//         // setting up appium code
//         URL url = new URL("http://0.0.0.0:4723/");
//         AppiumDriver driver = new AndroidDriver(url, caps);



//         // auto location textview
//         Thread.sleep(2000);
//         WebElement loc = driver.findElement(By.id("android:id/alertTitle"));
//         String txt_loc = loc.getText();
//         if (txt_loc.endsWith("Auto Location")){
//             System.out.println("verified "+txt_loc+" TextView");
//         }
//         else{
//             System.out.println("unable to verify "+txt_loc+" TextView");
//         }

//         // select auto location
//         Thread.sleep(2000);
//         driver.findElement(By.id("android:id/button1")).click();
//         // driver.findElement(By.xpath("android.widget.Button[@index='1']")).click();
//         System.out.println("verified auto location setup clickable");


//         //verify allow location access options for the app
//         Thread.sleep(2000);
//         WebElement only_ths_time = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_one_time_button"));
//         String txt_only_this_time = only_ths_time.getText();
//         if (txt_only_this_time.equals("Only this time")){
//             System.out.println("verified "+txt_only_this_time+" TextView");
//         }
//         else{
//             System.out.println("unable to verify "+txt_only_this_time+" TextView");
//         }

//         Thread.sleep(2000);
//         WebElement dont_allow_loc = driver.findElement(By.id("com.android.permissioncontroller:id/permission_deny_button"));
//         String txt_dont_allow = dont_allow_loc.getText();
//         if (txt_dont_allow.equals("Don't allow")){
//             System.out.println("verified "+txt_dont_allow+" TextView");
//         }
//         else{
//             System.out.println("unable to verify "+txt_dont_allow+" TextView");
//         }

//         Thread.sleep(2000);
//         WebElement using_this_app = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
//         String txt_while_using_app = using_this_app.getText();
//         if (txt_while_using_app.equals("While using the app")){
//             System.out.println("verified "+txt_while_using_app+" TextView");
//             using_this_app.click();
//         }
//         else{
//             System.out.println("unable to verify "+txt_while_using_app+" TextView");
//         }

//         //verify dont allow notification 
//         Thread.sleep(2000);
//         WebElement dont_allow_notifi = driver.findElement(By.id("com.android.permissioncontroller:id/permission_deny_button"));
//         String txt_dont_allow_notifi = dont_allow_notifi.getText();
//         if (txt_dont_allow_notifi.equals("Don't allow")){
//             System.out.println("verified "+txt_dont_allow_notifi+" notification TextView");
        
//         }
//         else{
//             System.out.println("unable to verify "+txt_dont_allow_notifi+" notification TextView ");
//         }

        
//         //notification for app
//         // allow notification textviewe
//         Thread.sleep(2000);
//         WebElement allow = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"));
//         String txt_allow = allow.getText();
//         if (txt_allow.equals("Allow")){
//             System.out.println("verified "+txt_allow+" notification TextView");
//             allow.click();
//             System.out.println("verified allow notification clickable");
//         }
//         else{
//             System.out.println("unable to verify "+txt_allow+" notification Textview");      
//         }

//         // verify the present weather temperature
//         Thread.sleep(2000);
//         WebElement temp = driver.findElement(By.xpath("android.widget.TextView[@index='0']"));
//         String temp_txt = temp.getText();
//         System.out.println(temp_txt);

        
//     }   
// }
