package net.xdclass.demoproject.service;

import net.xdclass.demoproject.domain.User;

import java.util.List;

/**
 * @program: demo-project
 * @description: 用户服务
 * @author: mdh
 * @create: 2022-01-18 19:29
 **/
public interface UserService {

     String login(String username,String password);

     List<User> getUserAll();

}
