package mission.나이키운동화;

public class Staff {


    private int 매상 = 100_000;

    public void 운동화특징(String 특징, long 가격) {
        System.out.printf("직원: Nike 운동화는 " + 특징 + " 특징과 " + 가격 + " 가격을 가지고 있습니다.");
        System.out.println();

    }

    public boolean 운동화재고(boolean 재고) {
        if (재고) {
            System.out.println("현재 매장에 재고가 존재하네요. 바로 주문 진행가능합니다.");
        } else {

        }

        return 재고;
    }

    public void 주문도와드릴게요(long 운동화가격) {
        System.out.println("직원: 고객문님 신발 주문 도와드리겠습니다." + 운동화가격+" 입니다.");
    }

    public void 배송과배송비(int 배송기간, int 배송비) {
        System.out.println("직원: 고객님 배송은 " + 배송기간 + " 일 걸릴 예정이고, 배송 금액은 " + 배송비 + " 소요되십니다.");
    }
}
