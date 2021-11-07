package testing.cucumbertest.calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class CalculatorSteps {

  private int total;

  private Calculator calculator;

  @Before
  public void init() {
    total = -999;
    System.out.println("before hook");
  }

  @Given("^I have a calculator$")
  public void initializeCalculator() throws Throwable {
    calculator = new Calculator();
  }

  @Given("^I want to begin$")
  public void beginPrint() throws Throwable {
    System.out.println("begin of every calculation of every scenario");
  }

  @When("^I add (-?\\d+) and (-?\\d+)$")
  public void testAdd(int num1, int num2) throws Throwable {
    total = calculator.add(num1, num2);
  }

  @Then("^the result should be (-?\\d+)$")
  public void validateResult(int result) throws Throwable {
    Assert.assertEquals(total, result);
  }

  @Then("^something will fail$")
  public void failMethod(int result) throws Throwable {
    Assert.assertEquals(0, 1);
  }

}
