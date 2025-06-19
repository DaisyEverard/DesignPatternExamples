package condiments;

import bases.Beverage;

public class VanillaSyrup extends CondimentDecorator {
    public VanillaSyrup(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Vanilla Syrup";
    }
    
    public double cost() {
        return beverage.cost() + .30;
    }
}
