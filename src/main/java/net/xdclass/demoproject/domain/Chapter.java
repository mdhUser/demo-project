package net.xdclass.demoproject.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: demo-project
 * @description: 章节
 * @author: mdh
 * @create: 2022-01-19 14:17
 **/
@Data
public class Chapter implements Serializable {
    private int id;
    private int videoId;
    private String title;

}
