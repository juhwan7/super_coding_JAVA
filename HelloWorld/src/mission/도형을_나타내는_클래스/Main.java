package mission.도형을_나타내는_클래스;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle("빨강", 4.0);
        Shape shape2 = new Rectangle("파랑", 3.0, 4.0);

        System.out.println("Shape1 면접 크키: " + shape1.getArea());
        System.out.println("Shape2 면접 크키: " + shape2.getArea());

        System.out.println("------------------------");

        if (shape1 instanceof Circle) {
            Circle circle = (Circle) shape1;
            circle.printCircleInfo();
        }

        System.out.println("------------------------");

        if (shape2 instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape2;
            rectangle.printRectangleInfo();
        }
    }
}
//
//    Shape1 면접 크키: 50.24
//        Shape2 면접 크키: 12.0
//        ------------------------
//        도형의 색상: 빨강
//        도형의 면적: 50.24
//        원의 반지름: 4.0
//        ------------------------
//        도형의 색상: 파랑
//        도형의 면적: 12.0
//        사각형의 가로 길이: 3.0
//        사각형의 세로 길이: 4.0