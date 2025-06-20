package ingredients;

import ingredients.cheese.Cheese;
import ingredients.cheese.Mozzerella;
import ingredients.dough.Dough;
import ingredients.dough.ThinCrust;
import ingredients.pepperoni.Pepperoni;
import ingredients.sauce.Marinara;
import ingredients.sauce.Sauce;
import ingredients.veggies.Onion;
import ingredients.veggies.Pepper;
import ingredients.veggies.Veggie;


public class BasicPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThinCrust();
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
            new Pepper()
        };
        return veggieList;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new Pepperoni();
    }
    
}
