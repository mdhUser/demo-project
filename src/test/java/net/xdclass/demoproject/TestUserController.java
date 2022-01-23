package net.xdclass.demoproject;

import net.xdclass.demoproject.controller.UserController;
import net.xdclass.demoproject.domain.User;
import net.xdclass.demoproject.utils.JsonData;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @program: demo-project
 * @description: 测试用户接口
 * @author: mdh
 * @create: 2022-01-20 15:56
 **/
@SpringBootTest
public class TestUserController {

    @Autowired
    private UserController userController;

    @BeforeEach
    public void setOne(){
        System.out.println("这是测试类 Before");
    }

    @Test
    public void Test(){
        User user = new User(1,"jack","1234");
        JsonData jsonData=userController.login(user);
        System.out.println(jsonData.toString());
        assertEquals(0, jsonData.getCode());
    }

}
