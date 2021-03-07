Feature: Calculator
  As a user i want to use a calculator to add numbers

  @base
  Scenario Outline: Add two numbers case 1
    Given I have a calculator
    When I sum two numbers <num1> and <num2>
    Then result is <result>

    Examples:
      | num1 | num2 | result |
      | -2   | 3    | 1      |
      | 1    | 6    | 7      |