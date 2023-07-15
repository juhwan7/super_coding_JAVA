package exercise.chapter_30;

import exercise.chapter_27.Teacher;

public class Student {
    private static int serialNum = 1;// 시리얼 넘

    static String city = "서울";
    // 속성
    private String schoolName;
    private int classYear; // 몇 학년
    private int classroomNumber; //  몇 반
    private int studentNumber; // 몇 번

    private int studentID;// student 고유 ID

    // 기본 정보
    private String name;
    private String gender;

    // 정적 메소드
    public static int getSerialNum() {
        return serialNum;
    }

    public static void setSerialNum(int num) {
        serialNum = num;
    }

    // 행위
    void study(Teacher teacher, String subjectName) {
        String teacherName = teacher.getName();
        System.out.println("학생 : 저는 " + teacherName + "에게 " + subjectName + "과목을 배웁니다.");
    }


    Student(String name, String gender) {

    }


    public void printMyInfo() {
        System.out.println("Student{" +
                "schoolName='" + schoolName + '\'' +
                ", classYear=" + classYear +
                ", classroomNumber=" + classroomNumber +
                ", studentNumber=" + studentNumber +
                ", studentID=" + studentID +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}');
    }


    Student(String schoolName, int classYear, int classroomNumber, int studentNumber, String name, String gender) {
        this.studentID = serialNum++;
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
