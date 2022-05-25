package calculator.v2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

    public int add(String numberStr) {
        return inputCheck(numberStr);
    }

    private int getSumNumber(String numberStr) {
        if (numberStr.contains(",") || numberStr.contains(":")) {
            String[] result = numberStr.split(",|:");
            ArrayList<String> numbers = new ArrayList<>(Arrays.asList(result));
            return numbers.stream()
                    .mapToInt(Integer::parseInt).sum();
        }

        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(numberStr);
        if (matcher.find()) {
            String cutVal = matcher.group(1);
            String[] result = matcher.group(2).split(cutVal);
            ArrayList<String> numbers = new ArrayList<>(Arrays.asList(result));
            return numbers.stream()
                    .mapToInt(Integer::parseInt).sum();
        }
        return Integer.parseInt(numberStr);
    }

    public Integer inputCheck(String numberStr) {
        if (Objects.equals(numberStr, "")) {
            return 0;
        }

        if (numberStr.isEmpty() || numberStr == null) {
            return 0;
        }

        if (numberStr.contains("-")) {
            throw new RuntimeException("음수는 사용할 수 없습니다.");
        }
        return getSumNumber(numberStr);
    }
}
