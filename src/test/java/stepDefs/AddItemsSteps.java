package stepDefs;


import pages.AddItemsPage;
import cucumber.api.java.en.Then;

public class AddItemsSteps {

    AddItemsPage addItemsPage = new AddItemsPage();

    @Then("the user adds the most expensive item to the cart")
    public void the_user_adds_the_most_expensive_item_to_the_cart() throws InterruptedException {
        addItemsPage.addMostExpensiveItemtotheCart();
    }

    @Then("the user can see the most expensive item in the cart")
    public void the_user_can_see_the_most_expensive_item_in_the_cart() {
       addItemsPage.verifyCartItems();
    }


}
