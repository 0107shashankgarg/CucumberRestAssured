package cucumber;

import apiEngine.EndPoints;
import enums.Context;

public class TestContext {
    private final String BASE_URL = "https://bookstore.toolsqa.com";
    private final EndPoints endPoints;
    private final String USER_ID = "49ee17cd-cd6c-4261-adfd-c3b40655fd35";
    private final ScenarioContext scenarioContext;

    public TestContext() {
        endPoints = new EndPoints(BASE_URL);
        scenarioContext = new ScenarioContext( );
        scenarioContext.setContext(Context.USER_ID, USER_ID);
    }

    public EndPoints getEndPoints() {
        return endPoints;
    }

    public ScenarioContext getScenarioContext() {
        return scenarioContext;
    }

}
