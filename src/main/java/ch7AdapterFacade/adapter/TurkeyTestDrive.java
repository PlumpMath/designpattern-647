package ch7AdapterFacade.adapter;

/**
 * Created by zhang.zj on 2016/12/4.
 */
public class TurkeyTestDrive {
    public static void main(String[] args){
        Duck duck = new MallardDuck();
        DuckAdapter duckAdapter = new DuckAdapter(duck);

        Turkey turkey = new WildTurkey();

        System.out.println("turkey out");
        turkey.gobble();
        turkey.fly();

        System.out.println("DuckAdapter out");
        duckAdapter.gobble();
        duckAdapter.fly();


    }
}
