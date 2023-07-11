package mission;

public class ChuncheonTicket2 {
    /*
    시립 박물과 오픈기념으로 시청 근무자들에게 박물과 티켓 625장을 무료로 배포하려고 한다.
    최대 몇명가지 나눠줄 수 있고, 그 때 몇 장의 티켓이 남는다?(아주 인기가 많을 예정)

    이 때, 각각 개인은 3장의 티켓을 가져간다
    */
    public static void main(String[] args) {
        int 티켓 = 625;
        int 인당갯수 = 3;
        System.out.println("총 "+티켓/인당갯수+"명이 티켓을 가져갔고 "+ "남는 티켓은 "+티켓%인당갯수+"개입니다");
    }

}
