package exercise.chapter_44;

public class StringEqualsTest {
    public static void main(String[] args) {

        String str1 = "Cat";
        String str2 = "Cat";

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String str3 = new String("Cat");
        String str4 = new String("Cat");

        System.out.println(str3.equals(str4));// 내부 값을 비교 true
        System.out.println(str3 == str4); // 인스턴스 주소를 비교 false

        System.out.println(str3.equals(str1));
        System.out.println(str3==str1);
    }
}
