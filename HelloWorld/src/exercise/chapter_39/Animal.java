package exercise.chapter_39;

public  class Animal {

    // 속성
    protected String gender;

    // 행위
    public  void eat(String food) {
        System.out.printf("동물이 %s 을 먹습니다.", food);
        System.out.println();
    }

    public void sleep() {
        System.out.println("동물이 잠을 자고 있습니다.");
    }


}

