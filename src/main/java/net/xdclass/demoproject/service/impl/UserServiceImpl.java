package net.xdclass.demoproject.service.impl;

import net.xdclass.demoproject.domain.User;
import net.xdclass.demoproject.mapper.UserMapper;
import net.xdclass.demoproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @program: demo-project
 * @description: 用户服务实现
 * @author: mdh
 * @create: 2022-01-18 19:30
 **/
@Service
public class UserServiceImpl implements UserService {

    private static Map<String, User> sessionMap = new HashMap<>();

    @Autowired
    private UserMapper userMapper;

    @Override
    public String login(String username, String password) {
        User user = userMapper.login(username, password);
        if (null == user) {
            return null;
        } else {
            String token = UUID.randomUUID().toString();
            System.out.println(token);
            sessionMap.put(token, user);
            return token;
        }
    }

    @Override
    public List<User> getUserAll() {
        return userMapper.getUserList();
    }
}
