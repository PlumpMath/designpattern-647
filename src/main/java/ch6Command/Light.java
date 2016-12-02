package ch6Command;

/**
 * Created by zhangzhoujian on 11/27/16.
 */
public class Light {
    private String name;
    public Light(String s) {
        name = s;
    }
    public Light() {
        name = "default light";
    }

    public void on() {
        System.out.println("on of Light");
    }

    public void off() {
        System.out.println("off of Light");
    }
}
