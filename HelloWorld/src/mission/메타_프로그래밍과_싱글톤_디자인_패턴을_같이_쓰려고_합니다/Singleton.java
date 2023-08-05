package mission.메타_프로그래밍과_싱글톤_디자인_패턴을_같이_쓰려고_합니다;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// TODO: SingleTon Annotation을 만들어주세요. ( hint: Method, Runtime 에 동작 해야합니다. )
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Singleton {
    String name();
}