package pizzas;

import ingredients.PizzaIngredientFactory;

public class ChicagoCheesePizza extends Pizza {
     PizzaIngredientFactory ingredientFactory;

    public ChicagoCheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
