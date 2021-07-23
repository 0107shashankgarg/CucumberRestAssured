import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "Features"
        , glue = {"steps"},
        monochrome = true,
        publish = true
)

public class TestRunner {

}