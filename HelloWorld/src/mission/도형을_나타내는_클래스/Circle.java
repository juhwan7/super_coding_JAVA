package mission.도형을_나타내는_클래스;

class Circle extends Shape {
    private static final double PI = 3.14;
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;

    }

    public double getArea() {
        return radius * radius * PI;
    }

    public void printCircleInfo() {
        this.printInfo();
    }

    @Override
    protected void printInfo() {
        System.out.println("도형의 색상: " + color);
        System.out.println("도형의 면적: " + getArea());
        System.out.println("원의 반지름: " + radius);
    }
}