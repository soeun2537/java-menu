package menu.view;

import static menu.constant.InputConstant.*;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;
import java.util.stream.Collectors;
import menu.model.CoachNames;
import menu.model.DislikeMenus;
import menu.util.Parser;
import menu.util.Validator;


public class InputView {

    public static CoachNames readCoachNames() {
        String input = input();
        List<String> coachNames = Parser.separateBySeparator(input, INPUT_SEPARATOR.getContent());
        for (String coachName : coachNames) {
            Validator.validateCoachName(coachName);
        }
        Validator.validateCoachNames(coachNames);
        return CoachNames.from(coachNames);
    }

    public static DislikeMenus readDislikeMenus() {
        String input = input();
        List<String> dislikeMenus = Parser.separateBySeparator(input, INPUT_SEPARATOR.getContent());
        for (String disLikeMenu : dislikeMenus) {
            Validator.validateDislikeMenu(disLikeMenu);
        }
        Validator.validateDislikeMenus(dislikeMenus);
        List<String> parsedDislikeMenus = dislikeMenus.stream()
                .map(Parser::replaceBlankToUnderBar)
                .collect(Collectors.toList());
        return DislikeMenus.from(parsedDislikeMenus);
    }

    private static String input() {
        return Console.readLine();
    }
}
