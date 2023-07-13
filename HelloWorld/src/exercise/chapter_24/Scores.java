package exercise.chapter_24;

public class Scores {
    public static void main(String[] args) {
        //A class 학생들 점수
        int studentAClass1 = 50;
        int studentAClass2 = 30;
        int studentAClass3 = 45;

        int studentBClass1 = 60;
        int studentBClass2 = 65;
        int studentBClass3 = 66;

        // Average
        int sumAClass = studentAClass1 + studentAClass2 + studentAClass3;
        double averageAClass = sumAClass / (double) 3;
        System.out.println("averageAClass = " + averageAClass);


        System.out.println(   averageBClass(studentBClass1, studentBClass2, studentBClass3));
    }

    static double averageBClass(int a, int b, int c) {
        return (a + b + c) / (double) 3;
    }
}
