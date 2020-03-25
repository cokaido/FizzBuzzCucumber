Feature: Obtain the right result based on the parameters
  We want to run fizzbuzz app and check the result based on the parameters

  Scenario: No parameters are sent
    Given we send no params
    When we call fizzbuzz app
    Then we should see nothing

  Scenario: Only three or multiple of three are sent
    Given we send "3 6 9 12"
    When we call fizzbuzz app
    Then we should see "Fizz,Fizz,Fizz,Fizz"

  Scenario: Only five or multiple of five are sent
    Given we send "5 10 20 40"
    When we call fizzbuzz app
    Then we should see "Buzz,Buzz,Buzz,Buzz"

  Scenario: Only non multiples of three and five are sent
    Given we send "1 2 4 7 13"
    When we call fizzbuzz app
    Then we should see "1,2,4,7,13"

  Scenario: All types of numbers are sent
    Given we send "1 3 5 7 9 15 25"
    When we call fizzbuzz app
    Then we should see "1,Fizz,Buzz,7,Fizz,FizzBuzz,Buzz"