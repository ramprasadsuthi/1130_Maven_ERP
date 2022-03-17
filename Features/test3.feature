@Feature
Feature: Title of your feature
  I want to use this template for my feature file

  @TC-1
  Scenario Outline: Sum of two numbers 
    Given Get the value of <a> and <b>
    When Add a and b
    Then Verify the addition with <sum>

    Examples: 
      | a   | b   | sum  |
      | 100 | 50  | 150  |
      | 100 | 150 | 250  |
      | 100 | 250 | 150  |
      | 10  | 50  | 60   |
      | 100 | 350 | 450  |
