package calculator.v1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator cal;

    @BeforeEach
    public void setUp() {
        cal = new Calculator();
    }

    @DisplayName("더하기")
    @Test
    public void add() {
        assertEquals(9, cal.add(6, 3));
    }

    @DisplayName("빼기")
    @Test
    public void subtract() {
        assertEquals(3, cal.sub(6, 3));
    }

    @DisplayName("나누기")
    @Test
    public void divide() {
        assertEquals(2, cal.divide(6, 3));
    }

    @DisplayName("곱하기")
    @Test
    public void multiply() {
        assertEquals(18, cal.multiply(6, 3));
    }

    @AfterEach
    void tearDown() {
        System.out.println("tear down");
    }

}