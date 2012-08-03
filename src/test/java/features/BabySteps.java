package features;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import junit.framework.Assert;

//@RunWith(Cucumber.class)
//@Cucumber.Options(features = "features")
public class BabySteps {

    @Given("^I have a baby$")
    public void I_have_a_baby() throws Throwable {
        Baby baby = new Baby();
    }

    @When("^I make a baby happy$")
    public void I_make_a_baby_happy() throws Throwable {
        Assert.assertTrue(false);
    }

    @Then("^the baby should smile$")
    public void the_baby_should_smile() throws Throwable {
        // Express the Regexp above with the code you wish you had
        Assert.assertTrue(true);
    }

}
