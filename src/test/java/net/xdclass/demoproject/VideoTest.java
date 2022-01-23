package net.xdclass.demoproject;

import net.xdclass.demoproject.domain.Video;
import net.xdclass.demoproject.service.VideoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @program: demo-project
 * @description: 视频测试
 * @author: mdh
 * @create: 2022-01-20 16:30
 **/
@SpringBootTest
public class VideoTest {

    @Autowired
    private VideoService videoService;

    @BeforeEach
    public void setOne(){
        System.out.println("这是测试类 Before");
    }

    @Test
    public void test(){
        List<Video> list = videoService.getListVideo();
        Assertions.assertTrue(list.size()>0);

    }

}
