package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberDemoSteps {


    @Given("User is login in to the https:\\/\\/www.facebook.com\\/")
    public void user_is_login_in_to_the_https_www_facebook_com() {
        System.out.println("User is on Facebook.com");
        
    }
    @When("User enter test@test.com to email fields")
    public void user_enter_test_test_com_to_email_fields() {
        System.out.println("User entered test@test.com to email input field");
        
    }
    @When("User Should enter Hello1234 in password input field")
    public void user_should_enter_hello1234_in_password_input_field() {
        System.out.println("User Should enter Hello1234 in password input field" );
        
    }
    @When("User should click on log In button")
    public void user_should_click_on_log_in_button() {
        System.out.println("Click log In button");
        
    }
    @Then("User should successfully logged in to the Facebook")
    public void user_should_successfully_logged_in_to_the_facebook() {
        System.out.println(" User successfully logged in to the Facebook");
        
    }


}
