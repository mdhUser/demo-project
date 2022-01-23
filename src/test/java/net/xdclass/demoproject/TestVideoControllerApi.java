package net.xdclass.demoproject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.nio.charset.Charset;
import java.util.Map;

/**
 * @program: demo-project
 * @description:
 * @author: mdh
 * @create: 2022-01-20 17:20
 **/
@SpringBootTest
@AutoConfigureMockMvc
public class TestVideoControllerApi {

    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    public void setOne(){
        System.out.println("测试类 before");
    }

    @Test
    public void test() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/pub/video/list"))
                .andExpect(MockMvcResultMatchers.status().isOk()).andReturn();

        int status = mvcResult.getResponse().getStatus();
        String result = mvcResult.getResponse().getContentAsString(Charset.forName("utf-8"));
        System.out.println(status);
        System.out.println(result);
    }



}
