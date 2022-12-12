import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTests {

    @Test
    public void CalculatorMultiply35() {
        String result = Calculator.multiply(3, 5);
        assertEquals("15.0", result);
    }

    @Test
    public void CalculatorDivide35() {
        String result = Calculator.divide(3, 5);
        assertEquals("0.6", result);
    }

    @Test
    public void CalculatorOnePOne() {
        String result = Calculator.sum(1, 1);
        assertEquals("2.0", result);
    }

    @Test
    public void CalculatorSixtyonePSeventytwo() {
        String result = Calculator.sum(61, 72);

        assertEquals("133.0", result);
    }

    @Test
    public void CalculatorSubtract35() {
        String result = Calculator.subtract(3, 5);
        assertEquals("-2.0", result);
    }


}
