package exercise.chapter_27.pacakgeOne;

public class ClassAA {

    void testPublic(ClassA classA) {
        String publicStr = classA.publicStr;
        classA.methodPublic();
    }

    void testPrivate(ClassA classA){

    }
    void testDefault(ClassA classA){
        String defaultStr = classA.defaultStr;
        classA.methodDefault();
    }
}
