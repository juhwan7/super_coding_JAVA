package exercise.chapter_36;

public class Dog extends Animal {
    @Override
    public void eat(String food) {
        System.out.println("개는 %s 을 단단한 이빨로 물어 먹습니다. \n");
    }

    @Override
    public void sleep() {
        System.out.println("개는 잠을 잡니다.");
    }
}
