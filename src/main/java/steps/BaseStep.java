package steps;

import apiEngine.EndPoints;
import cucumber.ScenarioContext;
import cucumber.TestContext;

public class BaseStep {

    //private static final String BASE_URL = "https://bookstore.toolsqa.com";
    private final EndPoints endPoints;
    private final ScenarioContext scenarioContext;

    public BaseStep(TestContext testContext) {
        endPoints = testContext.getEndPoints( );
        scenarioContext = testContext.getScenarioContext( );

    }

    public EndPoints getEndPoints() {
        return endPoints;
    }

    public ScenarioContext getScenarioContext() {

        return scenarioContext;
    }
}
