Feature: Calculator2
  As a user i want to use a calculator to add numbers

  Scenario Outline: Add two numbers
    Given I have a calculator
    When I sum two numbers <num1> and <num2>
    Then result is <result>

    Examples:
      | num1 | num2 | result |
      | -2   | -3   | -5     |