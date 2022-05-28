package calculator.v4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SpringCalculatorTest {

    private SpringCalculator cal;

    @BeforeEach
    private void setUp() {
        cal = new SpringCalculator();
    }

    @DisplayName("null 이나 공백오면 0")
    @Test
    public void testEmpty() {
        Assertions.assertEquals(0, cal.add(""));
        Assertions.assertEquals(0, cal.add(null));
    }

    @DisplayName("숫자가 하나가 들어오면 리턴")
    @Test
    public void testNumOne() {
        Assertions.assertEquals(2, cal.add("2"));
    }

    @DisplayName("구분자로 분리해서 연산")
    @Test
    public void testContain() {
        Assertions.assertEquals(3, cal.add("1,2"));
    }

    @DisplayName("slit test")
    @Test
    public void testSplit() {
        Assertions.assertArrayEquals(new String[] {"1"}, "1".split(","));
        Assertions.assertArrayEquals(new String[] {"1", "2"}, "1,2".split(","));
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