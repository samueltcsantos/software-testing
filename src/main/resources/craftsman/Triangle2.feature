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

  Scenario Outline: Worst Case Test Cases
    Given the triangle sides <a> <b> <c>
    Then I expect triangle type is <output>

    Examples:
      |  a    |  b    |   c    |  output          |
      |  1    |  1    |   1    | "Equilateral"    |
      |  1    |  1    |   2    | "Not a Triangle" |
      |  1    |  1    |  100   | "Not a Triangle" |
      |  1    |  1    |  199   | "Not a Triangle" |
      |  1    |  1    |  200   | "Not a Triangle" |
      |  1    |  2    |   1    | "Not a Triangle" |
      |  1    |  2    |   2    | "Isosceles"      |
      |  1    |  2    |  100   | "Not a Triangle" |
      |  1    |  2    |  199   | "Not a Triangle" |
      |  1    |  2    |  200   | "Not a Triangle" |
      |  1    |  100  |   1    | "Not a Triangle" |
      |  1    |  100  |   2    | "Not a Triangle" |
      |  1    |  100  |  100   | "Isosceles"      |
      |  1    |  100  |  199   | "Not a Triangle" |
      |  1    |  100  |  200   | "Not a Triangle" |
      |  1    |  199  |   1    | "Not a Triangle" |
      |  1    |  199  |   2    | "Not a Triangle" |
      |  1    |  199  |  100   | "Not a Triangle" |
      |  1    |  199  |  199   | "Isosceles"      |
      |  1    |  199  |  200   | "Not a Triangle" |
      |  1    |  200  |   1    | "Not a Triangle" |
      |  1    |  200  |   2    | "Not a Triangle" |
      |  1    |  200  |  100   | "Not a Triangle" |
      |  1    |  200  |  199   | "Not a Triangle" |
      |  1    |  200  |  220   | "Isosceles" |


