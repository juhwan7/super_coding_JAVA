package mission;

public class Student {
    private String name;
    private int studentId;
    private String major;
    private int grade;

    public Student(String name, int studentId, String major, int grade) {
        this.name = name;
        this.studentId = studentId;
        this.major = major;
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getGrade() {
        return this.grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

}