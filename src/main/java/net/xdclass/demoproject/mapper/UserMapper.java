package net.xdclass.demoproject.mapper;

import net.xdclass.demoproject.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: demo-project
 * @description:
 * @author: mdh
 * @create: 2022-01-18 18:52
 **/
@Repository
public class UserMapper {

    private static Map<String, User> userMap = new HashMap<>();

    static {
        userMap.put("jack", new User(1, "jack", "123"));
        userMap.put("tom", new User(2, "tom", "12345"));
        userMap.put("pick", new User(3, "pick", "123852"));
    }

    /**
     * 登录
     * @param username
     * @param pwd
     * @return
     */
    public User login(String username, String pwd) {
        User user = userMap.get(username);
        if (user.getPwd().equals(pwd)) {
            return user;
        } else {
            return null;
        }
    }

    public List<User> getUserList(){
        List<User> list = new ArrayList<>();
        list.addAll(userMap.values());
        return list;
    }

}
