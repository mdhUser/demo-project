package net.xdclass.demoproject.fitler;

import com.fasterxml.jackson.databind.ObjectMapper;
import net.xdclass.demoproject.domain.User;
import net.xdclass.demoproject.service.impl.UserServiceImpl;
import net.xdclass.demoproject.utils.JsonData;
import org.thymeleaf.util.StringUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @program: demo-project
 * @description: 登录过滤器
 * @author: mdh
 * @create: 2022-01-21 14:12
 **/
@WebFilter(urlPatterns = "/api/v1/pri/*", filterName = "loginFilter")
public class LoginFilter implements Filter {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    /***
     * 容器加载的时候
     * @param filterConfig
     * @throws ServletException
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init LoginFilter=======");
    }


    /**
     * @param request
     * @param response
     * @param chain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("doFilter LoginFilter======");

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        String token = req.getHeader("token");
        if (StringUtils.isEmpty(token)) {
            token = req.getParameter("token");
        }
        if (!StringUtils.isEmpty(token)) {
            User user = UserServiceImpl.sessionMap.get(token);
            if (null != user) {
                chain.doFilter(request, response);
            } else {
                JsonData jsonData = JsonData.buildError("登录失败，token无效", -2);
                String jsonStr = objectMapper.writeValueAsString(jsonData);
                renderJson(resp, jsonStr);
            }
        } else {
           JsonData jsonData = JsonData.buildError("未登录",-3);
           String jsonStr = objectMapper.writeValueAsString(jsonData);
           renderJson(resp, jsonStr);
        }
    }


    private void renderJson(HttpServletResponse response, String json) {
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json");
        try (PrintWriter writer = response.getWriter()) {
            writer.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 容器摧毁的时候
     */
    @Override
    public void destroy() {
        System.out.println("destroy LoginFilter=======");
    }
}
