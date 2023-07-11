package mission;

public class ChuncheonTicket3 {

    /*
     * 시립 박물과은 티켓값 반값 할인을 진행할 예정인데,
     * 나이가 65세 이상이고, 국적이 "한국"이면 반값으로 줄 예정이다.
     *
     * 서로 다른 3명의 손님이 왔다. 3명은 반값 할인 적용 대상인가? 아닌가?
     *
     * Alice(나이: 70 , 나라 : 미국)
     * Kim(나이: 65 , 나라 : 한국)
     * Yoo(나이: 42 , 나라 : 한국)
     * */
    public static void main(String[] args) {

        String[] alice = {"70", "미국"};
        String[] kim = {"65", "한국"};
        String[] yoo = {"42", "한국"};

        if (Integer.parseInt(alice[0]) >= 65 && alice[1] == "한국") {
            System.out.println("alice반값");
        }
        if (Integer.parseInt(kim[0]) >= 65 && kim[1] == "한국") {
            System.out.println("kim반값");
        }
        if (Integer.parseInt(yoo[0]) >= 65 && yoo[1] == "한국") {
            System.out.println("yooㄴ반값");
        }
    }
}
