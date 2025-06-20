package stores;

import pizzas.Pizza;
import ingredients.PizzaIngredientFactory;
import pizzas.CheesePizza;
import pizzas.PepperoniPizza;
import pizzas.VeggiePizza;

public class SimplePizzaFactory {
    PizzaIngredientFactory ingredientFactory;

    public SimplePizzaFactory() {
    }

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        switch(type) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                break;
            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                break;
        }

        return pizza;
    }
}
