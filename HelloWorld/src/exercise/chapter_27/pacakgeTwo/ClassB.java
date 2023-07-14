package exercise.chapter_27.pacakgeTwo;

import exercise.chapter_27.pacakgeOne.ClassA;

public class ClassB {

    public void testPublish(ClassA classA){

        String publicStr = classA.publicStr;
        classA.methodPublic();
    }
    public void testDefault(ClassA classA){
    }
}
