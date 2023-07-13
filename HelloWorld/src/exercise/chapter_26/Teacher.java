package exercise.chapter_26;

public class Teacher {

    // 속성

    // 학교 정보
    String schoolName;

    //과목
    Subject subject;

    // 기본 정보
    String name;
    String gender;

    // 행위
    void teach(Student student, String subjectName) {
        String studentName = student.name;
        System.out.printf("선생: %s 학생에게 %s 과목을 가르치고 있습니다.", studentName, subjectName);
    }

    public Teacher() {
    }

    public Teacher(String name, String gender, String SubjectName, String SubjectCode) {

        this.subject = subject;
        this.name = name;
        this.gender = gender;

        Subject newSubject = new Subject();
        newSubject.subjectName = SubjectName;
        newSubject.subjectCode = SubjectCode;

        subject = newSubject;
    }
}
