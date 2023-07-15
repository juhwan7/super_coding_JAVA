package exercise.chapter_31;

import exercise.chpaer_32.fish.Fish;
import exercise.chpaer_32.fish.FishChild;

public class SeaSituation {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.setSex("Male");
        fish.setLeavingSea("동해");
        fish.setHavingPoison(false);


        FishChild fishChild = new FishChild();
        fishChild.setSex("Female");
        fishChild.setLeavingSea("서해");
        fishChild.setHavingPoison(false);

        fishChild.becomeDanger();
        System.out.println("독성여부 : " + fishChild.isHavingPoison());

        fish.eat("새우");
        fishChild.eat("새우");
        fish.printfMyInfo();
        fishChild.printfMyInfo();

        fishChild.digging();
        fishChild.setEatable(true);

        System.out.println(fishChild.isEatable());
    }
}
