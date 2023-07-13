package mission;

public class 영화_관람_등급 {
    public static void main(String[] args) {
        int 나이 = 13;

        if (나이>=19){
            System.out.println("나이"+나이+"세 청소년 관람불가");
        } else if (나이>=15) {
            System.out.println("나이"+나이+"세 15세 이상 관람가");
        } else if (나이>=12) {
            System.out.println("나이"+나이+"세 12세 이상 관람가");
        } else if (나이>=0) {
            System.out.println("나이"+나이+"세 전체 관람가");
        }else {
            System.out.println("나이"+나이+"세 유아 관람불가");
        }
    }
}
