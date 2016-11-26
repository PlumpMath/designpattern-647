package ch1introStrategy;

import ch1introStrategy.behavior.FlyRocketPowered;
import org.testng.annotations.Test;

/**
 * Created by zhangzj on 2016/11/26.
 */
public class MiniDuckSimulator {


    @Test
    public void mallardDuckTest() {
        Duck mallard = new MallardDuck();

        mallard.performFly();
        mallard.performQuack();

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.performQuack();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();

    }
}
