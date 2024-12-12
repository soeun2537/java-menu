package menu.model;

import java.util.List;

public class DislikeMenus {

    private List<String> dislikeMenus;

    private DislikeMenus(List<String> dislikeMenus) {
        this.dislikeMenus = dislikeMenus;
    }

    public static DislikeMenus from(List<String> dislikeMenus) {
        return new DislikeMenus(dislikeMenus);
    }

    public List<String> getDislikeMenus() {
        return dislikeMenus;
    }
}
