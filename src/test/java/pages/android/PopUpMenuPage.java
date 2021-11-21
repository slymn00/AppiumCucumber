package pages.android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class PopUpMenuPage {
    public PopUpMenuPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(15)),this);
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@text='MAKE A POPUP!']")
    public MobileElement popUpButonu;

    @AndroidFindBy(xpath = "//android.widget.ListView")
    public MobileElement acilanButonPenceresi;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Add']")
    public MobileElement addButonu;

    @AndroidFindBy(xpath = "//android.widget.Toast")
    public MobileElement toastMessage;

}
