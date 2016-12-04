package ch7AdapterFacade.facade;

/**
 * Created by zhang.zj on 2016/12/4.
 */
public class TheaterLights {
    public void dim(int i) {

        System.out.println("lights dim "+ i+ " dims");
    }

    public void on() {

        System.out.println("light is on");
    }
}
