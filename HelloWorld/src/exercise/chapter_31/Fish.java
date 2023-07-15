package exercise.chapter_31;

public class Fish {
    // 속성
    private String sex; // "Male", "Female"
    protected boolean havingPoison; // true 독이 있고, false: 독이 없다
    private String StartSpawningDate;// 산란 시작시각
    private String endSpawningDate;// 산란 종료시각
    String leavingSea; // 사는 속성

    // 행위
    void eat(String food) {
        System.out.println(myInfo() + "는 " + food + "를 먹고 있어요 맛있겠죠?");
    }

    void swim(int meter) {
        System.out.println("나는 헤엄칩니다 미터: " + meter + "더이상은 힘들어욘");
    }

    void makeCrowd(Fish otherfish) {
        System.out.println("나는 인싸라 다른 물고기와 무리짓습니다.");
    }

    void sleep() {

    }

    String myInfo() {
        return String.format("물고기(성별=%s, 독이 있느냐?=%b,마! 동네 어디고?=%s)\n", this.sex, this.havingPoison, this.leavingSea);
    }

    void printfMyInfo() {
        System.out.println(myInfo());
    }


    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setHavingPoison(boolean havingPoison) {
        this.havingPoison = havingPoison;
    }

    public void setStartSpawningDate(String startSpawningDate) {
        StartSpawningDate = startSpawningDate;
    }

    public void setEndSpawningDate(String endSpawningDate) {
        this.endSpawningDate = endSpawningDate;
    }

    public void setLeavingSea(String leavingSea) {
        this.leavingSea = leavingSea;
    }

    public String getSex() {
        return sex;
    }

    public boolean isHavingPoison() {
        return havingPoison;
    }

    public String getStartSpawningDate() {
        return StartSpawningDate;
    }

    public String getEndSpawningDate() {
        return endSpawningDate;
    }

    public String getLeavingSea() {
        return leavingSea;
    }
}
