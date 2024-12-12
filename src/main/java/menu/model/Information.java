package menu.model;

import java.util.List;

public class Information {

    private CoachNames coachNames;
    private List<DislikeMenus> dislikeMenus;

    private Information(CoachNames coachNames, List<DislikeMenus> dislikeMenus) {
        this.coachNames = coachNames;
        this.dislikeMenus = dislikeMenus;
    }

    public static Information from(CoachNames coachNames, List<DislikeMenus> dislikeMenus) {
        return new Information(coachNames, dislikeMenus);
    }

    public CoachNames getCoachNames() {
        return coachNames;
    }

    public List<DislikeMenus> getDislikeMenus() {
        return dislikeMenus;
    }
}
