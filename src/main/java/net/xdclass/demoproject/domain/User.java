package net.xdclass.demoproject.domain;

import com.sun.xml.internal.ws.developer.Serialization;
import lombok.Data;

/**
 * @program: demo-project
 * @description: yonhu
 * @author: mdh
 * @create: 2022-01-18 17:36
 **/
@Data
@Serialization
public class User {
    private int id;
    private String username;
    private String pwd;

    public User() {
    }

    public User(int id, String username, String pwd) {
        this.id = id;
        this.username = username;
        this.pwd = pwd;
    }
}
