package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AllPages;
import utilities.Driver;

public class DragDropStepDefs {

    AllPages elements=new AllPages();

    @When("kullanici Views tiklasin")
    public void kullanici_views_tiklasin() {
        elements.apiDemosPage().views.click();
    }

    @Then("kullanici drag and drop tiklasin")
    public void kullanici_drag_and_drop_tiklasin() {
        elements.viewPage().dragAndDrop.click();

    }

    @Then("kullanici ilk noktayi alip ucuncu noktaya tasiyacak")
    public void kullanici_ilk_noktayi_alip_ucuncu_noktaya_tasiyacak() throws InterruptedException {
        TouchAction touchAction=new TouchAction(Driver.getAppiumDriver());
        touchAction.longPress(ElementOption.element(elements.dragDropPage().dot1))//basili tutuyorum
                .moveTo(ElementOption.element(elements.dragDropPage().dot3))//surukluyorum
                .release()//elimi cekiyorum
                .perform();

        Thread.sleep(5000);

    }

    @Then("cikan yaziyi onaylayacak")
    public void cikan_yaziyi_onaylayacak() {

        Assert.assertTrue(elements.dragDropPage().textMessage.isDisplayed());


    }
}
