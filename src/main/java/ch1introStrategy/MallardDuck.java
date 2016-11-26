package ch1introStrategy;

import ch1introStrategy.behavior.FlyWithWings;
import ch1introStrategy.behavior.Quack;

/**
 * Created by zhangzj on 2016/11/26.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display() {
        System.out.println("MallardDuck display ...");
    }
}
