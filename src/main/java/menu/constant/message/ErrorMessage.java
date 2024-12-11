package menu.constant.message;

public enum ErrorMessage {

    INVALID_FORMAT("유효하지 않은 입력 값입니다. 다시 입력해 주세요."),
    INVALID_NAME_COUNT("코치는 최소 2명 이상, 최대 5명 이하로 입력해야 합니다."),
    INVALID_NAME_FORMAT("코치 이름은 최소 2글자, 최대 4글자 이내로 입력해야 합니다."),
    DUPLICATE_NAME("코치 이름은 중복해서 입력할 수 없습니다."),
    INVALID_MENU_COUNT("메뉴는 최소 0개, 최대 2개 이내로 입력해야 합니다."),
    DUPLICATE_MENU("메뉴는 중복해서 입력할 수 없습니다."),
    ;

    private static final String PREFIX = "[ERROR] ";
    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return PREFIX + message;
    }
}
