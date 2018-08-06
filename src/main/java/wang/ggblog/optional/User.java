package wang.ggblog.optional;

import java.util.Optional;

/**
 * @author wang1
 * @date 2018/8/6
 */
public class User {
    private String name;

    private String age;

    public User() {
    }

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public boolean isAvailableName(String name) {
        return name.length() < 10;
    }

    public static Optional<User> getUser(String name,String age) {
        User user = null;
        if ("wang".equals(name)) {
            user  = new User(name, age);
        }

        return Optional.ofNullable(user);
    }
}
