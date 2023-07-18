package mission.도형의_면적과_둘레를_계산;

public class Rectangle extends Shape {

    private String color;
    private double width;
    private double height;


    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateDiagonal() {

        return 0.0;
    }


    public String getColor() {
        return super.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
