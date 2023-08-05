package exercise.chapter_52;

import java.util.Arrays;

public class DayEnumTest {

    public static void main(String[] args){
        // 각가 ENum 값 정의
        // Ordinal, compareTo, values

        Day monday = Day.MONDAY;
        Day sunday = Day.SUNDAY;
        Day thursday = Day.THURSDAY;

        // enum 선언한 순서대로 0부터 출력
        System.out.println("ordinal 값: " +  monday.ordinal());
        System.out.println("ordinal 값: " +  sunday.ordinal());
        System.out.println("ordinal 값: " +  thursday.ordinal());

        // 선언된 순서대로 0, -1, -2, -3으로 출력됨  이건 if문 등 비교를 할 때 주로 사용함
        System.out.println("CompareTo: " + monday.compareTo(sunday));
        System.out.println("CompareTo: " + monday.compareTo(thursday));

        // enum 선언 순서대로 배열로 출력
        Day[ ] days = Day.values();
        System.out.println("Days: " + Arrays.toString(days));
    }
}