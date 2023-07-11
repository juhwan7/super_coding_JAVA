package exercise.chapter_13;

public class ImplicitCastiong1  {
    public static void main(String[] args) {
        // 덜 정밀한 자료형 -> 더 정밀한 자료형
        int myInt = 5;
        float myFloat = myInt;
        System.out.println(myFloat);
    }
}
