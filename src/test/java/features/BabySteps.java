package features;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;

//@RunWith(Cucumber.class)
//@Cucumber.Options(features = "src/test/resources/features")
public class BabySteps {

    @Given(value = "^I have a baby$")
    public void I_have_a_baby() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @When(value = "^I make a baby 'happy'$")
    public void I_make_a_baby_happy() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Then(value = "^the baby should 'smile'$")
    public void the_baby_should_smile() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }


}
