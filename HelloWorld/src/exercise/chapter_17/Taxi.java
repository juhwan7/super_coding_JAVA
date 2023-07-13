package exercise.chapter_17;

public class Taxi {
    public static void main(String[] args) {
        //심야 할증 구간:0~4시
        int goHomeTime =7; //집가는 시간
        String myhome ="기흥";
        int payment =10_000;

        if (0< goHomeTime&&goHomeTime<4){
            payment=payment+(int)(payment*0.2);
        }
        if (myhome != "서울"){
            payment = payment+(int)(payment*0.2);
        }
        String format = String.format("고객님이 내셔야할 돈은 %d 입니다.", payment);
        System.out.println(format);

    }
}
