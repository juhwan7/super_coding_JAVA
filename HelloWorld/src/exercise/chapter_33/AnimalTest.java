package exercise.chapter_33;

public class AnimalTest {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Fish fish = new Fish();

        feed(animal, "빼빼로");
        feed(bird, "벌레");
        feed(fish, "모이");


    }

    public static void feed(Animal animal, String food) {

        animal.eat(food);
    }

}
