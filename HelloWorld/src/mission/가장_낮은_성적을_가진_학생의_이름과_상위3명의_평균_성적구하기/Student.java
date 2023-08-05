package mission.가장_낮은_성적을_가진_학생의_이름과_상위3명의_평균_성적구하기;

public class Student {
    private String name; // 이름
    private String gender; // 성별

    private int score;

    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public String getGender() {
        return gender;
    }

    public Student(String name, String gender, int score) {
        this.name = name;
        this.gender = gender;
        this.score = score;
    }
}