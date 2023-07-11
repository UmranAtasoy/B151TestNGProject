package techproed.tests.day26_PagesKullanimi;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.OpenSourcePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C01_PageKullanimi {
    @Test
    public void test01() {
        //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login adrese gidelim
        //Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Driver.getDriver().get(ConfigReader.getProperty("opensourceUrl"));
        //kullaniciAdi, kullaniciSifre, submitButton elementlerini locate edelim
        //kullanici adi= Admin --> .properties dosyasinda
        //kullanici sifre= admin123 --> .properties dosyasinda
        /*
        Locateleri olusturdugumuz page classindaki webelementlere ulasabilmek icin
        assagidaki ornekteki gibi classdaki const. dan obje olusturduk
         */
        OpenSourcePage sourcePage = new OpenSourcePage();
        sourcePage.username.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        sourcePage.password.sendKeys(ConfigReader.getProperty("sifre"));
        sourcePage.loginButton.click();


       //Login Testinin basarili oldugunu test et
        Assert.assertTrue(sourcePage.verify.isDisplayed());






    }
}
