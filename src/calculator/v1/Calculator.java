package calculator.v1;

public class Calculator {

    int add(int i, int j) {
        return i + j;
    }

    int sub(int i, int j) {
        return i - j;
    }

    int multiply(int i, int j) {
        return i * j;
    }

    int divide(int i, int j) {
        return i / j;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(3, 4));
    }
}
