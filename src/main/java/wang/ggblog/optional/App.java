package wang.ggblog.optional;

import java.util.Optional;

/**
 * @author wang1
 * @date 2018/8/6
 */
public class App {

    public static void main(String[] args) throws Throwable {
        Optional<User> wang = User.getUser("ss", "22");
        /*User user1 = wang.filter((user) -> user.isAvailableName(user.getName())).orElse(new User());
        System.out.println(user1.getName());*/

        wang.ifPresent((user -> System.out.println(user.getName())));

        wang.orElseThrow(()->new Throwable("error!!!!!! is null"));
    }
}
