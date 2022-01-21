package net.xdclass.demoproject.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @program: demo-project
 * @description:
 * @author: mdh
 * @create: 2022-01-21 20:36
 **/
@WebListener
public class ApplicationListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("contextInitialized=====");
    }


    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("contextDestroyed=====");
    }
}
