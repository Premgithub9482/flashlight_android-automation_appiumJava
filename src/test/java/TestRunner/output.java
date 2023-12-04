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

    @Test(priority = 1,description = "Accept app to launch")
    public void AcceptApp(){
        flashlight_functns = new landscreen(driver);
        flashlight_functns.Acceptapp_launch();
    }

    @Test(priority = 2,description = "Flash On btn")
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

    @Test(priority = 3,description = "ScreenFlash Page")
    public void ScreenFlash_land(){
        try {
            flashlight_functns.Acceptapp_launch();
            flashlight_functns = new landscreen(driver);
            flashlight_functns.ScreenFalsh_meth();
            
        } catch (Exception e) {
            flashlight_functns = new landscreen(driver);
            flashlight_functns.ScreenFalsh_meth(); 
        }
    }

    @Test(priority = 4,description = "Back button of FlashScrenImg Page")
    public void ScreenFlashPage_exit(){
        try {
            flashlight_functns.Acceptapp_launch();
            flashlight_functns = new landscreen(driver);
            flashlight_functns.DismissScreenFlash_meth();
            
        } catch (Exception e) {
            flashlight_functns = new landscreen(driver);
            flashlight_functns.DismissScreenFlash_meth();  
        }
    }

    @Test(priority = 5,description = "Tap Button to quick Flash")
    public void QuickFlah_tap_btn(){
        try {
            flashlight_functns.Acceptapp_launch();
            flashlight_functns = new landscreen(driver);
            flashlight_functns.Button_tap_meth();
            
        } catch (Exception e) {
            flashlight_functns = new landscreen(driver);
            flashlight_functns.Button_tap_meth();  
        }
    }

    @Test(priority = 6,description = "Shake mobile to turn on flash")
    public void Button_shake_to_flash(){
        try {
            flashlight_functns.Acceptapp_launch();
            flashlight_functns = new landscreen(driver);
            flashlight_functns.btn_shake_meth();
            
        } catch (Exception e) {
            flashlight_functns = new landscreen(driver);
            flashlight_functns.btn_shake_meth();
        }
    }

    @Test(priority = 7,description = "Clap Button click")
    public void Clap_btn_click(){
        try {
            flashlight_functns.Acceptapp_launch();
            flashlight_functns = new landscreen(driver);
            flashlight_functns.clap_meth();
            
        } catch (Exception e) {
            flashlight_functns = new landscreen(driver);
            flashlight_functns.clap_meth(); 
        }
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

    @Test(priority = 8,description = "Strobe Button Click to contineous flash on and off")
    public void strobe_btn_click(){
        try {
            flashlight_functns.Acceptapp_launch();
            flashlight_functns = new landscreen(driver);
            flashlight_functns.strobe_btn_meth();
            
        } catch (Exception e) {
            flashlight_functns = new landscreen(driver);
            flashlight_functns.strobe_btn_meth();  
        }
    }

    @Test(priority = 9,description = "back button from strobe image page")
    public void strobe_back_img_btn(){
        try {
            flashlight_functns.Acceptapp_launch();
            flashlight_functns = new landscreen(driver);
            flashlight_functns.back_strobe_img_meth();
            
        } catch (Exception e) {
            flashlight_functns = new landscreen(driver);
            flashlight_functns.back_strobe_img_meth();  
        }
    }

    @Test(priority = 10,description = "Camera Button Clickable")
    public void landing_cameraPage(){
        try {
            flashlight_functns.Acceptapp_launch();
            flashlight_functns = new landscreen(driver);
            flashlight_functns.cameraBtn_meth();
            
        } catch (Exception e) {
            flashlight_functns = new landscreen(driver);
            flashlight_functns.cameraBtn_meth();  
        }
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

    @Test(priority = 11,description = "Allow access to record Picture and video")
    public void picture_capture_allow(){
        try {
            flashlight_functns.Acceptapp_launch();
            flashlight_functns = new landscreen(driver);
            flashlight_functns.picture_capture_allow_meth();
            
        } catch (Exception e) {
            flashlight_functns = new landscreen(driver);
            flashlight_functns.picture_capture_allow_meth();  
        }
    }

    @Test(priority = 12,description = "Back from camera page button")
    public void exit_camera_page(){
        try {
            flashlight_functns.Acceptapp_launch();
            flashlight_functns = new landscreen(driver);
            flashlight_functns.cameraPage_back_math();
            
        } catch (Exception e) {
            flashlight_functns = new landscreen(driver);
            flashlight_functns.cameraPage_back_math();  
        }
    }

    @Test(priority = 13,description = "Information page landing")
    public void informationBtn_click(){
        try {
            flashlight_functns.Acceptapp_launch();
            flashlight_functns = new landscreen(driver);
            flashlight_functns.Inform_pagebtn_meth();
            
        } catch (Exception e) {
            flashlight_functns = new landscreen(driver);
            flashlight_functns.Inform_pagebtn_meth();  
        }
    }

    @Test(priority = 14,description = "Exit Information Page")
    public void setting_page_exit(){
        try {
            flashlight_functns.Acceptapp_launch();
            flashlight_functns = new landscreen(driver);
            flashlight_functns.infrmtn_page_back_btn();
            
        } catch (Exception e) {
            flashlight_functns = new landscreen(driver);
            flashlight_functns.infrmtn_page_back_btn();  
        }
    }

    




    
}
