package exercise.chapter_34;

public class Customer {
    // 속성
    static int serialNums = 1;

    protected String customerID;
    protected String name;
    protected String customerGrade;
    protected int bonusPoint;
    protected double bonusPointRatio;

    // 행위
    public int calculatePrice(int price) {
        this.bonusPoint += price * bonusPointRatio;
        return price;
    }

    public Customer() {
        System.out.println("손님은 점원에게 가격으로 결제 요청을 한다.");

    }

    public Customer(String name) {
        this.customerID = "Customer" + serialNums++;
        this.name = name;
        this.customerGrade = "SILVER";
        this.bonusPointRatio = 0.01;
        this.bonusPoint = 0;
    }

    public void printMyInfo() {
        System.out.printf("Customer(customerId=%s, name=%s, customerGrade=%s, bonusPoint=%d)\n", this.customerID, this.name, this.customerGrade, this.bonusPoint);
    }
}
