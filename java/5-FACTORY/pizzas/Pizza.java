package pizzas;

import java.util.ArrayList;
import java.util.List;

import ingredients.dough.Dough;
import ingredients.cheese.Cheese;
import ingredients.pepperoni.Pepperoni;
import ingredients.sauce.Sauce;
import ingredients.veggies.Veggie;


public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggie[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;

    public void prepare() {
        bake();
        cut();
        box();
    };

    

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    };
    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    };
    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}