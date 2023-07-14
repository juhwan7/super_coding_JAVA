package exercise.chapter_29;

public class Customer {
    // 속성
    private long cashAmount;// 손님 현금
    private String myFeeling;// 손님 기분

    // 행위

    public void askCoffee(Cashier cashier, String coffeeName) {
        System.out.println("손님: 커피 " + coffeeName + " 얼마인가요?");
    }

    public long withDrawCash(long amount) {
        this.cashAmount -= amount;
        // amount가격만큼 내 지갑에서 빼서 리턴해줌
        return amount;
    }

    public void orderCoffe(String coffeeName, boolean isWrappedUp) {
        System.out.println("손님: 커피 " + coffeeName + "을 주문할게요" + isWrappedUp + "으로 부탁");
    }

    public void drinkCoffee(Coffee coffee) {
        String coffeeName = coffee.getCoffeeName();
        System.out.println("손님 : " + coffeeName + "을 마신다");
    }

    public void upgradeMyFeeling() {
        this.myFeeling = "기분이 좋아졌다.";
    }

    public void showMyInfo() {
        System.out.printf("손님: 지금 나의 기분은 %s 하고, 현금은 %d 있습니다..", this.myFeeling, this.cashAmount);
    }

    public long getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(long cashAmount) {
        this.cashAmount = cashAmount;
    }

    public String getMyFeeling() {
        return myFeeling;
    }

    public void setMyFeeling(String myFeeling) {
        this.myFeeling = myFeeling;
    }
}
