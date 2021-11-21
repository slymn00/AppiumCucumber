package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.android.PreferencePage;
import pages.android.SwitchPage;
import utilities.Driver;

public class SwitchStepDefinitions {

        PreferencePage preferencePage=new PreferencePage();
        SwitchPage switchPage=new SwitchPage();

    @Then("kullanici Switch tiklasin")
    public void kullanici_switch_tiklasin() {
        preferencePage.switchButton.click();
    }

    @Then("ilk Switch butonu acik olmali")
    public void ilk_switch_butonu_acik_olmali() {
        TouchAction touchAction=new TouchAction(Driver.getAppiumDriver());
        if (switchPage.firstSwitchButtonu.getAttribute("checked").equals("false")) {
            touchAction.tap(TapOptions.tapOptions()
                            .withElement(ElementOption.element(switchPage.firstSwitchButtonu)))
                    .perform();
        }

    }

    @Then("ilk Switch butonunun acik oldugunu onayla")
    public void ilk_switch_butonunun_acik_oldugunu_onayla() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals("true",switchPage.firstSwitchButtonu.getAttribute("checked"));

    }

    @Then("ilk switch butonu kapali olmali")
    public void ilk_switch_butonu_kapali_olmali() {
        if (switchPage.firstSwitchButtonu.getAttribute("checked").equals("true")){
            TouchAction touchAction=new TouchAction(Driver.getAppiumDriver());
            touchAction.tap(TapOptions.tapOptions()
                    .withElement(ElementOption.element(switchPage.firstSwitchButtonu)))
                    .perform();
        }

    }

    @Then("ilk switch butonunun kapali oldugunu onayla")
    public void ilk_switch_butonunun_kapali_oldugunu_onayla() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals("false",switchPage.firstSwitchButtonu.getAttribute("checked"));


    }

    @Then("ikinci switch butonu acik olmali")
    public void ikinci_switch_butonu_acik_olmali() {
        if (switchPage.secondSwitchButtonu.getAttribute("checked").equals("false")){
            TouchAction touchAction=new TouchAction(Driver.getAppiumDriver());
            touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(switchPage.secondSwitchButtonu))).perform();

        }

    }

    @Then("ikinci switch butonu acik oldugunu onayla")
    public void ikinci_switch_butonu_acik_oldugunu_onayla() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals("true",switchPage.secondSwitchButtonu.getAttribute("checked"));

    }

}
