package mission.가독성과_재사용성을_위해_ENUM_DATETIME_OPTONAL;

public enum Order_status {
    PAID("돈지불"),
    SHIPPED("배송됨"),
    ON_ORDER("미주문"),
    NOT_PAID("미지불"),
    SHITPPEN("탁오");

    private final String name;

    Order_status(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
