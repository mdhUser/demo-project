package net.xdclass.demoproject.controller;

import net.xdclass.demoproject.domain.User;
import net.xdclass.demoproject.service.UserService;
import net.xdclass.demoproject.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: demo-project
 * @description: 用户控制
 * @author: mdh
 * @create: 2022-01-18 19:28
 **/
@RestController
@RequestMapping("/api/vi/pub/user")
public class UserController {

    @Autowired
    public UserService userService;

    /**
     * 登录接口
     * @param user
     * @return
     */
    @PostMapping("/login")
    public JsonData login(@RequestBody User user) {
        String token = userService.login(user.getUsername(), user.getPwd());
        return token != null ? JsonData.buildSuccess(token) : JsonData.buildError("登录失败，" +
                "用户名或密码错误！");
    }

    /**
     * 获取所有用户列表
     * @return
     */
    @GetMapping("/getUserList")
    public JsonData getAllUser() {
        List<User> users = userService.getUserAll();
        return JsonData.buildSuccess(users);
    }

}