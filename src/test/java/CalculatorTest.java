import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}
