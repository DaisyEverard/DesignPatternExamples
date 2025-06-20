package stores;

import pizzas.CheesePizza;
import pizzas.PepperoniPizza;
import pizzas.Pizza;
import pizzas.VeggiePizza;

public class BasicStylePizzaStore extends PizzaStore {

    public BasicStylePizzaStore(SimplePizzaFactory factory) {
        super(factory);
    }

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

