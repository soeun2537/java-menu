package menu.view;

import static menu.constant.message.OutputMessage.*;

import java.util.List;
import menu.model.Recommendation;
import menu.util.Parser;

public class OutputView {

    public static void printStartGuidance() {
        println(START_GUIDANCE.getMessage());
    }

    public static void printCoachNameGuidance() {
        printNewLine();
        println(COACH_NAME_GUIDANCE.getMessage());
    }

    public static void printDislikeMenusGuidance(String coachName) {
        printNewLine();
        println(DISLIKE_MENU_GUIDANCE.getMessage(coachName));
    }

    public static void printMenuRecommendation(List<Recommendation> everyRecommendation) {
        printNewLine();
        println(MENU_RECOMMENDATION_GUIDANCE.getMessage());
        println(MENU_RECOMMENDATION_DAY_GUIDANCE.getMessage());
        println(MENU_RECOMMENDATION_CATEGORY_GUIDANCE.getMessage());
        printRecommendations(everyRecommendation);
    }

    private static void printRecommendations(List<Recommendation> recommendations) {
        for (Recommendation recommendation : recommendations) {
            println(MENU_RECOMMENDATION.getMessage(
                    recommendation.getName(),
                    Parser.replaceUnderBarToBlank(recommendation.getRecommendation().get(0)),
                    Parser.replaceUnderBarToBlank(recommendation.getRecommendation().get(1)),
                    Parser.replaceUnderBarToBlank(recommendation.getRecommendation().get(2)),
                    Parser.replaceUnderBarToBlank(recommendation.getRecommendation().get(3)),
                    Parser.replaceUnderBarToBlank(recommendation.getRecommendation().get(4))));
        }
    }

    public static void printEndGuidance() {
        printNewLine();
        println(END_GUIDANCE.getMessage());
    }

    public static void printErrorMessage(RuntimeException e) {
        printNewLine();
        println(e.getMessage());
    }

    private static void println(String content) {
        System.out.println(content);
    }

    private static void printNewLine() {
        System.out.print(System.lineSeparator());
    }
}
