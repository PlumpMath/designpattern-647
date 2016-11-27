package ch4Factory.pizzaStore;

import ch4Factory.pizza.Pizza;

/**
 * Created by zhangzhoujian on 11/27/16.
 */
public abstract class PizzaStore {

    public final Pizza orderPizza(String type) {
        Pizza pizza = null;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String type);
}
