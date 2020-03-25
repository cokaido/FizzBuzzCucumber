package fizzbuzz;

public class FizzBuzzApp {
    public static void main(String[] args) {
        FizzBuzz myFizzBuzz = new FizzBuzz();

        for (String argument : args) {
            int number = Integer.parseInt(argument);
            System.out.println(myFizzBuzz.fizzbuzzFor(number));
        }
    }
}
