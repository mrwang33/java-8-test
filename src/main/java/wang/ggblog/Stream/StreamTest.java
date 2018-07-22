package wang.ggblog.Stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author wang1
 * @date 2018/7/22
 */
public class StreamTest {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("wang", "liang", "yuqing");
        names.stream().filter(s->s.equals("liang")).forEach(System.out::println);
    }
}
