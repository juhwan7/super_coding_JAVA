package mission.나이키운동화;

import javax.swing.*;

public class OrderSneakersSituation {

    public static void main(String[] args) {
        // 변수 변경 가능
        // Customer 의 잔액, DeliveryManager 매상, Staff 매상은 모두 10만원 시작 입니다.

        boolean isCustomerLikeDelivery = true; // 고객의 배송 주문 선호 여부

        String nikeSneakersFeature = "편안함"; // 안정감 | 편안함 | 가벼움 등 신발 특징
        long nikeSneakersPrice = 90_000;
        boolean havingNikeSneakersInStore = false; // 매장 Nike sneakers 재고 여부

        int daysForDeliver = 3;
        int costForDeliver = 15_000;

        /**
         *  필수 인스턴스 생성
         *  Customer, staff, DeliveryManager를 생성하고 시작합니다.
         *  각각 Customer, Staff, DeliveryManager 는 정보 은닉화 를 따르기 때문에 한정된 정보를 가지게 됩니다.
         *
         *  Customer: 자신의 Cache 와 배송 주문선호 여부
         *  Staff: 자신의 매상, Nike 운동화 정보, 매장의 Nike 운동화 재고 보유여부
         *  DeliverManager: 자신의 매상, Nike 운동화 정보, 포장 정보
         * */

        /**
         *  필수 인스턴스 생성
         *  Customer, staff, DeliveryManager를 생성하고 시작합니다.
         *  각각 Customer, Staff, DeliveryManager 는 정보 은닉화 를 따르기 때문에 한정된 정보를 가지게 됩니다.
         * */
        Customer customer = new Customer();//손님
        Staff staff = new Staff();//직원
        DeliveryManager deliveryManager = new DeliveryManager();//배송

        customer.set잔액(100_000);

        customer.손님방문();
        staff.운동화특징(nikeSneakersFeature, nikeSneakersPrice);
        if (nikeSneakersPrice <= customer.get잔액()) {

            boolean 운동화재고 = staff.운동화재고(havingNikeSneakersInStore);

            if (운동화재고) {
                System.out.println("손님: 네 좋아요, 주문 계속 진행할게요.");
                System.out.println("직원: 고객문님 신발 주문 도와드리겠습니다." + nikeSneakersPrice+" 입니다.");
                customer.set기분("좋음");
                customer.손님계산( nikeSneakersFeature,nikeSneakersPrice);

            } else {
                System.out.println("직원: 현재 매장에 재고가 존재하지 않아요, 배송 주문 가능합니다.");
                if (isCustomerLikeDelivery) {
                    System.out.println("손님: 네 좋네요, 주문 계속 진행할게요.");
                    staff.주문도와드릴게요(nikeSneakersPrice);

                    customer.손님몰래계산(nikeSneakersPrice);
                    staff.배송과배송비(daysForDeliver, costForDeliver);

                    boolean 배송비낼_돈있는지_확인 = customer.배송비낼_돈있는지_확인(costForDeliver);
                    if (배송비낼_돈있는지_확인) {//잔여배송비 있으면 true
                        System.out.println("손님: 네 좋네요, 주문 계속 진행할게요.");
                        deliveryManager.배송완료_결제해줘(costForDeliver);

                        customer.set신발특징("편안함");
                        customer.set기분("좋음");
                        customer.손님계산(nikeSneakersFeature,costForDeliver);
                    } else {
                        customer.배송비아까는손님("보통", nikeSneakersPrice);
                    }
                } else {
                    System.out.println("손님: 아.. 그럼, 다음에 올게요~ 기분이 " + customer.손님기분("보통") + "이고, 잔액 " + customer.get잔액() + " 남았습니다.");
                }

            }



        } else if (nikeSneakersPrice > customer.get잔액()) {
            customer.다음에_올게요();
        }



    }
}