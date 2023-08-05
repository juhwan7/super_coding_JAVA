package exercise.chapter_44;

import java.util.Objects;

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

    public Customer(String customerID, String name) {
        this(name);
        this.customerID = customerID;

    }

    public void printMyInfo() {
        System.out.printf("Customer(customerId=%s, name=%s, customerGrade=%s, bonusPoint=%d)\n", this.customerID, this.name, this.customerGrade, this.bonusPoint);
    }


    @Override
    public String toString() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                ", name='" + name + '\'' +
                ", customerGrade='" + customerGrade + '\'' +
                ", bonusPoint=" + bonusPoint +
                ", bonusPointRatio=" + bonusPointRatio +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null){//obj 값 유무 비교
            return false;
        }
        if (obj instanceof Customer){// 다운케스팅이 가능한지 비교
            Customer customer =(Customer) obj;//매개변수 obj를 Customer로 다운캐스팅 함
            return customer.customerID ==this.customerID; // 다운캐스팅 후 customerID가 같은지 비교
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerID);
    }
}
