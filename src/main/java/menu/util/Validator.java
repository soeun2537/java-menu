package menu.util;

import static menu.constant.InputConstant.*;
import static menu.constant.message.ErrorMessage.*;

import java.util.ArrayList;
import java.util.List;

public class Validator {

    private Validator() {
    }

    public static void validateCoachName(String input) {
        validateNotNull(input);
        validateCharacter(input);
        validateLength(input, 2, 4);
    }

    public static void validateCoachNames(List<String> inputs) {
        validateRange(inputs, 2, 5, INVALID_NAME_COUNT.getMessage());
        validateDuplicate(inputs, DUPLICATE_NAME.getMessage());
    }

    public static void validateDislikeMenu(String input) {
        validateCharacter(input);
    }

    public static void validateDislikeMenus(List<String> inputs) {
        validateRange(inputs, 0, 2, INVALID_MENU_COUNT.getMessage());
        validateDuplicate(inputs, DUPLICATE_MENU.getMessage());
    }

    private static void validateNotNull(String input) {
        if (input == null || input.isBlank()) {
            throw new IllegalArgumentException(INVALID_FORMAT.getMessage());
        }
    }

    private static void validateCharacter(String input) {
        if (!input.matches(NICKNAME_PATTERN.getContent())) {
            throw new IllegalArgumentException(INVALID_FORMAT.getMessage());
        }
    }

    private static void validateLength(String input, int minLength, int maxLength) {
        if (input.length() < minLength || input.length() > maxLength) {
            throw new IllegalArgumentException(INVALID_NAME_FORMAT.getMessage());
        }
    }

    private static void validateRange(List<String> inputs, int minRange, int maxRange, String errorMessage) {
        if (inputs.size() < minRange || inputs.size() > maxRange) {
            throw new IllegalArgumentException(errorMessage);
        }
    }

    private static void validateDuplicate(List<String> inputs, String errorMessage) {
        List<String> uniqueInputs = new ArrayList<>();
        for (String input : inputs) {
            if (uniqueInputs.contains(input)) {
                throw new IllegalArgumentException(errorMessage);
            }
            uniqueInputs.add(input);
        }
    }
}
