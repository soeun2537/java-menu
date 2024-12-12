package menu.model;

import java.util.Collections;
import java.util.List;

public class CoachNames {

    private List<String> coachNames;

    private CoachNames(List<String> coachNames) {
        this.coachNames = coachNames;
    }

    public static CoachNames from(List<String> coachNames) {
        return new CoachNames(coachNames);
    }

    public int size() {
        return coachNames.size();
    }

    public List<String> getCoachNames() {
        return Collections.unmodifiableList(coachNames);
    }
}
