package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public abstract class BasePage {


    protected static WebDriver driver;

    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }

    public static WebDriver getDriver() {
        return driver;
    }



    public void openMainPage() {
        getDriver().get(" https://demo.prestashop.com/");

        try {
            new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.id("loadingMessage")));
        } catch (Exception a) {
        }
        try {
            Boolean webElement = new WebDriverWait(driver, 5).until(ExpectedConditions.invisibilityOfElementLocated(By.id("loadingMessage")));

        } catch (Exception a) {
        }

        getDriver().switchTo().frame("framelive");
    }

    public void scrollToElement(WebElement element) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);

    }

    protected Boolean isErrorExist(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        return (Boolean) js.executeScript("return arguments[0].checkValidity();", element);

    }
}

