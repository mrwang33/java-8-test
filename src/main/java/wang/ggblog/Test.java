package wang.ggblog;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * @author wang1
 * @date 2018/7/22
 */
public class Test {
    static String fudu = "+1";

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("wang");
        strings.add("liang");
        strings.forEach(System.out::println);

        Repeater repeater = System.out::println;
        repeater.fudu();

    }

    private static int test(int a, int b) {
        return a + b;
    }
}
