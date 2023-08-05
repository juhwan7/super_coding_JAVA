package exercise.chapter_59;

public class MultiThreadingExample {
    public static void main(String[] args) {
        // Q) 1~100까지 출력하는건데, Multi threading 일 분담해서 실행


        // 2명 Thread
        Thread thread1 = new Thread(new PrintNumberRunnable(1,50));
        Thread thread2 = new Thread(new PrintNumberRunnable(51,100));

        thread1.start();
        thread2.start();
    }
}
