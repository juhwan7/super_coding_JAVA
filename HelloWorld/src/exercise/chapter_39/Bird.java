package exercise.chapter_39;

public class Bird extends Animal {

    private long weight;
    private String color;

    // 행위

    @Override
    public void eat(String food) {
        System.out.printf("새가 %s 을 부리로 쪼아 먹고 있습니다.", food);
        System.out.println();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    public void fly() {
        System.out.println("새가 날고 있습니다.");
    }
}
