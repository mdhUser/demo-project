package net.xdclass.demoproject.listener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * @program: demo-project
 * @description:
 * @author: mdh
 * @create: 2022-01-21 20:49
 **/

@WebListener
public class CustomRequestListener implements ServletRequestListener{

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {

        System.out.println("requestDestroyed=========");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("requestInitialized========");
    }
}