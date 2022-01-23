package net.xdclass.demoproject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @program: demo-project
 * @description: 单元测试
 * @author: mdh
 * @create: 2022-01-20 12:28
 **/
@SpringBootTest(classes = {DemoProjectApplicationTests.class})
public class TestJUnit {


    @BeforeEach
    public void before(){
        System.out.println(0);
    }


    @Test
    public void test() {
        System.out.println(1);
    }

    @AfterEach
    public void after(){
        System.out.println(2);
    }

}
