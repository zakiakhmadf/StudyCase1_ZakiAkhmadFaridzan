package demo;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    stepNotifications = true,
    //for plugin check https://cucumber.io/docs/cucumber/reporting/
    plugin = {"json:build/cucumber.json", "pretty", "html:build/result"},
    features = "src/test/resources/features", tags = {"(@Android and @Checkout) or (@Android and @Login)"})
public class CucumberRunner {

}
