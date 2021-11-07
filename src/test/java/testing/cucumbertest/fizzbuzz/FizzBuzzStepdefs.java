package testing.cucumbertest.fizzbuzz;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.jupiter.api.Assertions;


public class FizzBuzzStepdefs {

  FizzBuzz fizzBuzz = new FizzBuzz();
  String result;

  @Given("^Calling the play method$")
  public void callingThePlayMethod() {
    System.out.println("Beginning of the test");
  }

  @When("^the number is (\\d+)$")
  public void theNumberIs(int arg0) {
    result = fizzBuzz.play(arg0);
  }

  @Then("^the result should be \"([^\"]*)\"$")
  public void theResultShouldBe(String arg0) throws Throwable {
    Assertions.assertEquals(result, arg0);
  }

  @Given("^Calling the play method again$")
  public void callingThePlayMethodAgain() {
    System.out.println("Running test again now");
  }
}
