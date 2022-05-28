package calculator.v4;

import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpringCalculator {

    public int add(String text) {
        if (isCollectInput(text)) {
            return 0;
        }
        return toSum(beSplit(text));
    }

    private Boolean isCollectInput(String text) {
        if (text == null) {
            return true;
        }
        if (text.contains("-")) {
            throw new RuntimeException();
        }
        return Objects.equals(text, "");
    }

    private String[] beSplit(String text) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
        if (m.find()) {
            String customDelimeter = m.group(1);
            return m.group(2).split(customDelimeter);
        }
        return text.split(",|:");
    }

    private int toSum(String[] numStr) {
        return Arrays.stream(numStr).mapToInt(Integer::parseInt).sum();
    }
}
