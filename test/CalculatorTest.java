import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {

    @Test
    void multiplyTest() {
        Calculator calc = new Calculator();
        assertEquals(50, calc.multiply(2,25));

        }
    }
