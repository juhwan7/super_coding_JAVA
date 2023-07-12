package mission;
public class ChuncheonTicket3 {
    /*
    2번 문제 : 시립 박물관은 티켓값 반값 할인을 진행할 예정인데, 나이가 65세 이상이고, 국적이＂한국”이면 반값으로 줄 예정이다. 서로 다른 3명의 손님이 왔다. 3명은 반값 할인 적용 대상인가? 아닌가? 각각 손님의 반값 적용 여부가 true 또는 false로 출력되어야 한다.
            ⇒ “ChuncheonTicket3”로 자바 클래스 만든다.
            ⇒ Alice(나이: 70, 나라: 미국)
            ⇒ Kim (나이: 65, 나라: 한국)
            ⇒ Yoo (나이: 42, 나라: 한국)
    */
    public static void main(String[] args){
/**
 * Q) 서로 다른 3명의 손님이 왔다. 3명은 반값 할인 적용 대상인가? 아닌가?
 * 나이가 65세 이상이고, 국적이 ＂한국”이면 반값으로 줄 예정이다.
 * Alice(나이: 70, 나라: 미국)
 * Kim (나이: 65, 나라: 한국)
 * Yoo (나이: 42, 나라: 한국)
 */
        int ageOfAlice = 70;
        String countryOfAlice = "USA";

        int ageOfKim = 65;
        String countryOfKim = "Korea";

        int ageOfYoo = 42;
        String countryOfYoo = "Korea";

        System.out.println("Alice는 적용 대상자인가?");
        half_price(ageOfAlice,countryOfAlice);

        System.out.println("Kim는 적용 대상자인가?");
        half_price(ageOfKim,countryOfKim);

        System.out.println("Yoo는 적용 대상자인가?");
        half_price(ageOfYoo,countryOfYoo);
    }
    public static void half_price(int age, String nationality){
        if (age>=65&&nationality=="Korea"){
            System.out.println("반값 혜택 적용입니다.");
        }else {
            System.out.println("반값 혜택 미적용입니다.");
        }
    }
}

