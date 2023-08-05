package mission.도형을_나타내는_클래스;

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    public void printRectangleInfo() {
        this.printInfo();
    }

    @Override
    protected void printInfo() {
        System.out.println("도형의 색상: " + color);
        System.out.println("도형의 면적: " + getArea());
        System.out.println("사각형의 가로 길이: " + height);
        System.out.println("사각형의 세로 길이: " + width);
    }
}