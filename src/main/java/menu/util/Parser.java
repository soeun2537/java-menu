package menu.util;

import static menu.constant.InputConstant.*;

import java.util.Arrays;
import java.util.List;

public class Parser {

    private Parser() {
    }

    public static List<String> separateBySeparator(String input, String separator) {
        return Arrays.asList(input.split(separator));
    }

    public static String replaceUnderBarToBlank(String input) {
        return input.replaceAll(UNDER_BAR.getContent(), BLANK.getContent());
    }

    public static String replaceBlankToUnderBar(String input) {
        return input.replaceAll(BLANK.getContent(), UNDER_BAR.getContent());
    }
}
