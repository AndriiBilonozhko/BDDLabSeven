package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MainPage extends BasePage {
    @FindBy(xpath = "//span[contains(text(),'Sign in')]")
    private WebElement singInButton;

    @FindBy(xpath = "//div[@class ='user-info']//span")
    private WebElement userLoginField;

    @FindBy(xpath = "//input[@type='email']")
    private WebElement inputEmailField;

    @FindBy(xpath = "//input[@name='submitNewsletter']")
    private WebElement subscribeButton;

    public MainPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void clickSingInButton() {
        singInButton.click();

    }

    public String getTextFromUserLoginField() {
        return userLoginField.getText();

    }
    public MainPage setEmail(String eMail) throws InterruptedException {
        WebElement element = inputEmailField;
        scrollToElement(element);
        inputEmailField.sendKeys(eMail);
        return this;
    }
    public Boolean isErrorMessageExist() {

        return isErrorExist(inputEmailField);


    }

    public MainPage clickSubscribeButton() {
        subscribeButton.click();
        return this;
    }
}
