package mission.도형의_면적과_둘레를_계산;


public class Circle extends Shape {

    private String color;
    private double radius;// 반지름
    private double dimension; // 차원
    private double calculateDiameter;// 지름


    private double doublecalculateArea;// 면적

    public Circle(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return super.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calculateDiameter() {//지름

        return this.radius * 2;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
