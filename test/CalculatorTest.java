
package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testAddition() {
        Calculator calc = new Calculator();
        assertEquals(15, calc.add(10, 5));
    }

    @Test
    void testSubtraction() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.subtract(10, 5));
    }

    @Test
    void testMultiplication() {
        Calculator calc = new Calculator();
        assertEquals(50, calc.multiply(10, 5));
    }

    @Test
    void testDivision() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.divide(10, 5));
    }

    @Test
    void testDivisionByZero() {
        Calculator calc = new Calculator();
        assertThrows(
            ArithmeticException.class,
            () -> calc.divide(10, 0)
        );
    }
}
