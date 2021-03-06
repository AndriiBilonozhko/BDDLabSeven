package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends BasePage {


    @FindBy(xpath = "//input[@name='id_gender'][1]")
    private WebElement socialTitleButton;

    @FindBy(xpath = "//input[@name='firstname']")
    private WebElement firstNameField;

    @FindBy(xpath = "//input[@name='lastname']")
    private WebElement lastNameField;

    @FindBy(xpath = "//div[@class='col-md-6']//input[@name='email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@name='birthday']")
    private WebElement birthdayDateField;

    @FindBy(xpath = "//input[@name ='customer_privacy']")
    private WebElement customerPrivacyButton;

    @FindBy(xpath = "//input[@name='psgdpr']")
    private WebElement agreeButton;

    @FindBy(xpath = "//button[contains(@class,'form-control')]")
    private WebElement saveButton;

    @FindBy(xpath = "//li[text()='Invalid format.']")
    private WebElement invalidFormMessage;

    @FindBy(xpath = "//div[contains(@class,'form-group')]//li[@class='alert alert-danger']")
    private WebElement fieldWithInvalidFormText;


    public LogInPage() {
        PageFactory.initElements(getDriver(), this);
    }


//    public void fillRegistrationForm(String firstName, String lastName, String email, String password, String birthdayDate){
//        this.inputFirstName(firstName);
//        this.inputLastName(lastName);
//        this.inputEmail(email);
//        this.inputPassword(password);
//        this.inputBirthdayDate(birthdayDate);
//
//    }






    public LogInPage ChooseSocialTitle() {
        socialTitleButton.click();
        return this;


    }

    public LogInPage inputFirstName(String name) {
        firstNameField.sendKeys(name);
        return this;
    }

    public LogInPage inputLastName(String lastName) {
        lastNameField.sendKeys(lastName);
        return this;
    }

    public LogInPage inputEmail(String email) {
        emailField.sendKeys(email);
        return this;
    }

    public LogInPage inputPassword(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public LogInPage inputBirthdayDate(String birthday) {
        birthdayDateField.sendKeys(birthday);
        return this;
    }

    public LogInPage clickCustomerPrivacyButton() {
        customerPrivacyButton.click();
        return this;
    }

    public LogInPage clickAgreeButton() {
        agreeButton.click();
        return this;
    }

    public MainPage clickSaveButton() {
        saveButton.click();
        return new MainPage();
    }

    public LogInPage clickSaveButtonWithIncorrectDate() {
        saveButton.click();
        return this;
    }

    public String getColorOfFirstNameField() {

        return firstNameField.getCssValue("outline");

    }

    public String getTextInvalidForm() {

        return fieldWithInvalidFormText.getText();
    }
}
