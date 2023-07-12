package exercise.chapter_17;

public class Medal {

    public static void main(String[] args) {
        //메달 수여
        int myRank =1;
        String meadal;

        switch (myRank) {
            case 1:
                meadal = "금메달";
                break;
            case 2:
                meadal = "은메달";
                break;
            case 3:
                meadal = "동메달";
                break;
            default:
                meadal = "메달 없음";
        }
        System.out.println(String.format("선수님의 메달색깔은 %s 입니다.",meadal));
    }
}
