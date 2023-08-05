package mission.메타_프로그래밍과_싱글톤_디자인_패턴을_같이_쓰려고_합니다;

public class SingletonConfig {

    @Singleton(name = "book")
    public Book makeBook(){
        return new Book("title", "author");
    }

    @Singleton(name = "book2")
    public Book makeBook2(){
        return new Book("title2", "author2");
    }

    @Singleton(name = "car")
    public Car makeCar(){
        return new Car(2022, "red");
    }

    @Singleton(name = "car3")
    public Car makeYellowCar(){
        return new Car(2021, "yellow");
    }

}