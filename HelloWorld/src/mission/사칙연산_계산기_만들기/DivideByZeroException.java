package mission.사칙연산_계산기_만들기;

public class DivideByZeroException extends Exception {
    public DivideByZeroException() {
        super("0으로 나눌 수 없습니다.");
    }
}
