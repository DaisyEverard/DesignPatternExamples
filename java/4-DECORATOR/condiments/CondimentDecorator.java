package condiments;
import bases.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}