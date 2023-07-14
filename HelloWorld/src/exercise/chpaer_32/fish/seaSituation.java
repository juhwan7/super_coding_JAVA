package exercise.chpaer_32.fish;

public class seaSituation {

    public static void main(String[] args) {
//        // 자식 물고기
//        FishChild fishChild = new FishChild();
//        fishChild.setSex("Male");
//        fishChild.setEatable(true);
//        fishChild.setLeavingSea("동해");
//
//        fishChild.printfMyInfo();
//
//
//        // 생성자 오버로딩
//        FishChild fishChild2 = new FishChild("Female",true,"서해");
//
//        fishChild2.printfMyInfo();

        // 자식 물고기 생성

        FishChild fishChild = new FishChild();
        fishChild.setLeavingSea("동해");
        fishChild.setLeavingSea("서해");

        fishChild.printSea();
    }


}
