Feature: Calculator
  As a user, I want to use a calculator to add numbers

  Background:
    Given I have a calculator
    And I want to begin

  Scenario: Add two numbers -2 & 3
    Given I have a calculator
    When I add -2 and 3
    Then the result should be 1

  @SmokeTest
  Scenario: Add two numbers 10 & 15
    Given I have a calculator
    When I add 10 and 15
    Then the result should be 25
    But something will fail

  Scenario Outline: Add two numbers <num1> & <num2>
    Given I have a calculator
    When I add <num1> and <num2>
    Then the result should be <total>

    Examples:
      | num1 | num2 | total |
      | -2 | 3 | 1 |
      | 10 | 15 | 25 |
      | 99 | -99 | 0 |
      | -1 | -10 | -11 |