package ch7AdapterFacade.adapter;

/**
 * Created by zhang.zj on 2016/12/4.
 */
public class DuckTestDrive {
    public static void main(String[] args){
        MallardDuck duck = new MallardDuck();

        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("The Turkey says...");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("\n the Duck says...");
        testDuck(duck);

        System.out.println("\n the TurkeyAdapter says...");
        testDuck(turkeyAdapter);


    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
