package steps;

import craftsman.TriangleStructuredImpl;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleStructuredProblem {

    private TriangleStructuredImpl triangle;

    @Given("^the triangle sides (\\d+) (\\d+) (\\d+)$")
    public void the_triangle_sides(int a, int b, int c) {
        triangle = new TriangleStructuredImpl(a, b, c);
    }

    @Then("^I expect triangle type is \"([^\"]*)\"$")
    public void i_expect_triangle_type_is(String triangleType) {
        assertEquals(triangleType, triangle.triangleType());
    }

}
