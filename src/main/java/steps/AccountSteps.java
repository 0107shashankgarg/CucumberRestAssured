package steps;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
import pojos.requests.AuthorizationRequest;

public class AccountSteps extends BaseStep {

    public AccountSteps(TestContext testContext) {
        super(testContext);
    }

    @Given("I am an authorized user")
    public void iAmAnAuthorizedUser() {
        getEndPoints( ).authenticateUser(new AuthorizationRequest("shashank-test", "Test@@123"));
    }
}
