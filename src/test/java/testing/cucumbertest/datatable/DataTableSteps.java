package testing.cucumbertest.datatable;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;

public class DataTableSteps {

  @Given("^I am using given statement$")
  public void begin() {
    System.out.println("hello, it is beginning.");
  }

  @Then("^do something afterwards$")
  public void afterwards() {
    System.out.println("do something afterwards");
  }

  @When("^I enter some data$")
  public void iEnterData(DataTable table) {
    List<List<String>> data = table.raw();
    for (List<String> row : data) {
      System.out.println(row.get(0) + " : " + row.get(1));
    }
  }

}
