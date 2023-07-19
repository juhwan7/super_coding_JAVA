package exercise.chapter_39;


import exercise.chapter_33.Person;

public class AnimalDownCastion {

    public static void main(String[] args) {
        // 다운 캐스팅 확인여부

        Animal animal = new Animal();

        // 런타임에러: 실행해야지 찾을 수 있는 에러
//        animal = null;
//        animal.sleep();


        animal.sleep();


    }

    static void checkBirdAndFly(Animal animal) {
        if (animal instanceof Bird) {
            Bird bird = (Bird) animal;
            bird.fly();
        } else {
            System.out.println("너는 새가 아니야");
        }
    }

}
