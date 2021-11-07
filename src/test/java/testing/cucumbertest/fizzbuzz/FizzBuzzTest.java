package testing.cucumbertest.fizzbuzz;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/testing/cucumbertest/fizzbuzz"},
    glue = {"testing/cucumbertest/fizzbuzz"})
public class FizzBuzzTest {

}
