package ch1introStrategy;

import ch1introStrategy.behavior.FlyNoWay;
import ch1introStrategy.behavior.Quack;

/**
 * Created by zhangzj on 2016/11/26.
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I am a Model Duck");
    }
}
