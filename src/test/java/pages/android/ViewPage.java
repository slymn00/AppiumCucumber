package pages.android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.bs.A;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;
import java.util.List;

public class ViewPage {

    public ViewPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(15)),this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Drag and Drop']")
    public MobileElement dragAndDrop;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Date Widgets']")
    public MobileElement dateWidgets;
//elementi list olarak locate ettik do while loop icin
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Switches']")
    public List<MobileElement> switches;
//elementin tek olarak locate ettik UiScrollable icin
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Switches']")
    public MobileElement switchesSingle;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='WebView']")
    public MobileElement webView;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='WebView']")
    public List<MobileElement> webViewList;


}
