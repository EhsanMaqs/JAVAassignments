import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTests {

    @Test
    @DisplayName("Testing if multiplication with 3 and 5 works")
    public void CalculatorMultiply35() {
        double result = Calculator.multiply(3, 5);
        assertEquals(15.0, result, 0.0);
    }

    @Test
    @DisplayName("Testing if division with 3 and 5 works")
    public void CalculatorDivide35() {
        double result = Calculator.divide(3, 5);
        assertEquals(0.6, result, 0.0);
    }

    @Test
    @DisplayName("Testing if division by zero is throwing an exception")
    public void CalculatorDivideByZero() {
        assertThrows(ArithmeticException.class, () -> Calculator.divide(3,0));
    }

    @Test
    @Disabled
    public void CalculatorOnePOne() {
        double result = Calculator.sum(1, 1);
        assertEquals(2.0, result, 0.0);
    }

    @Test
    @Disabled
    public void CalculatorSixtyonePSeventytwo() {
        double result = Calculator.sum(61, 72);

        assertEquals(133.0, result, 0.0);
    }

    @Test
    public void CalculatorSubtract35() {
        double result = Calculator.subtract(3, 5);
        assertEquals(-2.0, result, 0.0);
    }
}
