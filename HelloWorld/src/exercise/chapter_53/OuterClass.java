package exercise.chapter_53;

import java.io.LineNumberReader;

public class OuterClass {
    private int outerData;

    public OuterClass(int outerData) {
        this.outerData = outerData;
    }

    public class InnerClass {
        private int innerData;

        public InnerClass(int innerData) {
            innerData = innerData;
        }

        void display() {
            System.out.println("OuterDate: " + outerData);
            System.out.println("InnerDate" + innerData);
        }
    }
}
