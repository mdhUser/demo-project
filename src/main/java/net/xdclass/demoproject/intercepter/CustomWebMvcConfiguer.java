package net.xdclass.demoproject.intercepter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: demo-project
 * @description:拦截器配置类
 * @author: mdh
 * @create: 2022-01-22 13:39
 **/
@Configuration
public class CustomWebMvcConfiguer implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(getLoginInterceptor()).addPathPatterns("/api/v1/pri/**");

        WebMvcConfigurer.super.addInterceptors(registry);
    }

    @Bean
    public LoginIntercepter getLoginInterceptor(){
        return new LoginIntercepter();
    }

}
