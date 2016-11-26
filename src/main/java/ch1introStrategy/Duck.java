package ch1introStrategy;

import ch1introStrategy.behavior.FlyBehavior;
import ch1introStrategy.behavior.QuackBehavior;

/**
 * Created by zhangzj on 2016/11/26.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public Duck(){}

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("Every duck swims, Every duck!");
    }


    public abstract void display();
}
