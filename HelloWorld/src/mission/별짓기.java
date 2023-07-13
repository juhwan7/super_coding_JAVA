package mission;

public class 별짓기 {
    public static void main(String[] args) {
        int size = 100;

        for (int i = 1; i <= size; i++) {
            for (int j = size - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 아랫부분 출력
        for (int i = size - 1; i >= 1; i--) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
