package net.xdclass.demoproject.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @program: demo-project
 * @description: 微信配置
 * @author: mdh
 * @create: 2022-01-19 23:22
 **/

@Data
@Configuration
@PropertySource({"classpath:pay.properties"})
public class WXConfig {

    @Value("${wxpay.appid}")
    private String payAppId;
    @Value("${wxpay.secret}")
    private String paySecret;
    @Value("${wxpay.metchid}")
    private String payMetchId;

}
