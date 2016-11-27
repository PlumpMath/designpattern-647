package ch4Factory.pizza;

import ch4Factory.Dough;
import ch4Factory.Sauce;

import java.util.ArrayList;
import java.util.zip.DeflaterOutputStream;

/**
 * Created by zhangzhoujian on 11/27/16.
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    ArrayList toppings = new ArrayList();

    public abstract void prepare();
//    public void prepare() {
//
//        System.out.println("Prepraing ... "+ name);
//        System.out.println("Tossing dough ...");
//        System.out.println("Adding Sauce ...");
//        System.out.println("Adding toppings: ");
//        for (int i = 0; i < toppings.size(); i++){
//            System.out.println("  " + toppings.get(i));
//        }
//    }

    public void bake() {

        System.out.println("Bake for 25 minutes to 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");

    }

    public void box() {
        System.out.println("Place pizza in offical PizzaStore box");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
