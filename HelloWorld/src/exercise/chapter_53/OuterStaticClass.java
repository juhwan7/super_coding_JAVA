package exercise.chapter_53;

public class OuterStaticClass {
// 정적 중첩 클래스

    private static int outerDate;

    public OuterStaticClass(int outerDate) {
        this.outerDate = outerDate;
    }

    public static class InnerClass {
        private int innerData;

        public InnerClass(int innerData) {
            this.innerData = innerData;
        }

        void display() {
            System.out.println("OuterData:" + outerDate);// static은 시작과 동시에 만들어지기 때문에 outerDate를 부를 수 없다
            System.out.println("InnerData:" + innerData);
        }
    }


}
