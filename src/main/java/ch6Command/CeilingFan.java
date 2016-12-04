package ch6Command;

/**
 * Created by zhang.zj on 2016/12/2.
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public int getSpeed() {
        return speed;
    }

    public CeilingFan(String location) {
        this.location = location;
        this.speed = OFF;
    }

    public void high() {
        speed = HIGH;

        System.out.println("Ceiling Fan Speed High");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println("Ceiling Fan Speed Medium");
    }

    public void low() {
        speed = LOW;

        System.out.println("Ceiling Fan Speed Low");
    }

    public void off() {
        speed = OFF;

        System.out.println("Ceiling Fan Speed Off");
    }
}
