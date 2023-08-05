package exercise.chapter_60.decorator;

public class Suger extends BeverageDecorator {

    public Suger(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", suger";
    }

    @Override
    public double cost() {
        return super.cost() + 0.3;
    }
}
