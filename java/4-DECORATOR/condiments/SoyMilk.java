package condiments;

import bases.Beverage;

public class SoyMilk extends CondimentDecorator {
    public SoyMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy Milk";
    }
    
    public double cost() {
        return beverage.cost() + .50;
    }
}
