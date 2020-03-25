package fizzbuzz;

public class FizzBuzz {
    public String fizzbuzzFor(int number) {

        String result = "";

        if (number % 3 == 0) {
            result += "Fizz";
        }

        if (number % 5 == 0) {
            result += "Buzz";
        }

        return result != "" ? result : Integer.toString(number);
    }
}
