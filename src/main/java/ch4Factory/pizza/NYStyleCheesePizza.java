package ch4Factory.pizza;

import ch4Factory.Cheese;
import ch4Factory.Dough;
import ch4Factory.PizzaIngredientFactory;
import ch4Factory.Sauce;

/**
 * Created by zhangzhoujian on 11/27/16.
 */
public class NYStyleCheesePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;
    Dough dough;
    Sauce sauce;
    Cheese cheese;

    public NYStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
