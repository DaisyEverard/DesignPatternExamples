package pizzas;

import ingredients.PizzaIngredientFactory;

public class ChicagoPepperoniPizza extends Pizza {
     PizzaIngredientFactory ingredientFactory;

    public ChicagoPepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        pepperoni = ingredientFactory.createPepperoni();
    }
}
