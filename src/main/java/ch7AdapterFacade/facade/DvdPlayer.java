package ch7AdapterFacade.facade;

/**
 * Created by zhang.zj on 2016/12/4.
 */
public class DvdPlayer {
    public void on() {

        System.out.println("Dvd player is on");

    }

    public void play(String movie) {

        System.out.println("dvd player is playing " + movie);
    }

    public void stop() {
        System.out.println("dvd player is off");
    }

    public void eject() {
        System.out.println("dvd player is ejected");
    }

    public void off() {
        System.out.println("dvd player is off");
    }
}
