package mission.도형의_면적과_둘레를_계산;

public abstract class Shape {
    public String color = "기본색";


    protected double dimension; //지름

    public double calculatePerimeter() {//둘레
        return 0.0;
    }

    public double calculateArea() {//면적
        return 0.0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDimension() {
        return dimension;
    }

    public void setDimension(double dimension) {
        this.dimension = dimension;
    }

    
}
