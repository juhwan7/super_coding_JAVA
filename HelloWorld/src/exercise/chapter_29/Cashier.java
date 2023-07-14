package exercise.chapter_29;

public class Cashier {

    // 속성
    private long salesAmount;


    // 행위
    public long checkCoffeePrice(String coffeeName) {
        // 커피 가격을 확인하는 로직
        long price;
        switch (coffeeName) {
            case "아메리카노":
                price = 5000;
                break;
            case "카페라떼":
                price = 6000;
                break;
            case "카페모카":
                price = 6500;
                break;
            case "카푸치노":
                price = 6000;
                break;
            default:
                price = 0;
                break;
        }
        return price;
    }

    public void replyCoffeePrice(String coffeeName, long price) {
        // 커피가격을 손님에게 말해주는 로직
        if (price == 0) {
            System.out.println("캐시어: 죄송합니다 손님 말씀하신 메뉴: " + coffeeName + "는 저희 가게에 없습니다.");
        }
        System.out.println("캐시어: 말씀하신 커피" + coffeeName + "은 가격이" + price + "원 입니다.");
    }

    public void addAmount(long money) {
        // 손님이 준 돈을 계산대에 추가하는 로직
        this.salesAmount += money;
    }

    public void sayOrder(String coffeeName) {
        // 캐시어가 바리스타에게 어떤 주문이 들어왔는지 알려주는 로직
        System.out.println("캐시어: 커피주문 " + coffeeName + "주문이 들어왔습니다.");
    }

    public Coffee wrapUpCoffee(Coffee coffee) {
        //커피를 포장하는 로직
        coffee.beWrappedUp();
        return coffee;
    }

    public void sayCoffeeReady(Coffee coffee){

        String coffeeName = coffee.getCoffeeName();
        System.out.println("캐시어: 주문하신 커피 "+coffeeName+"나왔습니다.");
    }

    public long getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(long salesAmount) {
        this.salesAmount = salesAmount;
    }
}























