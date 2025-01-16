import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {

    @Test
    void multiplyTest() {
        Calculator calc = new Calculator();
        assertEquals(50, calc.multiply(2,25));

        }
        @Test
    void multiplyTest3ARGS() {
        Calculator calc1 = new Calculator();
        assertEquals(100, calc1.multiply(2,10,5));

    }
    }
