package mission.학생들의_시험점수를_관리하는_클래스;

import java.util.Arrays;

public class StudentScore {

    // static
    private static int serialIndex;// StudentScore 객체 생성시 +1
    private static int[] allScores;

    private int myIndex;// seridlIndex 값을 할당
    private int score;

    public static int[] getAllScores() {
        return allScores;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
        allScores[myIndex] = score;
    }

    public StudentScore(int score) {
        this.myIndex = serialIndex++;
        this.score = score;
        addAllScore(score);
    }

    private static void addAllScore(int score) {
        if (allScores == null) {
            initializeAllScore(score);
            return;
        }
        int length = allScores.length;
        allScores = Arrays.copyOf(allScores, length + 1);
        allScores[length] = score;
    }

    private static void initializeAllScore(int score) {
        allScores = new int[]{score};
    }
}