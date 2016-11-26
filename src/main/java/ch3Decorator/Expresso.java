package ch3Decorator;

/**
 * Created by zhangzhoujian on 11/26/16.
 */
public class Expresso extends Beverage {
    public Expresso() {
        description = "Expresso";
    }

    public double cost() {
        return 1.99;

    }
}
