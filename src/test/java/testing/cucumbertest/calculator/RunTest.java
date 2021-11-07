package testing.cucumbertest.calculator;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/testing/cucumbertest/calculator/calculator.feature"},
    glue = {"testing/cucumbertest/calculator"},
    plugin = {"pretty", "html:src/test/java/testing/cucumbertest/calculator/html",
        "junit:src/test/java/testing/cucumbertest/calculator/calculator.xml",
        "json:src/test/java/testing/cucumbertest/calculator/html/calculator.json"},
    tags = {"~@SmokeTest"})
public class RunTest {

}
