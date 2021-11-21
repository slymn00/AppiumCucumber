package pages.ios;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class AlertViewsPage {
    public AlertViewsPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(15)),this);
    }
    @iOSXCUITFindBy(accessibility = "OK")  //iOSXCUITFindBy annotaionu otomatik olarak gelmedigi icin once androidby annotaionini yapip daha sonra yukardaki
    public MobileElement okButton;          //import kismindan AndroidFindBy yerini silip onun yerin iOSXCUITFindBy yazarsak annotaiona ulasmis oluruz.

    @iOSXCUITFindBy(className = "XCUIElementTypeOther")
    public MobileElement textBox;
}
