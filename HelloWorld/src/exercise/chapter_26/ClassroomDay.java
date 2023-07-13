package exercise.chapter_26;

public class ClassroomDay {

    public static void main(String[] args) {

        Student student1 = new Student("school", 1, 3, 20, "Bob", "Male");
        Student student2 = new Student("school", 1, 3, 25, "Alice", "Female");
        Student student3 = new Student("school", 1, 3, 30, "Taylor", "Female");
        Student student4 = new Student("school", 1, 3, 35, "Lula", "Female");


        Teacher teacher = new Teacher("Tom", "Female", "국어", "ABOO1");

        String subjectName = "국어";
        teacher.teach(student1,subjectName);
    }
}
