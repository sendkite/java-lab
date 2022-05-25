package calculator.v2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator cal;

    @BeforeEach
    void setUp() {
        cal = new Calculator();
    }

    @DisplayName("더하기")
    @Test
    void add() throws Exception {
        assertEquals(0, cal.add(""));
        assertEquals(3, cal.add("1,2"));
        assertEquals(6, cal.add("1,2:3"));
        assertEquals(6, cal.add("1,2,3"));
        assertEquals(6, cal.add("//;\n1;2;3"));
        assertThrows(RuntimeException.class, () -> {
           cal.add("-2");
        });
    }

    @AfterEach
    void tearDown() {
    }
}