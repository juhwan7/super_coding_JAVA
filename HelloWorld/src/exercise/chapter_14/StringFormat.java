package exercise.chapter_14;

public class StringFormat {
    public static void main(String[] args) {
        //String
        String str1 = "Happy";
        String str2 = String.valueOf(123);

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        // String 1
        String result;

        result = String.format("문자 서식: %s, %S", str1, str1);
        System.out.println("result = " + result);

        // Int
        int myInt = 10;
        result = String.format("정수 서식: %d", myInt);
        System.out.println("result = " + result);

        float myFloat = 12.554535f;
        result = String.format("실수 서식: %f, %.1f", myFloat, myFloat);
        System.out.println("result = " + result);

    }
}
