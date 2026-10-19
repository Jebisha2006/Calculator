
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testAddition() {
        assertEquals(15, calc.add(10, 5));
    }

    @Test
    void testSubtraction() {
        assertEquals(5, calc.subtract(10, 5));
    }

    @Test
    void testMultiplication() {
        assertEquals(50, calc.multiply(10, 5));
    }

    @Test
    void testDivision() {
        assertEquals(2, calc.divide(10, 5));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class,
                () -> calc.divide(10, 0));
    }
}
