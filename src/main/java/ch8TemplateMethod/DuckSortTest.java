package ch8TemplateMethod;

import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by zhang.zj on 2016/12/4.
 */
public class DuckSortTest {
    public static void main(String[] args) {
        Duck[] ducks = {new Duck("a", 1), new Duck("b", 2),
                new Duck("c", 234), new Duck("d", 10), new Duck("r", 4),
        new Duck("q", 1)};
        System.out.println("Before sorting: ");
        display(ducks);

        Arrays.sort(ducks);
        System.out.println("\nAfter sort...");
        display(ducks);

    }

    private static void display(Duck[] ducks) {
        for (int i = 0; i < ducks.length; i++){
            System.out.println(ducks[i]);
        }
    }
}
