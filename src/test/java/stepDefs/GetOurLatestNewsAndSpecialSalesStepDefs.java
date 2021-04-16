package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import pages.MainPage;

public class GetOurLatestNewsAndSpecialSalesStepDefs {
    MainPage mainPage = new MainPage();



    @When("I scroll main page to email field and enter {string} into email field")
    public void i_scroll_main_page_to_email_field_and_enter_into_email_field(String eMail) throws InterruptedException {
        mainPage.setEmail(eMail);
    }

    @When("I click on the subscribe button")
    public void I_click_on_the_subscribe_button(){mainPage.clickSubscribeButton();}

    @Then("I check is error message visibility")
    public void i_check_is_error_message_visibility() {

        Assertions.assertThat(mainPage.isErrorMessageExist()).isFalse();

    }
}
