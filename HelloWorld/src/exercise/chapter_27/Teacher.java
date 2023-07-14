package exercise.chapter_27;

public class Teacher {

    // 속성

    // 학교 정보
    private String schoolName;

    //과목
    private Subject subject;

    // 기본 정보
    private String name;
    private String gender;

    // 행위
    void teach(Student student, String subjectName) {
        String studentName = student.getName();
        System.out.printf("선생: %s 학생에게 %s 과목을 가르치고 있습니다.", studentName, subjectName);
    }

    public Teacher() {
    }

    public Teacher(String name, String gender, String SubjectName, String SubjectCode) {

        this.subject = subject;
        this.name = name;
        this.gender = gender;


        Subject newSubject = new Subject();
        newSubject.setSubjectName(SubjectName);
        newSubject.setSubjectCode(SubjectCode);

        subject = newSubject;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
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
