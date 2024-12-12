package menu.constant;

public enum InputConstant {

    NAME_PATTERN("^[가-힣]+$"),
    MENU_PATTERN("^[가-힣 ]+$"),

    INPUT_SEPARATOR(","),
    UNDER_BAR("_"),
    BLANK(" "),
    ;

    private final String content;

    InputConstant(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
