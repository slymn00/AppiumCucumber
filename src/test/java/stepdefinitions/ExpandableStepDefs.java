package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AllPages;
import utilities.ReusableMethods;

public class ExpandableStepDefs {

    AllPages elements=new AllPages();

    @When("kullanici {string} basili tuttugunda")
    public void kullanici_basili_tuttugunda(String string) {
        ReusableMethods.longPressOnElement(elements.expandableListsPage().arnold);
    }

    @Then("popup ciktigini onayla")
    public void popup_ciktigini_onayla() {
        Assert.assertEquals("Sample menu",elements.expandableListsPage().sampleMenu.getText());

    }
}
