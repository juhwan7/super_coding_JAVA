package exercise.chapter_61.MyAnnotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface MyAnnotation {

    String name();
    int count() default 0;

}
