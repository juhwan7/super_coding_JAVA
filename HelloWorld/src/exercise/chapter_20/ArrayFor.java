package exercise.chapter_20;

public class ArrayFor {
    public static void main(String[] args) {
        int[] studentScores = {90,87,88,75,99,65};
        
        //for loop
        for (int i=0;i<studentScores.length; i++){
            System.out.println("i+\" \"+studentScores[i] = " + i+" "+studentScores[i]);
        }

        //for loop
        for (int score:studentScores){
            System.out.println("score = " + score);
        }
    }
}
