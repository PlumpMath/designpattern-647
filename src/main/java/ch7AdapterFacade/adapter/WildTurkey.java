package ch7AdapterFacade.adapter;

/**
 * Created by zhang.zj on 2016/12/4.
 */
public class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("Gooble gooble");
    }

    public void fly() {
        System.out.println("I am flying a short distance");
    }
}
