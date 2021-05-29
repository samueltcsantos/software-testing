Feature: Triangle2 - Structured Implementation

  Scenario Outline: Boundary value Analysis Test Cases
    Given the triangle sides <a> <b> <c>
    Then I expect triangle type is <output>

    Examples:
      |  a    |  b    |   c    |  output          |
      | 100   | 100   |   1    | "Isosceles"      |
      | 100   | 100   |   2    | "Isosceles"      |
      | 100   | 100   |  100   | "Equilateral"    |
      | 100   | 100   |  199   | "Isosceles"      |
      | 100   | 100   |  200   | "Not a Triangle" |
      | 100   |  1    |  100   | "Isosceles"      |
      | 100   |  2    |  100   | "Isosceles"      |
      | 100   | 199   |  100   | "Isosceles"      |
      | 100   | 200   |  100   | "Not a Triangle" |
      |  1    | 100   |  100   | "Isosceles"      |
      |  2    | 100   |  100   | "Isosceles"      |
      | 199   | 100   |  100   | "Isosceles"      |
      | 200   | 100   |  100   | "Not a Triangle" |