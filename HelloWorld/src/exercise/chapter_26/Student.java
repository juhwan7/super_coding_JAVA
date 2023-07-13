package exercise.chapter_26;

public class Student {

    // 속성
    String schoolName;
    int classYear; // 몇 학년
    int classroomNumber; //  몇 반
    int studentNumber; // 몇 번

    // 기본 정보
    String name;
    String gender;

    // 행위
    void study(Teacher teacher, String subjectName) {
        String teacherName = teacher.name;
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

}
