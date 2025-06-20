package ingredients;

import ingredients.cheese.Cheese;
import ingredients.dough.Dough;
import ingredients.pepperoni.Pepperoni;
import ingredients.sauce.Sauce;
import ingredients.veggies.Veggie;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggie[] createVeggies();
    public Pepperoni createPepperoni();
}
