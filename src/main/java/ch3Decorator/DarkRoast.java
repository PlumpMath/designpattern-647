package ch3Decorator;

/**
 * Created by zhangzhoujian on 11/26/16.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "dark roast";
    }

    public double cost() {
        return 0.99;

    }
}
