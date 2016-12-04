package ch8TemplateMethod;

/**
 * Created by zhang.zj on 2016/12/4.
 */
public class Tea extends CaffeineBeverage {
    protected void addCondiments() {

        System.out.println("Steeping the tea");
    }

    protected void brew() {
        System.out.println("Adding Lemon");

    }
}
