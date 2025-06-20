package pizzas;

import ingredients.PizzaIngredientFactory;

public class ChicagoVeggiePizza extends Pizza {
     PizzaIngredientFactory ingredientFactory;

    public ChicagoVeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggie = ingredientFactory.createVeggies();
    }
}

