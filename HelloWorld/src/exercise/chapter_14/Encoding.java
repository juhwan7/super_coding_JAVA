package exercise.chapter_14;

public class Encoding {
    public static void main(String[] args) {
        //'Z' -> int
        char ch1 = 'Z';
        System.out.println(ch1);
        System.out.println((int)ch1);

        // Int -> char
        // 참고: 65~90: A~Z, 96~122: a~z
        int num = 66;
        System.out.println(num);
        System.out.println((char) num);

        //대소 비교
        char smaillA = 'a';
        char largeA = 'A';
        boolean result = smaillA > largeA;
        System.out.println(result);

        //유니코드
        char hangul = '\uAC00';
        System.out.println("hangul = " + hangul);

        char special3 = '\'';
        System.out.println("special3 = " + special3);
    }
}
