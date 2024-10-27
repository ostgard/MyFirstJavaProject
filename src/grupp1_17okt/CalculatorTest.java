package grupp1_17okt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addition() {
        Calculator calculator = new Calculator(3, 4);
        assertEquals(7, calculator.addition());

    }
}