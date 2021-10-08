Feature: FizzBuzz functional test
  Scenario: First FizzBuzz test
    Given Calling the play method
    When the number is 3
    Then the result should be "Fizz"

  Scenario: Second FizzBuzz test
    Given Calling the play method again
    When the number is 10
    Then the result should be "Buzz"

  Scenario: Third FizzBuzz test
    Given Calling the play method again
    When the number is 15
    Then the result should be "FizzBuzz"