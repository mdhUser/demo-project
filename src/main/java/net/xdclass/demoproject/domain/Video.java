package net.xdclass.demoproject.domain;

import com.sun.xml.internal.ws.developer.Serialization;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @program: demo-project
 * @description: 视频
 * @author: mdh
 * @create: 2022-01-18 17:24
 **/

@Data
@Serialization
public class Video {
    private int id;
    private String title;
    private String summary;
    private int price;
    private String coverImg;
    private Date createTime;
    private List<Chapter> chapterList;

    public Video() {
    }

    public Video(int id, String title) {
        this.id = id;
        this.title = title;
    }
}
