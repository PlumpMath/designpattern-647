package ch4Factory.pizzaStore;

import ch4Factory.NYPizzaIngredientFactory;
import ch4Factory.PizzaIngredientFactory;
import ch4Factory.pizza.NYStyleCheesePizza;
import ch4Factory.pizza.NYStyleClamPizza;
import ch4Factory.pizza.Pizza;

/**
 * Created by zhangzhoujian on 11/27/16.
 */
public class NYPizzaStore extends PizzaStore {
    Pizza createPizza(String type) {
        Pizza pizza= null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();


        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza(pizzaIngredientFactory);
            pizza.setName("NY Style cheese pizza");
        } else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        }

        return pizza;
    }
}
