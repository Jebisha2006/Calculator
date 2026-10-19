

package calculator;

import java.util.logging.Logger;

public class Calculator {
    private static final Logger LOGGER =
            Logger.getLogger(Calculator.class.getName());

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        LOGGER.info("Addition: " + calc.add(10, 5));
        LOGGER.info("Subtraction: " + calc.subtract(10, 5));
        LOGGER.info("Multiplication: " + calc.multiply(10, 5));
        LOGGER.info("Division: " + calc.divide(10, 5));
    }
}

