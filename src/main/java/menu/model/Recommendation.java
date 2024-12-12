package menu.model;

import java.util.ArrayList;
import java.util.List;

public class Recommendation {

    private String name;
    private List<String> recommendation;

    private Recommendation(String name, List<String> recommendation) {
        this.name = name;
        this.recommendation = recommendation;
    }

    public static Recommendation initialize(String name) {
        return new Recommendation(name, new ArrayList<>());
    }

    public String getName() {
        return name;
    }

    public List<String> getRecommendation() {
        return recommendation;
    }
}
