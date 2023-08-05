package exercise.chapter_44;

public class StringCharArrayTest {

    public static void main(String[] args) {
        // CharArray -> String
        char[] chars = {'a', 'b', 'c'};


        String str1 = new String(chars);
        String str2 = String.valueOf(chars);

        System.out.println(str1);
        System.out.println(str2);

        // Str -> charray
        char[] chars2 = str1.toCharArray();// char[]배열의 값을 나열하였다
        for (char ch : chars2) {// chars2배열 값을 하나씩 뽑아 출력했다
            System.out.println(ch);
        }

        System.out.println(str1.charAt(0));//str1 0번째 배열 출력
        System.out.println(str1.charAt(1));
        System.out.println(str1.charAt(2));
    }
}
