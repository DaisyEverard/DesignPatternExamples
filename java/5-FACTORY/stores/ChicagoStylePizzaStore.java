package stores;

import ingredients.BasicPizzaIngredientFactory;
import ingredients.PizzaIngredientFactory;
import pizzas.CheesePizza;
import pizzas.Pizza;
import pizzas.VeggiePizza;
import pizzas.PepperoniPizza;

public class ChicagoStylePizzaStore extends PizzaStore {

    public ChicagoStylePizzaStore(SimplePizzaFactory factory) {
        super(factory);
    }

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new BasicPizzaIngredientFactory();

         switch(item) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Basic Cheese Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Basic Pepperoni Pizza");
                break;
            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("Basic Veggie Pizza");
                break;
        }

        return pizza;
    }
    
}
