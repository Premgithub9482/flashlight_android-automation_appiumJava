package TestRunner;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.setup;
import TestCases.landscreen;

public class output extends setup{
    landscreen flashlight_functns;
    @BeforeTest
    public void runcases() throws MalformedURLException, InterruptedException{
        flashlight_functns = new landscreen(driver);
    }

    @Test(priority = 2,description = "Deny notification permission")
    public void notification_permission(){
        flashlight_functns = new landscreen(driver);
        flashlight_functns.deny_notifictn();
        System.out.println("Notification denied");
    }

    @Test(priority = 3,description = "Accept app to launch")
    public void AcceptApp() throws InterruptedException{
        flashlight_functns = new landscreen(driver);
        flashlight_functns.Acceptapp_launch();
        System.out.println("accepted the app to launch");
    }

    @Test(priority = 4,description = "Flash On btn")
    public void CirecleBtn_on(){
        try {
            flashlight_functns.Acceptapp_launch();
            flashlight_functns = new landscreen(driver);
            boolean result = flashlight_functns.Circle_flsh_btn_on();
            System.out.println("Circle button clickable to turn on flash");
            Assert.assertFalse(result); 
            System.out.println("Flash light Turned on");
        } catch (Exception Exception) {
            flashlight_functns = new landscreen(driver);
            boolean result = flashlight_functns.Circle_flsh_btn_on();
            System.out.println("Circle button clickable to turn on flash");
            Assert.assertFalse(result); 
            System.out.println("Flash light Turned on");
        }
    }

    @Test(priority = 5,description = "ScreenFlash Page")
    public void ScreenFlash_land(){
        try {
            flashlight_functns.Acceptapp_launch();
            flashlight_functns = new landscreen(driver);
            flashlight_functns.ScreenFalsh_meth();
            System.out.println("ScreenFlash Page");
            
        } catch (Exception e) {
            flashlight_functns = new landscreen(driver);
            flashlight_functns.ScreenFalsh_meth(); 
            System.out.println("ScreenFlash Page");
        }
    }

    @Test(priority = 6,description = "Back button of FlashScrenImg Page")
    public void ScreenFlashPage_exit(){
        try {
            flashlight_functns.Acceptapp_launch();
            flashlight_functns = new landscreen(driver);
            flashlight_functns.DismissScreenFlash_meth();
            System.out.println("back from screen falsh page");
            
        } catch (Exception e) {
            flashlight_functns = new landscreen(driver);
            flashlight_functns.DismissScreenFlash_meth();  
            System.out.println("back from screen falsh page");
        }
    }

    @Test(priority = 7,description = "Tap Button to quick Flash")
    public void QuickFlah_tap_btn(){
        try {
            flashlight_functns.Acceptapp_launch();
            flashlight_functns = new landscreen(driver);
            flashlight_functns.Button_tap_meth();
            System.out.println("tap button clickable for contineous flash");
            
        } catch (Exception e) {
            flashlight_functns = new landscreen(driver);
            flashlight_functns.Button_tap_meth();  
            System.out.println("tap button clickable for contineous flash");
        }
    }

    @Test(priority = 8,description = "Shake mobile to turn on flash")
    public void Button_shake_to_flash(){
        try {
            flashlight_functns.Acceptapp_launch();
            flashlight_functns = new landscreen(driver);
            flashlight_functns.btn_shake_meth();
            System.out.println("shake button clickable");
            
        } catch (Exception e) {
            flashlight_functns = new landscreen(driver);
            flashlight_functns.btn_shake_meth();
            System.out.println("shake button clickable");
        }
    }

    @Test(priority = 9,description = "Clap Button click")
    public void Clap_btn_click(){
        try {
            flashlight_functns.Acceptapp_launch();
            flashlight_functns = new landscreen(driver);
            flashlight_functns.clap_meth();
            System.out.println("Clap button clickable");
            
        } catch (Exception e) {
            flashlight_functns = new landscreen(driver);
            flashlight_functns.clap_meth(); 
            System.out.println("Clap button clickable");
        }
    }

    @Test(priority = 10,description = "Allow access to clap flash on")
    public void allow_access_clap(){
        flashlight_functns = new landscreen(driver);
        flashlight_functns.allow_clap_btn_meth();
        System.out.println("Allow permission to clap button");
    }

    @Test(priority = 11,description = "record audio allow")
    public void record_audio_access(){
        flashlight_functns = new landscreen(driver);
        flashlight_functns.audio_allow_meth();
        System.out.println("Allow permission to record voice");
    }

    // @Test(priority = 8,description = "Allow Clap method btn")
    // public void Allow_clap_option(){
    //     try {
    //         flashlight_functns.Acceptapp_launch();
    //         flashlight_functns = new landscreen(driver);
    //         flashlight_functns.allow_clap_btn_meth();
            
    //     } catch (Exception e) {
    //         flashlight_functns = new landscreen(driver);
    //         flashlight_functns.allow_clap_btn_meth();
    //     }
    // }

    // @Test(priority = 9,description = "Record Audio Allow")
    // public void audio_record_access(){
    //     try {
    //         flashlight_functns.Acceptapp_launch();
    //         flashlight_functns = new landscreen(driver);
    //         flashlight_functns.audio_allow_meth();
            
    //     } catch (Exception e) {
    //         flashlight_functns = new landscreen(driver);
    //         flashlight_functns.audio_allow_meth();  
    //     }
    // }

    @Test(priority = 12,description = "Strobe Button Click to contineous flash on and off")
    public void strobe_btn_click(){
        try {
            flashlight_functns.Acceptapp_launch();
            flashlight_functns = new landscreen(driver);
            flashlight_functns.strobe_btn_meth();
            System.out.println("Strobe Button");
            
        } catch (Exception e) {
            flashlight_functns = new landscreen(driver);
            flashlight_functns.strobe_btn_meth(); 
            System.out.println("strobe button"); 
        }
    }

    @Test(priority = 13,description = "back button from strobe image page")
    public void strobe_back_img_btn(){
        try {
            flashlight_functns.Acceptapp_launch();
            flashlight_functns = new landscreen(driver);
            flashlight_functns.back_strobe_img_meth();
            System.out.println("back button from strobe image");
            
        } catch (Exception e) {
            flashlight_functns = new landscreen(driver);
            flashlight_functns.back_strobe_img_meth(); 
            System.out.println("back button from strobe image"); 
        }
    }

    @Test(priority = 14,description = "Camera Button Clickable")
    public void landing_cameraPage(){
        try {
            flashlight_functns.Acceptapp_launch();
            flashlight_functns = new landscreen(driver);
            flashlight_functns.cameraBtn_meth();
            System.out.println("Camera Button");
            
        } catch (Exception e) {
            flashlight_functns = new landscreen(driver);
            flashlight_functns.cameraBtn_meth(); 
            System.out.println("Camera Button"); 
        }
    }

    @Test(priority = 15,description = "allow camera access")
    public void camera_allow(){
        flashlight_functns = new landscreen(driver);
        flashlight_functns.allow_camera_meth();
        System.out.println("Allow to Camera Access");
    }

    @Test(priority = 16,description = "allow access to take picture or video")
    public void picture_capture_allow(){
        flashlight_functns = new landscreen(driver);
        flashlight_functns.picture_capture_allow_meth();
        System.out.println("Allow access to take pictures");
    }

    // @Test(priority = 11,description = "Allow Access to Camera")
    // public void Camera_allow_acces(){
    //     try {
    //         flashlight_functns.Acceptapp_launch();
    //         flashlight_functns = new landscreen(driver);
    //         flashlight_functns.allow_camera_meth();
            
    //     } catch (Exception e) {
    //         flashlight_functns = new landscreen(driver);
    //         flashlight_functns.allow_camera_meth();  
    //     }
    // }

    // @Test(priority = 11,description = "Allow access to record Picture and video")
    // public void picture_capture_allow(){
    //     try {
    //         flashlight_functns.Acceptapp_launch();
    //         flashlight_functns = new landscreen(driver);
    //         flashlight_functns.picture_capture_allow_meth();
            
    //     } catch (Exception e) {
    //         flashlight_functns = new landscreen(driver);
    //         flashlight_functns.picture_capture_allow_meth();  
    //     }
    // }

    @Test(priority = 17,description = "Back from camera page button")
    public void exit_camera_page(){
        try {
            flashlight_functns.Acceptapp_launch();
            flashlight_functns = new landscreen(driver);
            flashlight_functns.cameraPage_back_math();
            System.out.println("back from camera page");
            
        } catch (Exception e) {
            flashlight_functns = new landscreen(driver);
            flashlight_functns.cameraPage_back_math();  
            System.out.println("back from camera page");
        }
    }

    @Test(priority = 18,description = "Information page landing")
    public void informationBtn_click(){
        try {
            flashlight_functns.Acceptapp_launch();
            flashlight_functns = new landscreen(driver);
            flashlight_functns.Inform_pagebtn_meth();
            System.out.println("Setting page");
            
        } catch (Exception e) {
            flashlight_functns = new landscreen(driver);
            flashlight_functns.Inform_pagebtn_meth();  
            System.out.println("Setting page");
        }
    }

    @Test(priority = 19,description = "Exit Information Page")
    public void setting_page_exit(){
        try {
            flashlight_functns.Acceptapp_launch();
            flashlight_functns = new landscreen(driver);
            flashlight_functns.infrmtn_page_back_btn();
            System.out.println("Back from Setting page");
            
        } catch (Exception e) {
            flashlight_functns = new landscreen(driver);
            flashlight_functns.infrmtn_page_back_btn();  
            System.out.println("Back from Setting page");
        }
    }

    // @Test(priority = 15,description = "Allow access to record Picture and video")
    // public void picture_capture_allow(){
    //     try {
    //         flashlight_functns.Acceptapp_launch();
    //         flashlight_functns = new landscreen(driver);
    //         flashlight_functns.picture_capture_allow_meth();
            
    //     } catch (Exception e) {
    //         flashlight_functns = new landscreen(driver);
    //         flashlight_functns.picture_capture_allow_meth();  
    //     }
    // }

    
}
