package stores;

import pizzas.ChicagoCheesePizza;
import pizzas.ChicagoPepperoniPizza;
import pizzas.Pizza;
import pizzas.ChicagoVeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore {

    public ChicagoStylePizzaStore(SimplePizzaFactory factory) {
        super(factory);
    }

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        
        switch(type) {
            case "cheese":
                pizza = new ChicagoCheesePizza();
                break;
            case "pepperoni":
                pizza = new ChicagoPepperoniPizza();
                break;
            case "veggie":
                pizza = new ChicagoVeggiePizza();
                break;
        }

        return pizza;
    }
    
}
