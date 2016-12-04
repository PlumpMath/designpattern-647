package ch8TemplateMethod;

import java.util.StringTokenizer;

/**
 * Created by zhang.zj on 2016/12/4.
 */
public class Duck implements Comparable {
    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public int compareTo(Object o) {
        Duck otherDuck = (Duck) o;

        if (this.weight < otherDuck.weight) {
            return -1;
        } else if (this.weight == otherDuck.weight) {
            return 0;
        } else {
            return 1;
        }

    }
}
