package menu.view;

import static menu.constant.InputConstant.*;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;
import menu.util.Parser;
import menu.util.Validator;


public class InputView {

    public static List<String> readCoachNames() {
        String input = input();
        List<String> coachNames = Parser.separateBySeparator(input, INPUT_SEPARATOR.getContent());
        for (String coachName : coachNames) {
            Validator.validateCoachName(coachName);
        }
        Validator.validateCoachNames(coachNames);
        return coachNames;
    }

    public static List<String> readDislikeMenus() {
        String input = input();
        List<String> disLikeMenus = Parser.separateBySeparator(input, INPUT_SEPARATOR.getContent());
        for (String disLikeMenu : disLikeMenus) {
            Validator.validateDislikeMenu(disLikeMenu);
        }
        Validator.validateDislikeMenus(disLikeMenus);
        return disLikeMenus;
    }

    private static String input() {
        return Console.readLine();
    }
}
