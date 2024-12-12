package menu.controller;

import java.util.ArrayList;
import java.util.List;
import menu.model.CoachNames;
import menu.model.DislikeMenus;
import menu.model.Information;
import menu.model.Recommendation;
import menu.service.MenuService;
import menu.view.InputView;
import menu.view.OutputView;

public class MenuController {

    private final MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    public void run() {
        OutputView.printStartGuidance();
        CoachNames coachNames = returnCoachNames();
        List<DislikeMenus> everyDislikeMenus = new ArrayList<>();
        for (String coachName : coachNames.getCoachNames()) {
            everyDislikeMenus.add(returnDislikeMenus(coachName));
        }

        List<Recommendation> everyRecommendation = menuService.recommend(Information.from(coachNames, everyDislikeMenus));
        OutputView.printMenuRecommendation(everyRecommendation);
        OutputView.printEndGuidance();
    }

    private CoachNames returnCoachNames() {
        while (true) {
            try {
                OutputView.printCoachNameGuidance();
                return InputView.readCoachNames();
            } catch (RuntimeException e) {
                OutputView.printErrorMessage(e);
            }
        }
    }

    private DislikeMenus returnDislikeMenus(String coachName) {
        while (true) {
            try {
                OutputView.printDislikeMenusGuidance(coachName);
                return InputView.readDislikeMenus();
            } catch (RuntimeException e) {
                OutputView.printErrorMessage(e);
            }
        }
    }
}
