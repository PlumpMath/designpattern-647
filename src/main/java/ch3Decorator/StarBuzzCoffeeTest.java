package ch3Decorator;

/**
 * Created by zhangzhoujian on 11/26/16.
 */
public class StarBuzzCoffeeTest {

    public static void main(String[] args){
        Beverage beverage = new Expresso();

        System.out.println(beverage.getDescription() + " cost : " + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " cost : " + beverage1.cost());

    }
}
