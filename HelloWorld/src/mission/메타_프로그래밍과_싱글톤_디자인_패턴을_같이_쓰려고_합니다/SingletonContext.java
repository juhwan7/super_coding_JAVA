package mission.메타_프로그래밍과_싱글톤_디자인_패턴을_같이_쓰려고_합니다;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Signature;
import java.util.HashMap;
import java.util.Map;

public class SingletonContext {

    private static SingletonConfig config;
    private static Map<String, Method> singletonMap = new HashMap<>();
    private static Map<String, Object> singletonObjectMap = new HashMap<>();

    public static void setConfig(SingletonConfig config) {
        SingletonContext.config = config;
    }

    static synchronized Object getSingleton(String name) throws InvocationTargetException, IllegalAccessException {
        //TODO: 아래 구문 삭제 후, Map을 이용한 Singleton 생성 로직 구현 필요합니다.
        Object singletonObject = singletonObjectMap.get(name);
        if (singletonObject == null) {
            singletonObject = singletonMap.get(name).invoke(config);
            singletonMap.put(name, (Method) singletonObject);
        }

        return singletonObject;
    }

    public static void executeMethodsBySingletonAnnotation(Object object) {
        // TODO - 1: Object 가 들어 오면 해당 클래스의 Method를 돌면서, @Singleton annotation을 발견합니다.
        // TODO - 2: 해당 Annotation의 name 과 method를 적당한 Map에 저장합니다.
        Class<?> clazz = object.getClass();
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            Annotation[] annotations = method.getDeclaredAnnotations();

            for (Annotation annotation : annotations) {
                if (annotation instanceof Singleton) {
                    Singleton singletonAnnotation = (Singleton) annotation;
                    String name = singletonAnnotation.name();
                    singletonMap.put(name, method);
                }
            }
        }

    }

}

