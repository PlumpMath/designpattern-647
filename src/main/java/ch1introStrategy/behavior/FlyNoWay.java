package ch1introStrategy.behavior;

/**
 * Created by zhangzj on 2016/11/26.
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I cannot fly");
    }
}
