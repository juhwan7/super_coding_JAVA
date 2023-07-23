package mission.가독성과_재사용성을_위해_ENUM_DATETIME_OPTONAL;


public class OrderItem {
    private int itemId;
    private String itemName;
    private double price;
    private int quantity;

    public OrderItem(int itemId, String itemName, double price, int quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

}