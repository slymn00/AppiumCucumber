package stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AllPages;
import utilities.ReusableMethods;

public class SpinnerStepDefs {
    AllPages elements=new AllPages();

    @When("kullanici color menusunden {string} secmeli")
    public void kullanici_color_menusunden_secmeli(String text) throws InterruptedException {
        elements.spinnerPage().colorMenuDD.click();
        elements.spinnerPage().blue.click();
        Thread.sleep(2000);
        Assert.assertEquals(text,elements.spinnerPage().selectedBlue.getText());

    }

    @When("kullanici planet menusunden {string} secmeli")
    public void kullanici_planet_menusunden_secmeli(String text) throws InterruptedException {
        elements.spinnerPage().planerMenuDD.click();
        elements.spinnerPage().saturn.click();
        String message=elements.spinnerPage().toastMessage.getAttribute("name");
        Assert.assertEquals("Spinner2: position=5 id=5",message);
        System.out.println(message);
        Thread.sleep(2000);
        Assert.assertTrue(elements.spinnerPage().selectedSaturn.isDisplayed());

    }

    @Then("kullanici {string} tiklasin with UISelector")
    public void kullanici_tiklasin_with_ui_selector(String string) {
        ReusableMethods.scrollWithUiScrollable(string);
    }
}
