package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class landscreen {
    // Notification Deny
    @FindBy(id = "com.android.permissioncontroller:id/permission_deny_button")
    public static WebElement Notifictn_deny;
    //Accept terms and services to get started
    @FindBy(id ="com.rvappstudios.flashlight:id/rel_getstart")
    public static WebElement acceptapp;
    //turn on/of flash innercircle button 
    @FindBy(id = "com.rvappstudios.flashlight:id/btnInnerCircle")
    public static WebElement btnInnerCircle;
    // Screen Flsh Button
    @FindBy(id = "com.rvappstudios.flashlight:id/btnScreenFlash")
    public static WebElement screenflashbtn;
    // Dismiss screenflashBtn
    @FindBy(id = "com.rvappstudios.flashlight:id/btnDismiss")
    public static WebElement ScreendismissBtn;
    //flash buttonTap to sudden flash on off
    @FindBy(id = "com.rvappstudios.flashlight:id/btnTap")
    public static WebElement btnTap;
    // Button Shake clickable true
    @FindBy(id = "com.rvappstudios.flashlight:id/btnShake")
    public static WebElement btnShake;
    //Button clap to turn on/flash
    @FindBy(id = "com.rvappstudios.flashlight:id/btnClap")
    public static WebElement clapbtn;
    //Button allow access for clap btn
    @FindBy(id = "com.rvappstudios.flashlight:id/btnAllowAccess")
    public static WebElement btnAllowAccessClap;
    // allow to record audio access button
    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    public static WebElement record_audio_access;
    //Strobe Button for contineous flash on/off
    @FindBy(id = "com.rvappstudios.flashlight:id/btnStrobe")
    public static WebElement strobeBtn;
    // Image strobe back button
    @FindBy(id = "com.rvappstudios.flashlight:id/imgStrobeBack")
    public static WebElement imgStrobe_backBtn;
    //button Camera
    @FindBy(id = "com.rvappstudios.flashlight:id/btnCamera")
    public static WebElement btnCamera;
    //Allow Access to camera Button
    @FindBy(id = "com.rvappstudios.flashlight:id/btnAllowAccess")
    public static WebElement btnAllowAccessCamera;
    // Access to record pictures and videos
    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    public static WebElement recordVideoAccess;
    //Back button from video imamge
    @FindBy(id = "com.rvappstudios.flashlight:id/imgCameraBack")
    public static WebElement imgCameraBack;
    // Information Button
    @FindBy(id = "com.rvappstudios.flashlight:id/btnInfo")
    public static WebElement BtnInfo;
    // back button from INfo page
    @FindBy(id = "com.rvappstudios.flashlight:id/imgInfoBack")
    public static WebElement imgInfoBackBtn;

    AndroidDriver driver;

    public landscreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void deny_notifictn(){
        Notifictn_deny.click();
    }


    public void Acceptapp_launch() throws InterruptedException{
        Thread.sleep(4000);
        acceptapp.click();
    }

    // InnerCircle Button to turn on Flash
    public boolean Circle_flsh_btn_on(){
        btnInnerCircle.click();
        return btnInnerCircle.isSelected();
    }

    // Screenflash button to turn on screen flash
    public void ScreenFalsh_meth(){
        screenflashbtn.click();
    }

    // back button to dismiss Screenflash
    public void DismissScreenFlash_meth(){
        ScreendismissBtn.click();
    }

    //BUtten tap option to quick on/off flash
    public void Button_tap_meth(){
        btnTap.click();
    }

    //Button Shake option to turn flash when mobile shake
    public void btn_shake_meth(){
        btnShake.click();
    }

    //Clap Button to turn on flash when clap
    public void clap_meth(){
        clapbtn.click();
    } 

    //Button allow clap
    public void allow_clap_btn_meth(){
        btnAllowAccessClap.click();
    }

    // allow to record audio
    public void audio_allow_meth(){
        record_audio_access.click();
    }

    //Strobe Button to contineous flash trigger
    public void strobe_btn_meth(){
        strobeBtn.click();
    }

    //back button to dismiss image strobe page
    public void back_strobe_img_meth(){
        imgStrobe_backBtn.click();
    }

    //button camera
    public void cameraBtn_meth(){
        btnCamera.click();
    }

    //Allow Access Camera button
    public void allow_camera_meth(){
        btnAllowAccessCamera.click();
    }

    //Allow to capture picture videos
    public void picture_capture_allow_meth(){
        recordVideoAccess.click();
    }

    //Back button of Image camera page
    public void cameraPage_back_math(){
        imgCameraBack.click();
    }

    //Button Information button
    public void Inform_pagebtn_meth(){
        BtnInfo.click();
    }

    //Back button of information page(setting Page)
    public void infrmtn_page_back_btn(){
        imgInfoBackBtn.click();
    }





    
}
