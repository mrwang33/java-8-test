package wang.ggblog.jvm;

import java.util.ArrayList;

/**
 * @author wang1
 * @date 2018/7/24
 */
public class Test {

    public void test() {
        test();
    }

    public void testTwo() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings = null;

        System.gc();
        System.out.println("hello");
    }
}
