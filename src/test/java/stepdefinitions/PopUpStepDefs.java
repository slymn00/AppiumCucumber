package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AllPages;
import utilities.Driver;

public class PopUpStepDefs {

    AllPages elements=new AllPages();
    @Then("kullanici popup butona tiklasin")
    public void kullanici_popup_butona_tiklasin() {
        TouchAction touchAction=new TouchAction(Driver.getAppiumDriver());
        touchAction.tap(ElementOption.element(elements.popUpMenuPage().popUpButonu)).perform();

    }

    @Then("kullanici pencerenin acildigini onaylasin")
    public void kullanici_pencerenin_acildigini_onaylasin() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(elements.popUpMenuPage().acilanButonPenceresi.isDisplayed());

    }

    @Then("kullanici add butonuna tiklasin")
    public void kullanici_add_butonuna_tiklasin() {
        elements.popUpMenuPage().addButonu.click();

    }

    @Then("kullanici gelen popup da {string} kelimesinin odugunu onaylasin")
    public void kullanici_gelen_popup_da_kelimesinin_odugunu_onaylasin(String gelenKelime) {

        Assert.assertTrue(elements.popUpMenuPage().toastMessage.getAttribute("name").contains(gelenKelime));
    }
}
