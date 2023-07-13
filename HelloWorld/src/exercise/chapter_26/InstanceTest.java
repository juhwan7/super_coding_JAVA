package exercise.chapter_26;

public class InstanceTest {

    public static void main(String[] args) {

        Student student1 = new Student("School", 1, 3, 20, "Bob", "Male");
        student1.name = "Bob";
        student1.gender = "Male";
        student1.schoolName = "School";
        student1.classYear = 1;
        student1.classroomNumber = 3;
        student1.studentNumber = 20;


        Student student2 = new Student("School", 1, 3, 15, "Alice", "Female");
        student1.name = "Alice";
        student1.gender = "Female";
        student1.schoolName = "School";
        student1.classYear = 1;
        student1.classroomNumber = 3;
        student1.studentNumber = 15;


        Student student3 = new Student("School", 1, 3, 20, "Bob", "Male");
        Student student4 = new Student("School", 1, 3, 20, "Bob", "Male");


        Teacher teacher = new Teacher();
        teacher.name = "Tom";
        teacher.gender = "Female";
        teacher.schoolName = "School";

        Subject koreanSubject = new Subject();
        koreanSubject.subjectName = "korean";
        koreanSubject.subjectCode = "AB001";

        teacher.subject = koreanSubject;
    }
}
