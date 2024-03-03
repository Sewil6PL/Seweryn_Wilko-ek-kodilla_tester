Feature: FizzBuzz Game

  As a player
  I want to play the FizzBuzz game
  So that I can see the correct output for a given number

  Scenario Outline: FizzBuzz game outputs correct result for a given number
    Given a number <number>
    When I play the FizzBuzz game
    Then the output should be "<expectedOutput>"

    Examples:
      | number | expectedOutput |
      | 3      | Fizz           |
      | 5      | Buzz           |
      | 15     | FizzBuzz       |
      | 7      | None           |