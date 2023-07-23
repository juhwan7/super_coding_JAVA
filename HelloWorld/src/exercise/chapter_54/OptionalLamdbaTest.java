package exercise.chapter_54;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalLamdbaTest {
    public static void main(String[] args) {
        String str = null;

        // null 값이 들어오면 Optional로 오류가 나지않게 해준다
        Optional<String> stringOptional = Optional.ofNullable(str);

        // 람다를 활용하여 default 값을 넣는다
//        Supplier<String> stringSupplier =

        //orElse는 null이던말던 항상 불립니다.
        //orElseGet은 null일 때만 불립니다.
        // null값이 들어오면 stringSupplier람다 실행
        String str2 = stringOptional.orElseGet(() -> {
            throw new CustomException("customExcpetion 입니다.");
        }).toUpperCase();

        System.out.println(str2);
    }
}
