package menu.constant;

public enum InputConstant {

    SQUARE_BRACKETS_PATTERN("[\\[\\]]"),
    NUMERIC_PATTERN("\\d+"),
    YES_NO_PATTERN("[YyNn]"),
    DATE_PATTERN("^\\d{4}-\\d{2}-\\d{2}$"),
    DAY_PATTERN("^(월|화|수|목|금|토|일)$"),
    NICKNAME_PATTERN("^[가-힣]+$"),

    INPUT_SEPARATOR(","),
    ;

    private final String content;

    InputConstant(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
