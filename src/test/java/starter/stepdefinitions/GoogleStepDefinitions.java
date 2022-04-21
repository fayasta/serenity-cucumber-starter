package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.steps.GoogleSteps;

public class GoogleStepDefinitions {

    @Steps
    GoogleSteps googleSteps;


    @Given("I open a browser with google")
    public void iOpenABrowserWithGoogle() {
        googleSteps.openGoogle();
    }

    @When("I search for {string}")
    public void iSearchFor(String entry) {
        googleSteps.searchGoogle(entry);
    }

    @Then("I should get results")
    public void iShouldGetResults() {

    }

}
