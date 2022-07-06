package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableSteps {
    @Given("user is om NambaFood")
    public void user_is_om_namba_food() {
        System.out.println("User is on NambaFod");
        
    }
    @When("user click Food")
    public void user_click_food() {
        System.out.println("User clicked button");
        
    }
    @Then("user should find Sushi category")
    public void user_should_find_sushi_category() {
        System.out.println("User found Sushi");
        
    }
    @When("user click on Sushi")
    public void user_click_on_sushi() {
        System.out.println("User clicked on Sushi");
        
    }
    @Then("user should see list of cafes")
    public void user_should_see_list_of_cafes() {
        System.out.println("User see list of Cafes");
        
    }
    @Then("user should scroll down the page Arigato cafes")
    public void user_should_scroll_down_the_page_arigato_cafes() {
        System.out.println("User scroll down to Arigato");
        
    }
    @When("user click on Arigato")
    public void user_click_on_arigato() {
        System.out.println("User clicked Arigato");
        
    }
    @Then("user should see Menu")
    public void user_should_see_menu() {
        System.out.println("User see Arigato menu");
        
    }
    @Then("user should find Kimchi")
    public void user_should_find_kimchi() {
        System.out.println("User should Kimchi");
        
    }
    @When("user increase Kimchi amount to {int}")
    public void user_increase_kimchi_amount_to(Integer KimchiAmount) {
        System.out.println("User increased kimchi amount to: " + KimchiAmount);
        
    }
    @When("user should click on order button")
    public void user_should_click_on_order_button() {
        System.out.println("User clicked on order button");
        
    }
    @Then("on the card user should see {}")
    public void on_the_card_user_should_see(String TotalPriceAmount) {
        System.out.println("Total Price " + TotalPriceAmount);
        
    }

}
