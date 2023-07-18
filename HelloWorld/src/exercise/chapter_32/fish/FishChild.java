package exercise.chapter_32.fish;

public class FishChild extends Fish {

    private boolean eatable;
    protected String leavingSea;

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

    @Override
    public// 나 이거 부모클래스한테 있는건데 내가 재수정할거야
    void eat(String food) {
        System.out.println(myInfo() + "는 " + food + "를 배터지게 먹고 있어요 맛있겠죠?");
    }

    void printSea() {
        System.out.println(myInfo() + "는 " + this.leavingSea + super.leavingSea);
    }

    @Override
    String myInfo() {
        return super.myInfo() + "는 부모 물고기, " + String.format("자물고기(%b, %s)", this.eatable, this.leavingSea);
    }

    public FishChild() {
        super(); // 부모 물고기 만들어지고 있습니다.
        System.out.println("자식 물고기가 생성되고 있습니다.");
    }

    public FishChild(boolean eatable, String leavingSea) {
        this.eatable = eatable;
        super.leavingSea = leavingSea;
    }

    public FishChild(String sex, boolean havingPoison, String startSpawningDate, String endSpawningDate, String leavingSea, boolean eatable, String leavingSea1) {
        super(sex, havingPoison, startSpawningDate, endSpawningDate, leavingSea);
        this.eatable = eatable;
        this.leavingSea = leavingSea1;
    }

    FishChild(String sex, boolean eatable, String leavingSea) {
        super(sex, false, "2022", "2022", leavingSea);
        this.eatable = eatable;
    }
}
