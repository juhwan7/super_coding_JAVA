package exercise.chapter_18;

public class ForLoop {
    public static void main(String[] args) {
        //1~10다 더함

        int sum = 0;


        for (int i = 0; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
