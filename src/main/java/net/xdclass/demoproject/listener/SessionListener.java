package net.xdclass.demoproject.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @program: demo-project
 * @description:
 * @author: mdh
 * @create: 2022-01-21 20:45
 **/
@WebListener
public class SessionListener implements HttpSessionListener {


    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("sessionCreated======");
    }


    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("HttpSessionEvent=======");
    }
}