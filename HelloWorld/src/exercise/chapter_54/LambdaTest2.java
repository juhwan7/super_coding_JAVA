package exercise.chapter_54;

public class LambdaTest2 {


    int i = 100;

    public static void main(String[] args) {
        MultipleNum multipleNum = new MultipleNum() {
            @Override
            public int calculate(int num) {
                return num * 1;
            }
        };

        StringNum stringNum2 = (str, num) -> {


            StringBuilder sb;
            sb = new StringBuilder();
            for (int i = 0; i < num; i++) {
                sb.append(str);
            }
            System.out.println("stringNum1" + sb.toString());
        };
    }
}
