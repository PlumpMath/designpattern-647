package ch1introStrategy.behavior;

/**
 * Created by zhangzj on 2016/11/26.
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Slient >>");
    }
}
