Feature: NextDate Problem

  Scenario Outline: Worst Case Test Cases
    Given Month <mm> Day <dd> and Year <yyyy>
    Then I expect next date is <NextDate>

    Examples:
    |   mm  |    dd    |   yyyy  |  NextDate          |
    |  1    |    1     |   1812  | "January 2, 1812"  |
    |  1    |    1     |   1813  | "January 2, 1813"  |
    |  1    |    1     |   1912  | "January 2, 1912"  |
    |  1    |    1     |   2011  | "January 2, 2011"  |
