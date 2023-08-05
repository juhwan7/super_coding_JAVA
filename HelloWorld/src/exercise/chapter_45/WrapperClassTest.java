package exercise.chapter_45;

public class WrapperClassTest {

    public static void main(String[] args) {
        // Integer
        Integer integer1 = new Integer(20);
        Integer integer2 = new Integer(30);

        int int1 = integer1.intValue();// Unboxing, Integer -> int 바꾼 것

        Integer integer3 = 20; // AutoBoxing
        int int2 = integer3; // AutoUnboxing

//        System.out.println(integer1);
//        System.out.println(int1);
//        System.out.println(integer3);
//        System.out.println(int2);

//        // 연산자
//        System.out.println(integer1 + integer2);
//        System.out.println(integer1 + int1);

        // Character
        Character character = new Character('X'); // 'X' charType -> Character 박싱
        char ch1 = character.charValue(); // Character -> char 언박싱
        System.out.println(character);
        System.out.println(ch1);

        Character[] character1 = {'a', 'b', 'c'};
        char[] chars = {'a', 'b', 'c'};

        String str = String.valueOf(character1);
        String str2 = String.valueOf(chars);
        System.out.println(str);
        System.out.println(str2);

        // Boolean Type
        Boolean boolean1 = new Boolean(true);
        boolean b1 = boolean1.booleanValue();

        Boolean boolean2 = false;
        boolean b2 = boolean2;

        System.out.println(boolean1 & boolean2);
        System.out.println(boolean1 | boolean2);


    }
}
