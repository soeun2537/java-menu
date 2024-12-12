package menu.constant.message;

public enum OutputMessage {

    START_GUIDANCE("점심 메뉴 추천을 시작합니다."),
    COACH_NAME_GUIDANCE("코치의 이름을 입력해 주세요. (, 로 구분)"),
    DISLIKE_MENU_GUIDANCE("%s(이)가 못 먹는 메뉴를 입력해 주세요."),
    MENU_RECOMMENDATION_GUIDANCE("메뉴 추천 결과입니다."),
    MENU_RECOMMENDATION_DAY_GUIDANCE("[ 구분 | 월요일 | 화요일 | 수요일 | 목요일 | 금요일 ]"),
    MENU_RECOMMENDATION_CATEGORY_GUIDANCE("[ 카테고리 | 한식 | 양식 | 일식 | 중식 | 아시안 ]"),
    MENU_RECOMMENDATION("[ %s | %s | %s | %s | %s | %s ]"),
    END_GUIDANCE("추천을 완료했습니다."),
    ;

    private final String message;

    OutputMessage(String message) {
        this.message = message;
    }

    public String getMessage(Object... args) {
        return String.format(message, args);
    }
}
