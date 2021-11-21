package pages.android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class SpinnerPage {
    public SpinnerPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(10)),this);
    }


    @AndroidFindBy(id = "com.touchboarder.android.api.demos:id/spinner1")
    public MobileElement colorMenuDD;

    @AndroidFindBy(id = "com.touchboarder.android.api.demos:id/spinner2")
    public MobileElement planerMenuDD;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='blue']")
    public MobileElement blue;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Saturn']")
    public MobileElement saturn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='blue']")
    public MobileElement selectedBlue;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Saturn']")
    public MobileElement selectedSaturn;

    @AndroidFindBy(xpath = "//android.widget.Toast")
    public MobileElement toastMessage;




}
