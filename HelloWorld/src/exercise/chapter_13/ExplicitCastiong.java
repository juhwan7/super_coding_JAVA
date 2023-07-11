package exercise.chapter_13;

public class ExplicitCastiong {
    public static void main(String[] args) {
        //강제 형변환
        float myFloagt = 5.55f;
        int myInt = (int) myFloagt;
        System.out.println("myInt = " + myInt);


        int myInt2 = 600;
        byte myByte = (byte) myInt2;
        System.out.println("myByte = " + myByte);

        //연산 "+"
        double myDouble1 = 5.5;
        double myDouble2 = 3.7;
        int result = (int) myDouble1 + (int) myDouble2; //소수점 버림
        System.out.println("result = " + result);
    }
}
