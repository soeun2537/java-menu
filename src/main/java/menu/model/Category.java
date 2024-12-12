package menu.model;

public enum Category {
    일식,
    한식,
    중식,
    아시안,
    양식,
    ;

    public static Category recommendCategory(int randomNumber) {
        for (Category category : values()) {
            if (category.ordinal() + 1 == randomNumber) {
                return category;
            }
        }
        throw new IllegalArgumentException();
    }
}
