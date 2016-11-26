package ch3Decorator;

/**
 * Created by zhangzhoujian on 11/26/16.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return 0.30 + beverage.cost();
    }
}
