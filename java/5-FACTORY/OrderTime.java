import pizzas.Pizza;
import stores.BasicStylePizzaStore;
import stores.ChicagoStylePizzaStore;
import stores.PizzaStore;
import stores.SimplePizzaFactory;

public class OrderTime {
    public static void main(String[] args) {
        System.out.println("runnning OrderTime");

        SimplePizzaFactory myFactory = new SimplePizzaFactory();
        
        PizzaStore basicPizzaStore = new BasicStylePizzaStore(myFactory);
        PizzaStore chicagoPizzaStory = new ChicagoStylePizzaStore(myFactory);

        Pizza chicagoCheese = chicagoPizzaStory.orderPizza("cheese");
        System.out.println("---------\n");
        Pizza basicCheese = basicPizzaStore.orderPizza("cheese");
        System.out.println("---------\n");
        Pizza chicagoVeggie = chicagoPizzaStory.orderPizza("veggie");
        System.out.println("---------\n");
        
        System.out.println(chicagoCheese.getName());
        System.out.println(basicCheese.getName());
        System.out.println(chicagoVeggie.getName());


    }
}
