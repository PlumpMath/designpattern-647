package ch8TemplateMethod;

/**
 * Created by zhang.zj on 2016/12/4.
 */
public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()){
            addCondiments();
        }
    }

    protected boolean customerWantsCondiments() {

        return true;
    }

    protected  void hook(){}

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");

    }

    protected abstract void addCondiments();

    protected abstract void brew();
}
