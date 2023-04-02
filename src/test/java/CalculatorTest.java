import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {
    Calculator calc = new Calculator();
    @Test
    public void TestAddition() {
        assertEquals("Addition of Two Numbers", 56.0, calc.add(34, 22), 1e-15);
        assertEquals("Addition of Two Numbers", 146.0, calc.add(58, 88), 1e-15);
    }
    @Test
    public void TestSubtraction() {
        assertEquals("Subtraction of Two Numbers", 56.0, calc.subtract(78, 22), 1e-15);
        assertEquals("Subtraction of Two Numbers", 146.0, calc.subtract(234, 88), 1e-15);
    }
    @Test
    public void TestMultiplication() {
        assertEquals("Multiplication of Two Numbers", 56.0, calc.multiply(2, 28), 1e-15);
        assertEquals("Multiplication of Two Numbers", 128.0, calc.multiply(32, 4), 1e-15);
    }
    @Test
    public void TestDivision() {
        assertEquals("Division of Two Numbers", 17.0, calc.divide(34, 2), 1e-15);
        assertEquals("Division of Two Numbers", 16, calc.divide(128, 8), 1e-15);
    }
    @Test
    public void TestFactorial() {
        assertEquals("Factorial of a Number", 24, calc.factorial(4), 1e-15);
        assertEquals("Factorial of a Number", 120, calc.factorial(5), 1e-15);
    }

    @Test
    public void TestPower() {
        assertEquals("Finding power for True Positive", 8, calc.power(2, 3), 1e-15);
        assertEquals("Finding power for True Positive", 1, calc.power(1, 3), 1e-15);
    }

    @Test
    public void TestRoot() {
        assertEquals("Finding square root for True Positive", 4, calc.squareRoot(16), 1e-15);
        assertEquals("Finding square root for True Positive", 1, calc.squareRoot(1), 1e-15);
    }

    @Test
    public void TestLog() {
        assertEquals("Finding natural log for True Positive", 0, calc.naturalLog(1), 1e-15);
        assertNotEquals("Finding natural log for False Positive", 60, calc.naturalLog(2.4), 1e-15);
    }
}
