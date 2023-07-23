package exercise.chapter_54;

public class LamdbaUseTest {
    public static void main(String[] args) {
        MultipleNum multipleNum = (num) -> num * 10;


        printNum(multipleNum);
        printNum((x) -> x * 100);

        GenericeLambda<String> genericeLambda1 = (str) -> str.toUpperCase();
        GenericeLambda<Integer> genericeLambda2 = (num) -> num * 2;
        GenericeLambda<Boolean> genericeLambda3 = (myBool) -> myBool & true;


        System.out.println(genericeLambda1.calculate("abc"));
        System.out.println(genericeLambda2.calculate(100));
        System.out.println(genericeLambda3.calculate(true));

    }

    static void printNum(MultipleNum multipleNum) {
        int result = multipleNum.calculate(5);
        System.out.println(result);
    }
}
