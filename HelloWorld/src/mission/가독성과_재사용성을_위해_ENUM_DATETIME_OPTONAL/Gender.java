package mission.가독성과_재사용성을_위해_ENUM_DATETIME_OPTONAL;

public enum Gender {
    MALE("male"),
    FEMALE("female");

    private String genderName;

    Gender(String genderName) {
        this.genderName = genderName;
    }
}