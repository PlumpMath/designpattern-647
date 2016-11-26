package ch3Decorator;

/**
 * Created by zhangzhoujian on 11/26/16.
 * 基础的饮料，所有的饮料都继承这个类
 */
public abstract class Beverage {
    String description = "unknown beverage";

    String getDescription() {
        return description;
    }

    public abstract double cost();
}
