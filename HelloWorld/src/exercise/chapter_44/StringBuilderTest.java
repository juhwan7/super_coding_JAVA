package exercise.chapter_44;

public class StringBuilderTest {


    public static void main(String[] args) {

        String str = "";

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 50000; i++) {
            str += "Cat";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("걸린 시간: " + (endTime - startTime) + "ms");

        //////////////////////////////

        long startTime2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 50000; i++) {
            sb.append("Cat");
        }

        String output = sb.toString();
        long endTime2 = System.currentTimeMillis();
        System.out.println("걸린 시간: " + (endTime2 - startTime2) + "ms");
    }
}
