package stepDefs;

import pages.CommonMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utils.Hooks;

public class CommonSteps extends Hooks {

    CommonMethods commonMethods = new CommonMethods();

    @Given("the user is on the {string}")
    public void the_user_is_on_the(String pageName) {
        commonMethods.getValidatePage(pageName);

    }

    @Then("the user enters username and password")
    public void the_user_enters_username_and_password() {
        commonMethods.enterCredentials();
    }

    @Then("the user clicks on login button")
    public void the_user_clicks_on_login_button() {
       commonMethods.clickLogin();
    }

    @Then("the user should be navigated to {string} page")
    public void the_user_should_be_navigated_to_page(String pageName) {
        commonMethods.getValidatePage(pageName);
    }


}
