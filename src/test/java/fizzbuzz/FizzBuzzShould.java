package fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;

public class FizzBuzzShould {
    private FizzBuzz myFizzBuzz;

    @BeforeEach void
    init() {
        myFizzBuzz = new FizzBuzz();
    }

    @Test public void
    generate_one_when_we_send_number_one() {
        String result = myFizzBuzz.fizzbuzzFor(1);
        assertEquals("1", result);
    }

    @Test public void
    generate_two_when_we_send_number_two() {
        String result = myFizzBuzz.fizzbuzzFor(2);
        assertEquals("2", result);
    }

    @Test public void
    generate_four_when_we_send_number_four() {
        String result = myFizzBuzz.fizzbuzzFor(4);
        assertEquals("4", result);
    }

    @Test public void
    generate_fizz_when_we_send_three() {
        String result = myFizzBuzz.fizzbuzzFor(3);
        assertEquals("Fizz", result);
    }

    @Test public void
    generate_fizz_when_we_send_multiple_of_three() {
        String result = myFizzBuzz.fizzbuzzFor(6);
        assertEquals("Fizz", result);
        result = myFizzBuzz.fizzbuzzFor(9);
        assertEquals("Fizz", result);
    }
    @Test public void
    generate_buzz_when_we_send_five() {
        String result = myFizzBuzz.fizzbuzzFor(5);
        assertEquals("Buzz", result);
    }

    @Test public void
    generate_buzz_when_we_send_multiple_of_five() {
        String result = myFizzBuzz.fizzbuzzFor(10);
        assertEquals("Buzz", result);
        result = myFizzBuzz.fizzbuzzFor(20);
        assertEquals("Buzz", result);
    }

    @Test public void
    generate_fizzbuzz_when_we_send_multiple_of_three_and_five() {
        String result = myFizzBuzz.fizzbuzzFor(15);
        assertEquals("FizzBuzz", result);
        result = myFizzBuzz.fizzbuzzFor(30);
        assertEquals("FizzBuzz", result);
    }
}
