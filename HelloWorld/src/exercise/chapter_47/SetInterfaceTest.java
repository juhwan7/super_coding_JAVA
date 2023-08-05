package exercise.chapter_47;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceTest {

    public static void main(String[] args) {
        // Set 인터페이스 구현
        Set<String> fruitSet = new HashSet<>();

        // Add
        fruitSet.add("Orange");
        fruitSet.add("Apple");
        fruitSet.add("Mango");
        fruitSet.add("Grape");

        System.out.println("fruistSet: " + fruitSet);

        // add 중복 X
        fruitSet.add("Melon");
        System.out.println("fruistSet: " + fruitSet);

        // remove(set)
        fruitSet.remove("Apple");
        System.out.println("fruiseSet: " + fruitSet);

        // container
        System.out.println("Apple 있는지: " + fruitSet.contains("Apple"));
        System.out.println("Mango 있는지: " + fruitSet.contains("Mango"));

        // Size, isEmpty,Clear
        System.out.println("사이즈: " + fruitSet.size());

        fruitSet.clear();
        System.out.println("Set이 비었는지? : " + fruitSet.isEmpty());
        System.out.println("fruistSet: " + fruitSet);
    }
}
