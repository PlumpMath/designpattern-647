package ch7AdapterFacade.adapter;

/**
 * Created by zhang.zj on 2016/12/4.
 */
public class MallardDuck implements Duck {
    public void quack() {
        System.out.println("Quack");
    }

    public void fly() {
        System.out.println("I am flying");
    }
}
