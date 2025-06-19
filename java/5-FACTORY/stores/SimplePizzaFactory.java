package stores;

import pizzas.Pizza;
import pizzas.CheesePizza;
import pizzas.PepperoniPizza;
import pizzas.VeggiePizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        switch(type) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
        }

        return pizza;
    }
}
