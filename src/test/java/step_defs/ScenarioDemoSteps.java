package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioDemoSteps {

    @Given("user is on Facebook")
    public void user_is_on_facebook() {
        System.out.println("User is on Facebook");
        
    }
    @When("user enters {string}")
    public void user_enters(String email) {
        System.out.println("User enter" + email + "on email field");
        
    }
    @When("user enter {string}")
    public void user_enter(String password) {
        System.out.println("User password" + password);
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        System.out.println("User clicked login button");
    }
    @Then("user should see {string}")
    public void user_should_see(String massage) {
        System.out.println("Message is" + massage);
    }

}
