package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.MainPage;

public class CreateNewAccountStepDefs {
    MainPage mainPage = new MainPage();
    @Given("I am on the main page")
    public void i_am_on_the_main_page() {

        mainPage.createDriver();
    }

    @When("I click on the Sing in Button")
    public void i_click_on_the_sing_in_button() {

        mainPage.clickSingInButton();
    }

    @When("I click on the create new account button")
    public void i_click_on_the_create_new_account_button() {

    }

    @When("click Mr. social title button")
    public void click_mr_social_title_button() {

    }

    @When("enter {string} into first name field")
    public void enter_into_first_name_field(String string) {

    }

    @When("enter {string} into second name field")
    public void enter_into_second_name_field(String string) {

    }

    @When("enter {string} into email field")
    public void enter_into_email_field(String string) {

    }

    @When("enter {string} into password field")
    public void enter_into_password_field(String string) {

    }

    @When("enter {string} into birthday date field")
    public void enter_into_birthday_date_field(String string) {

    }

    @When("click on the Customer Privacy Button")
    public void click_on_the_customer_privacy_button() {

    }

    @When("click on the click Agree Button")
    public void click_on_the_click_agree_button() {

    }

    @When("click on the click Save Button")
    public void click_on_the_click_save_button() {

    }

    @Then("I see main page with login in the right top of the page")
    public void i_see_main_page_with_login_in_the_right_top_of_the_page() {

    }


}
