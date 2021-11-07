package testing.cucumbertest.fizzbuzz;

public class FizzBuzz {
  public String play(int myNumber){

    if (myNumber % 3 == 0 && myNumber % 5 == 0) {
      return "FizzBuzz";
    } else if (myNumber % 3 == 0) {
      return "Fizz";
    } else if (myNumber % 5 == 0) {
      return "Buzz";
    } else {
      return "No";
    }

  }

}
