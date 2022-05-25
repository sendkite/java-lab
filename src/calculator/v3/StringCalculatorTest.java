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

    @DisplayName("null 아니면 빈문자 인풋")
    @Test
    public void emptyString()  {
        assertEquals(0, cal.add(null));
        assertEquals(0, cal.add(""));
    }

    @DisplayName("숫자 하나 연산")
    @Test
    public void addOneNumber() {
        assertEquals(1, cal.add("1"));
    }

    @DisplayName("숫자 두개 쉼표(,) 구분자로 연산")
    @Test
    public void add_쉼표() {
        assertEquals(3, cal.add("1,2"));
    }

    @DisplayName("String[] 쪼개기 테스트")
    @Test
    public void split() {
        assertArrayEquals(new String[] {"1"}, "1".split(","));
        assertArrayEquals(new String[] {"1", "2"}, "1,2".split(","));
    }

    @DisplayName("쉼표(,)와 콜론(:) 구분자 사용")
    @Test
    public void 쉼표_콜론() throws Exception {
        assertEquals(6, cal.add("1,2:3"));
    }

    @DisplayName("커스텀 구분자로 연산")
    @Test
    public void add_custom_구분자() throws Exception {
        assertEquals(6, cal.add("//;\n1;2;3"));
    }

    @DisplayName("음수 인풋 테스트")
    @Test
    public void add_negative() throws Exception {
        assertThrows(RuntimeException.class, () -> {
            cal.add("-1,2,3");
        });
    }
}