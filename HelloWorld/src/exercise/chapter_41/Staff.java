package exercise.chapter_41;

public class Staff {

    // 속성
    private int salesAmount;

    // 행위
    public int helPayment(Customer customer, int price) {
        return customer.calculatePrice(price);

    }
//    public int helpPayment(VIPCustomer customer,int price){
//            return customer.calculatePrice(price);
//    }

    public int addSalesAmount(int cash) {
        return salesAmount += cash;

    }

    public void printMySaleseAmount() {
        System.out.println("오늘의 최종 매상은 " + this.salesAmount + "원 입니다.");
    }

    public void setSalesAmount(int salesAmount) {
        this.salesAmount = salesAmount;
    }
}
