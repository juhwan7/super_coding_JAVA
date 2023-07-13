package exercise.chapter_19;

public class EndlessLoop {
    public static void main(String[] args) {
        //tip: 분 단위로 계산할 예정

        final int WAKE_UP_TIME = 8 * 60;
        final int END_DAY = 24 * 60;

        int now = WAKE_UP_TIME;

        while (now < END_DAY) {
            now++;

            if (now%60==0){
                int hour = now /60;
                System.out.println(hour+"시 정각이네");
            }
            if (now% 60 ==34){
                System.out.println("헐 34분이잖아?");
                System.out.println("그럼 그냥 정각되면 해야겠다.");
            }
            if (now% 60==8){
                System.out.println("8분이네");
            }
        }
    }
}
