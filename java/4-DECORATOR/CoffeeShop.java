import bases.Americano;
import bases.Beverage;
import bases.Espresso;
import bases.Latte;
import condiments.Mocha;
import condiments.SoyMilk;
import condiments.VanillaSyrup;

public class CoffeeShop {
    public static void main(String[] args) {
        Beverage espresso1 = new Espresso();
        System.out.println(espresso1.getDescription() + " $" + espresso1.cost());

        Beverage americano1 = new Americano();
        americano1 = new Mocha(americano1);
        americano1 = new VanillaSyrup(americano1);
         System.out.println(americano1.getDescription() + " $" + americano1.cost());

        Beverage latte1 = new Latte();
        latte1 = new SoyMilk(latte1);
        latte1 = new VanillaSyrup(latte1);
         System.out.println(latte1.getDescription() + " $" + latte1.cost());


    }
}
