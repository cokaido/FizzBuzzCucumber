package fizzbuzz;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class StepDefinitions {
    private String[] parameters;
    private String currentAnswer;
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private PrintStream originalOut = System.out;

    @Before
    public void setUpStream() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStream() {
        System.setOut(originalOut);
    }

    @Given("we send no params")
    public void we_send_no_params() {
        parameters = new String[]{};
    }

    @When("we call fizzbuzz app")
    public void we_call_fizzbuzz_app() {
        FizzBuzzApp.main(parameters);

        String returned = outContent.toString();

        if (returned.length() == 0) {
            currentAnswer = "";
            return;
        }

        currentAnswer = returned.substring(0, returned.length()-1).replaceAll("\n", ",");
    }

    @Then("we should see nothing")
    public void we_should_see_nothing() {
        assertEquals("", currentAnswer);
    }

    @Given("we send {string}")
    public void we_send(String params) {
        parameters = params.split(" ");
    }

    @Then("we should see {string}")
    public void we_should_see(String expectedAnswer) {
        assertEquals(expectedAnswer, currentAnswer);
    }

}
