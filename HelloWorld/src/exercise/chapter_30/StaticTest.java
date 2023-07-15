package exercise.chapter_30;

public class StaticTest {
    public static void main(String[] args) {
// zmffotm qustn

        int num = Student.getSerialNum();
        String city = Student.city;

        System.out.println(num);
        System.out.println(city);

        Student.setSerialNum(10);
        // 4명 만들어보기

        Student student1 = new Student("Alice", "Female");
        Student student2 = new Student("TOM", "Male");
        Student student3 = new Student("Taylor", "Female");
        Student student4 = new Student("Mike", "Male");


        student1.printMyInfo();
    }
}
