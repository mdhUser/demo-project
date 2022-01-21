package net.xdclass.demoproject.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.xml.internal.ws.developer.Serialization;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @program: demo-project
 * @description: 视频
 * @author: mdh
 * @create: 2022-01-18 17:24
 **/

@Data
public class Video implements Serializable {
    private int id;
    private String title;
    private String summary;
    private int price;
    @JsonProperty("cover_img")
    private String coverImg;
    @JsonProperty("push_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    private Date createTime;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("chapter_list")
    private List<Chapter> chapterList;

    public Video() {
    }

    public Video(int id, String title, Date createTime) {
        this.id = id;
        this.title = title;
        this.createTime = createTime;
    }
}
