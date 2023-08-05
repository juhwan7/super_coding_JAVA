package exercise.chapter_60.builder;

public class BuilderTest {

    public static void main(String[] args) {
        User user1 = new User("John", "Doe", 30, "johndoe@example.com");
        System.out.println("적용 전 User: "+user1);

        User user2 = new User.UserBuilder().firstName("john").lastName("Doe").age(30).email("johndoe@exampl.com").build();

        System.out.println("적용 전 User: "+user2);

    }
}
