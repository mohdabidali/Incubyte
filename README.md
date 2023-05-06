String Calculator Application

The String Calculator Application is a simple calculator that takes a string of numbers separated by delimiters and returns their sum. It also supports custom delimiters and validates the input for negative numbers.

Requirements
JDK 11
Maven

Features

Supports an empty string, single number, or two numbers separated by a comma.
Handles an unknown amount of numbers.
Accepts new lines as delimiters between numbers.
Supports custom delimiters.
Throws an exception for negative numbers, showing all negative numbers in the exception message.

Getting Started

Clone the repository to your local machine.
Navigate to the project root directory in your terminal.
Running the Application
From the project root directory, execute the following command:
mvn spring-boot:run


The application will start, but since it is a simple calculator with no user interface, you can use the unit tests to test the functionality.

Running Unit Tests

To run the unit tests, execute the following command from the project root directory:
mvn test


This command will run all the unit tests and display the results in the terminal.

Using the Calculator

To use the calculator in your code, you can create an instance of the StringCalculatorApplication class and call the add method, passing the input string as an argument.

StringCalculatorApplication calculator = new StringCalculatorApplication();
int result = calculator.add("1,2,3");

