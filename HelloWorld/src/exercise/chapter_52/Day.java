package exercise.chapter_52;

// sunday, monday, tuesday, wednesday, thursday, friday, saturday
public enum Day {
    SUNDAY("일요일"),
    MONDAY("월요일"),
    TUESDAY("화요일"),
    WEDNESDAY("수요일"),
    THURSDAY("목요일"),
    FRIDAY("금요일"),
    SATURDAY("토요일");
    // 위 필드들은 koreanName이라는 이름을 갖는다
    private final String koreanName;

    // 생성자까지 만들어줘야 인텔리제이 빨간줄이 사라짐
    Day(String koreanName) {
        this.koreanName = koreanName;
    }

    public String getKoreanName() {
        return koreanName;
    }
}