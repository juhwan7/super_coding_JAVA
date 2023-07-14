package exercise.chapter_27.pacakgeOne;

public class ClassA {

    public String publicStr;

    private String privateStr;

    String defaultStr;
    public void methodPublic() {

    }

    private void methodPrivate() {
    }

    void methodDefault(){}
    void testPrivate(){
        String privateStr1 = privateStr;
        methodPrivate();
    }

}
