package exercise.chapter_27;

public class Student {

    // 속성
    private String schoolName;
    private int classYear; // 몇 학년
    private int classroomNumber; //  몇 반
    private int studentNumber; // 몇 번


    // 기본 정보
    private String name;
    private String gender;

    // 행위
    void study(Teacher teacher, String subjectName) {
        String teacherName = teacher.getName();
        System.out.println("학생 : 저는 " + teacherName + "에게 " + subjectName + "과목을 배웁니다.");
    }

    Student(String schoolName, int classYear, int classroomNumber, int studentNumber, String name, String gender) {
        this.classroomNumber = classroomNumber;
        this.schoolName = schoolName;
        this.classYear = classYear;
        this.studentNumber = studentNumber;
        this.name = name;
        this.gender = gender;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getClassYear() {
        return classYear;
    }

    public void setClassYear(int classYear) {
        this.classYear = classYear;
    }

    public int getClassroomNumber() {
        return classroomNumber;
    }

    public void setClassroomNumber(int classroomNumber) {
        this.classroomNumber = classroomNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
