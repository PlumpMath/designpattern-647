package ch4Factory;

/**
 * Created by zhangzhoujian on 11/27/16.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {

        Veggies[] veggies = {new Garlic(), new Onion()};
        return veggies;
    }

    public Clams createClam() {
        return new FreshClams();
    }
}
