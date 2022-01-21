package net.xdclass.demoproject.controller;

import net.xdclass.demoproject.config.WXConfig;
import net.xdclass.demoproject.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: demo-project
 * @description: 模拟微信支付
 * @author: mdh
 * @create: 2022-01-19 22:19
 **/
@RestController
@RequestMapping("/api/vi/pub/wxpay")
public class TestWxController {

    @Autowired
    private WXConfig wxConfig;

    @GetMapping("pay")
    public JsonData testConfig() {
        Map<String, String> map = new HashMap<>();
        map.put("metchid", wxConfig.getPayMetchId());
        map.put("secret", wxConfig.getPaySecret());
        map.put("appid", wxConfig.getPayAppId());
        return JsonData.buildSuccess(map);
    }
}
