package menu.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import menu.util.Parser;

public enum Menu {
    규동(Category.일식.name()),
    우동(Category.일식.name()),
    미소시루(Category.일식.name()),
    스시(Category.일식.name()),
    가츠동(Category.일식.name()),
    오니기리(Category.일식.name()),
    하이라이스(Category.일식.name()),
    라멘(Category.일식.name()),
    오코노미야끼(Category.일식.name()),
    김밥(Category.한식.name()),
    김치찌개(Category.한식.name()),
    쌈밥(Category.한식.name()),
    된장찌개(Category.한식.name()),
    비빔밥(Category.한식.name()),
    칼국수(Category.한식.name()),
    불고기(Category.한식.name()),
    떡볶이(Category.한식.name()),
    제육볶음(Category.한식.name()),
    깐풍기(Category.중식.name()),
    볶음면(Category.중식.name()),
    동파육(Category.중식.name()),
    짜장면(Category.중식.name()),
    짬뽕(Category.중식.name()),
    마파두부(Category.중식.name()),
    탕수육(Category.중식.name()),
    토마토_달걀볶음(Category.중식.name()),
    고추잡채(Category.중식.name()),
    팟타이(Category.아시안.name()),
    카오_팟(Category.아시안.name()),
    나시고렝(Category.아시안.name()),
    파인애플_볶음밥(Category.아시안.name()),
    쌀국수(Category.아시안.name()),
    똠얌꿍(Category.아시안.name()),
    반미(Category.아시안.name()),
    월남쌈(Category.아시안.name()),
    분짜(Category.아시안.name()),
    라자냐(Category.양식.name()),
    그라탱(Category.양식.name()),
    뇨끼(Category.양식.name()),
    끼슈(Category.양식.name()),
    프렌치_토스트(Category.양식.name()),
    바게트(Category.양식.name()),
    스파게티(Category.양식.name()),
    피자(Category.양식.name()),
    파니니(Category.양식.name()),
    ;

    private final String category;

    Menu(String category) {
        this.category = category;
    }

    public static String recommendMenu(Category category) {
        List<String> menus = findMenuByCategory(category);
        return Parser.replaceBlankToUnderBar(Randoms.shuffle(menus).get(0));
    }

    public static boolean isMoreThanTwoCategory(List<String> menus, String addMenu) {
        List<String> categories = new ArrayList<>();
        for (String menu : menus) {
            categories.add(findCategoryByMenu(menu));
        }
        if (Collections.frequency(categories, findCategoryByMenu(addMenu)) >= 2) {
            return true;
        }
        return false;
    }

    private static List<String> findMenuByCategory(Category category) {
        List<String> menus = new ArrayList<>();
        for (Menu menu : values()) {
            if (menu.category.equals(category.name())) {
                menus.add(menu.name());
            }
        }
        return menus;
    }

    private static String findCategoryByMenu(String menu) {
        return valueOf(menu).category;
    }
}
