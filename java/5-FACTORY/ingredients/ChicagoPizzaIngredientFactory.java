package ingredients;

import ingredients.cheese.Cheese;
import ingredients.cheese.Mozzerella;
import ingredients.dough.DeepDish;
import ingredients.dough.Dough;
import ingredients.pepperoni.Pepperoni;
import ingredients.sauce.Marinara;
import ingredients.sauce.Sauce;
import ingredients.veggies.Mushroom;
import ingredients.veggies.Onion;
import ingredients.veggies.Veggie;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new DeepDish();
    }

    public Sauce createSauce() {
        return new Marinara();
    }

    public Cheese createCheese() {
        return new Mozzerella();
    }

    public Veggie[] createVeggies() {
        Veggie[] veggieList = new Veggie[] {
            new Onion(),
            new Mushroom()
        };
        return veggieList;
    }

    public Pepperoni createPepperoni() {
        return new Pepperoni();
    }

    
}
