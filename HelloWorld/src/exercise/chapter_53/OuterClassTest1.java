package exercise.chapter_53;

public class OuterClassTest1 {
    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass(20);

        OuterClass.InnerClass innerClass1 = outerClass.new InnerClass(10);
        innerClass1.display();


        // 정적 중첩클래스
        OuterStaticClass outerStaticClass = new OuterStaticClass(10);

        OuterStaticClass.InnerClass innerClass = new OuterStaticClass.InnerClass(20);

        innerClass.display();
    }
}
