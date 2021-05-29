package steps;

import craftsman.NextDateImpl;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;

public class NextDateProblem {

    private NextDateImpl nextDate;

    @Given("^Month (\\d+) Day (\\d+) and Year (\\d+)$")
    public void month_Day_and_Year(int month, int day, int year) {
        nextDate = new NextDateImpl(month, day, year);
    }

    @Then("^I expect next date is \"([^\"]*)\"$")
    public void i_expect_next_date_is(String expectedNextDate) {
        assertEquals(expectedNextDate, nextDate.nextDay().toString());
    }

}
