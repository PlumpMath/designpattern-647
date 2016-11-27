package ch4Factory;

/**
 * Created by zhangzhoujian on 11/27/16.
 * 创建原料工厂
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Clams createClam();
}
