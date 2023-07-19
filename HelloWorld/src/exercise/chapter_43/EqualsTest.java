package exercise.chapter_43;

public class EqualsTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer("ID1", "민철");
        // customer1을 customer2인스턴스에 넣어줌
        Customer customer2 = customer1;

        Customer customer3 = new Customer("ID1", "민철");
        Customer customer4 = new Customer("ID1", "민철");

        System.out.println(customer1);
        System.out.println(customer2);

        // equals() 객체 비교이기 때문에 인스턴스의 주소값을 비교한다
        System.out.println(customer1.equals(customer2));//customer1==customer2
        System.out.println(customer1.equals(customer3));//customer1==customer2
        System.out.println(customer1.equals(customer4));//customer1==customer2
        System.out.println(customer1 == customer4);// 메모리 주소 값이 달라서 false가 나옴
    }
}
