package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class BasePage {

    @FindBy(xpath = "//span[contains(text(),'Sign in')]")
    private WebElement singInButton;

    protected static WebDriver driver;
    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public void clickSingInButton() {
        singInButton.click();

    }
}

