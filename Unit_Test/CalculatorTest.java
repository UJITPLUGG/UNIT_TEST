package Unit_Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    //Hello from Dxd4
    @org.junit.jupiter.api.Test
    void sum() {
        Calculator calc = new Calculator();
        int result = calc.sum(4, 5);
        assertEquals(9,result);
    }

    @org.junit.jupiter.api.Test
    void minus() {
        Calculator calc = new Calculator();
        int result = calc.minus(5, 4);
        assertEquals(2,result); // Expected: 2, actual: 1
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        Calculator calc = new Calculator();
        int result = calc.multiply(4, 5);
        assertEquals(20,result);
    }

    @org.junit.jupiter.api.Test
    void divide() {
        Calculator calc = new Calculator();
        int result = calc.divide(20, 4);
        assertEquals(5,result);
    }
}