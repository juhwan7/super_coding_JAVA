package mission.사칙연산_계산기_만들기;

public class InvalidOperatorException extends Exception {

    public InvalidOperatorException() {
        super("유효하지 않은 연산자입니다.");
    }
}
