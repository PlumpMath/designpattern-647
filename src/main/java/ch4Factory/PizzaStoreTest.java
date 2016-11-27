package ch4Factory;

import ch4Factory.pizza.Pizza;
import ch4Factory.pizzaStore.NYPizzaStore;
import ch4Factory.pizzaStore.PizzaStore;

/**
 * Created by zhangzhoujian on 11/27/16.
 */
public class PizzaStoreTest {

    public static void main(String[] args){
        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");

    }
}
