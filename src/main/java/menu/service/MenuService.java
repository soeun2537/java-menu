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
        List<Recommendation> everyRecommendation = initializeRecommendation(information);
        for (int day = 0; day < 5; day++) {
            recommendOneDay(information, everyRecommendation);
        }
        return everyRecommendation;
    }

    private static List<Recommendation> initializeRecommendation(Information information) {
        List<Recommendation> everyRecommendation = new ArrayList<>();
        for (int coach = 0; coach < information.getCoachNames().size(); coach++) {
            everyRecommendation.add(Recommendation.initialize(information.getCoachNames().getCoachNames().get(coach)));
        }
        return everyRecommendation;
    }

    private void recommendOneDay(Information information, List<Recommendation> everyRecommendation) {
        for (int coach = 0; coach < information.getCoachNames().size(); coach++) {
            String menu = pickRandomMenu();
            List<String> recommendation = everyRecommendation.get(coach).getRecommendation();
            menu = processDraw(information.getDislikeMenus().get(coach).getDislikeMenus().contains(menu), menu);
            menu = processDraw(Menu.isMoreThanTwoCategory(recommendation, menu), menu);
            menu = processDraw(recommendation.contains(menu), menu);
            everyRecommendation.get(coach).getRecommendation().add(menu);
        }
    }

    private String processDraw(boolean information, String menu) {
        while (information) {
            menu = pickRandomMenu();
        }
        return menu;
    }

    private String pickRandomMenu() {
        Category category = Category.recommendCategory(Randoms.pickNumberInRange(1, 5));
        return Menu.recommendMenu(category);
    }
}
