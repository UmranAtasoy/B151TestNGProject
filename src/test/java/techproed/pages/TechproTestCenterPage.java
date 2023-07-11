package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import techproed.utilities.Driver;

public class TechproTestCenterPage {
    /*once konstraktır olustur
    daha sonra PageFactory ile driver i bu class a tanimlariz
     */
    public TechproTestCenterPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

        @FindBy(xpath = "(//*[@class='form-control'])[1]")
        public WebElement username;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@class='col-md-8']")
    public WebElement verify;

    @FindBy(xpath = "//*[@class='fa fa-sign-out-alt']")
    public WebElement logOutButton;

    @FindBy(xpath = "//h2")
    public WebElement logoutVerify;

}
