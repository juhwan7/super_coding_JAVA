package exercise.chapter_42;

import mission.학생들의_시험점수를_관리하는_클래스.StudentScore;

public class GarbageCollectorTest {

    public static void main(String[] args) throws InterruptedException {


        for (int i = 0; i < 100; i++) {
            Customer cust = new Customer("장민철");

        }
        System.gc();

        while (true) {
            Thread.sleep(100);
        }
    }
}
