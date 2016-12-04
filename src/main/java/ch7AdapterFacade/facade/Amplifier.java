package ch7AdapterFacade.facade;

/**
 * Created by zhang.zj on 2016/12/4.
 */
public class Amplifier {
    private int volume;
    private DvdPlayer dvd;

    public void setDvd(DvdPlayer dvd) {
        this.dvd = dvd;
    }

    public Amplifier(DvdPlayer dvd) {
        this.dvd = dvd;
    }

    public void on() {
        System.out.println("amplifier on");
    }

    public void setSurroundSound() {


    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void off() {

        System.out.println("amplifier is off");
    }
}
