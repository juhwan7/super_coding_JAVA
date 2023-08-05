package mission.나이키운동화;

public class Customer {

    private long 잔액;
    private String 기분;

    private String 신발특징;

    public String 손님방문() {
        System.out.println("손님: Nike 운동화에 대해서 알려주세요");
        return "손님방문";
    }

    public void 다음에_올게요() {
        System.out.println("아.. 그럼, 다음에 올게요~ 기분이 보통이고, 잔액" + 잔액 + "남았습니다.");
        return;
    }

    public boolean 배송비낼_돈있는지_확인(int 배송비) {
        if ((잔액 -= 배송비) > 0) {
            잔액 += 배송비;
            return true;
        }
        잔액 += 배송비;
        return false;
    }


    public void 손님계산(String 착화감, long 가격) {
        잔액 = 잔액 - 가격;
        System.out.println("손님: 이 신발은 " + 착화감 + "의 특징이 느껴지네요, 기분이 " + 기분 + " 이고, 잔액" + 잔액 + "남았습니다.");
    }

    public void 손님몰래계산(long 가격) {
        잔액 = 잔액 - 가격;
    }

    public void 배송비아까는손님(String 기분, long 가격) {
        잔액 += 가격;
        System.out.println("손님: 배송료가 너무 비싸네요, 신발 가격 환불 해주세요");
        System.out.println("손님: 아.. 그럼, 다음에 올게요~ 기분이 " + 기분 + " 이고, 잔액 " + 잔액 + " 남았습니다.");
    }

    public String 손님기분(String 기분) {
        return 기분;
    }

    public long get잔액() {
        return 잔액;
    }


    public void set잔액(int 잔액) {
        this.잔액 = 잔액;
    }

    public void set기분(String 기분) {
        this.기분 = 기분;
    }

    public void set신발특징(String 신발특징) {
        this.신발특징 = 신발특징;
    }
}
