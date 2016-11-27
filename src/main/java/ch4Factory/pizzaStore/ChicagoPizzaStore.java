package ch4Factory.pizzaStore;

import ch4Factory.pizza.ChicagoStyleCheesePizza;
import ch4Factory.pizza.ChicagoStyleClamPizza;
import ch4Factory.pizza.Pizza;

/**
 * Created by zhangzhoujian on 11/27/16.
 */
public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("clam")) {
            return new ChicagoStyleClamPizza();
        }
        return null;
    }
}
