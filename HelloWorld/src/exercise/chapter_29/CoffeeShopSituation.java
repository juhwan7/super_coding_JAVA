package exercise.chapter_29;

import javax.swing.plaf.IconUIResource;

public class CoffeeShopSituation {

    public static void main(String[] args) {
        // 손님 현금 : 5만원
        // 매상 :100만원

        Customer customer = new Customer();
        customer.setCashAmount(50_000);
        //손님 지갑상황

        Cashier cashier = new Cashier();
        cashier.setSalesAmount(1_000_000);
        // 계산대 보유금액

        Barista barista = new Barista();

        // 로직 시작
        String coffeeName = "카푸치노";
        // 주문할 커피
        boolean isTakeOut = true;
        // 포장 여부
        customer.askCoffee(cashier, coffeeName);
        // 캐시어에게 커피 가격 물어봄

        long price = cashier.checkCoffeePrice(coffeeName);
        // 캐시어는 커피이름을 듣고 가격을 체크하고 기억하는 중

        cashier.replyCoffeePrice(coffeeName, price);
        // 커시어는 기억하고 있던 가격과 커피를 말해줌

        long cash = customer.withDrawCash(price);
        // 손님은 금액을 듣고 지갑에서 돈을 꺼내 주려고 함

        cashier.addAmount(cash);
        // 캐시어는 손님에게 돈을 받아 계산을 함

        cashier.getSalesAmount();

        customer.orderCoffe(coffeeName, isTakeOut);
        // 손님은 커피이름과 포장유무를 말한다

        cashier.sayOrder(coffeeName);
        // 캐시어는 바리스타에게 커피 주문이 들어왔다고 알린다.

        barista.noticeOrder(coffeeName);
        // 바리스타는 주문을 받았다고 함

        Coffee coffee = barista.makeUpCoffee(coffeeName, 500, 30);
        // 바리스타는 커피이름을 듣고 물500,원두30으로 커피를 만든다

        barista.sayCoffeeReady(coffee);
        // 바리스타는 커피가 만들어지면 만들어졌다고 알린

        Coffee coffeeCompleted = cashier.wrapUpCoffee(coffee);
        // 캐시어는 완료된 커피를 포장한다

        cashier.sayCoffeeReady(coffeeCompleted);
        // 캐시어는 포장된 커피가 준비완료 되었다고 알린

        customer.drinkCoffee(coffeeCompleted);
        // 손님은 포장된 커피를 마신다

        if (coffeeCompleted.getCoffeeName() == coffeeName && coffee.isWrappedUp() == isTakeOut) {
            // 손님은 커피와 포장 유무가 맞는지 확인한다
            customer.upgradeMyFeeling();
            // 손님의 기분을 저장함
        }
        customer.showMyInfo();
        // 손님의 기분과 잔금을 알려준다
    }
}
