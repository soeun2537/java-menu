package menu.service;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;
import menu.model.Category;
import menu.model.Information;
import menu.model.Menu;
import menu.model.Recommendation;

public class MenuService {

    public List<Recommendation> recommend(Information information) {
        List<Recommendation> everyRecommendation = new ArrayList<>();
        for (int coach = 0; coach < information.getCoachNames().size(); coach++) {
            everyRecommendation.add(Recommendation.initialize(information.getCoachNames().getCoachNames().get(coach)));
        }
        for (int day = 0; day < 5; day++) {
            for (int coach = 0; coach < information.getCoachNames().size(); coach++) {
                String menu = pickRandomMenu();
                List<String> recommendation = everyRecommendation.get(coach).getRecommendation();
                while (true) {
                    if (!information.getDislikeMenus().get(coach).getDislikeMenus().contains(menu)) {
                        break;
                    }
                    menu = pickRandomMenu();
                }
                while (true) {
                    if (!Menu.isMoreThanTwoCategory(recommendation, menu)) {
                        break;
                    }
                    menu = pickRandomMenu();
                }
                while (true) {
                    if (!recommendation.contains(menu)) {
                        break;
                    }
                    menu = pickRandomMenu();
                }
                everyRecommendation.get(coach).getRecommendation().add(menu);
            }
        }
        return everyRecommendation;
    }

    private String pickRandomMenu() {
        Category category = Category.recommendCategory(Randoms.pickNumberInRange(1, 5));
        return Menu.recommendMenu(category);
    }

//    private List<String> recommendForOneCoach(int coachNumber, Information information) {
//        List<String> recommendation = new ArrayList<>();
//        if (information.getDislikeMenus().get(coachNumber))
//    }
}
