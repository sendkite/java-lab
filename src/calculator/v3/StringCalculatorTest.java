package calculator.v3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    private StringCalculator cal;

    @BeforeEach
    public void setUp() {
        cal = new StringCalculator();
    }

    @DisplayName("null 아니면 빈문자")
    @Test
    public void emptyString()  {
        assertEquals(0, cal.add(null));
        assertEquals(0, cal.add(""));
    }

    @DisplayName("숫자가 하나")
    @Test
    public void addOneNumber() {
        assertEquals(1, cal.add("1"));
    }

    @DisplayName("두개 숫자 쉼펴*(,) 구분자로 연산")
    @Test
    public void add_쉼표() {
        assertEquals(3, cal.add("1,2"));
    }

    @Test
    public void split() {
        assertArrayEquals(new String[] {"1"}, "1".split(","));
        assertArrayEquals(new String[] {"1", "2"}, "1,2".split(","));
    }

}