package ch4Factory.pizzaStore;

import ch4Factory.pizza.CaliforniaStyleCheesePizza;
import ch4Factory.pizza.CaliforniaStyleClamPizza;
import ch4Factory.pizza.Pizza;

/**
 * Created by zhangzhoujian on 11/27/16.
 */
public class CaliforniaPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CaliforniaStyleCheesePizza();
        } else if (type.equals("clam")) {
            return new CaliforniaStyleClamPizza();
        }
        return null;
    }
}
