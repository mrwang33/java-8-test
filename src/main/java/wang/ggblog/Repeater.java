package wang.ggblog;

/**
 * @author wang1
 * @date 2018/7/22
 */
public interface Repeater {

    /**
     * 人人都是复读机
     * @param words
     */
    void reread(String words);

    /**
     * java8 新特性 默认方法
     */
    default void fudu() {
        System.out.println("我来聊天了");
    }
}
