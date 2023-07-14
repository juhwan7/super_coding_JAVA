package exercise.chapter_31;

public class FishChild extends Fish {

    private boolean eatable;

    // 새로운 메소드
    public void digging() {
        System.out.println("마 " + myInfo() + "어디가나?");
    }

    public boolean isEatable() {
        return eatable;
    }

    public void setEatable(boolean eatable) {
        this.eatable = eatable;
    }

    public void becomeDanger() {
        this.havingPoison = true;
    }

    @Override// 나 이거 부모클래스한테 있는건데 내가 재수정할거야
    void eat(String food) {
        System.out.println(myInfo() + "는 " + food + "를 배터지게 먹고 있어요 맛있겠죠?");
    }

}
