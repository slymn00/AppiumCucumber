package stepdefinitions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Dimension;
import pages.AllPages;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class ScrollStepDefs {

    AllPages elements=new AllPages();



    @Then("kullanici Switches tiklasin")
    public void kullanici_switches_tiklasin() {

        List<MobileElement> list;
        do {
            list=elements.viewPage().switches;

            //bu ile cihazin olcusunu(inch) almis olduk.
            //scroll up
            Dimension dimension = Driver.getAppiumDriver().manage().window().getSize();

            int start_x = (int) (dimension.width * 0.5); //cihazin tam ortasi demek
            int start_y = (int) (dimension.height * 0.8); //yuksekligin baslagic noktasi asagidan (asagidan yukari scroll icin bu) burasini 0.2 asagidaki heighti 0.8
            //yaparsak yukaridan asagiya olur

            int end_x = (int) (dimension.width * 0.5); //scrollun bitis noktasi yine ekranin ortasi
            int end_y = (int) (dimension.height * 0.2); // ve yukardan elimi cekecegim nokta

            TouchAction touchAction = new TouchAction(Driver.getAppiumDriver());
            touchAction.press(PointOption.point(start_x, start_y)).moveTo(PointOption.point(end_x, end_y)).perform();

        }while (list.size()==0); //size'm sifira esit olmayana dek devam et scroll'a diyor

        elements.viewPage().switches.get(0).click();


    }

    @Then("kullanici UiScrollable ile Switches tiklasin")
    public void kullaniciUiScrollableIleSwitchesTiklasin() {

        AndroidDriver driver= (AndroidDriver) Driver.getAppiumDriver();
        // bu sadece androidle calisir dedigimiz icin driverin android oldugunu tanimlamamiz
        //lazim cunku biz burda appium driver cagiriyoruz o yuzden olmaz android lazim
        //bu yuzden androide has bir method kullanacagim icin driver cagirmam lazim
        //yani 51. satirdaki gibi de driveri tanimlayabilirim yada kendisi bize cast yapabiliyor
        /*
      UiScrollable() sadece android sisteminde calisir cunku Android SDK uzerinden calisyor.
      Yazdigimiz kodda verilen text e kadar scroll yapmasi (scrollIntoView()) ve texti bulunca durmasini istedik.
      ve buldugumuz elemente senaryomuza gore tikladik.
      **** UiScrollable() kendimiz yazmamiz gerektigi icin hata olmamasina dikkat etmeliyiz.
      Detayli bakmak icin link incelenebilir.
      https://developer.android.com/reference/androidx/test/uiautomator/UiScrollable
       */

        ((AndroidDriver<?>) Driver.getAppiumDriver())
                .findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Switches\"))");
        //bu kod bana switches textinin oldugu yere kadar scroll yap view olana kadar

        elements.viewPage().switchesSingle.click();


    }

    @Then("kullanici UiScrolable ile {string} tiklasin")
    public void kullaniciUiScrolableIleTiklasin(String text) {

      /*  AndroidDriver driver= (AndroidDriver) Driver.getAppiumDriver();

        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+kelime+"\"))");

        elements.viewPage().webView.click();*/
     /*   List<MobileElement> list;

        do {
            list=elements.viewPage().webViewList;
            Dimension dimension=Driver.getAppiumDriver().manage().window().getSize();

            int x_start= (int) (dimension.width*0.5);
            int y_start= (int) (dimension.height*0.8);

            int x_end= (int) (dimension.width*0.5);
            int y_end= (int) (dimension.height*0.2);

            TouchAction touchAction=new TouchAction(Driver.getAppiumDriver());

            touchAction.press(PointOption.point(x_start,y_start)).moveTo(PointOption.point(x_end,y_end)).perform();


        }while (list.size()==0);

        elements.viewPage().webView.click();*/

        //        ((AndroidDriver<?>) Driver.getAppiumDriver()).
//                findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))");
//
//        elements.viewsPage().webView.click();
        //reusable method kullaniyoruz
        ReusableMethods.scrollWithUiScrollable(text);

    }
}
