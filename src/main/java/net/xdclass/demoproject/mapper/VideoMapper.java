package net.xdclass.demoproject.mapper;
import net.xdclass.demoproject.domain.Video;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * @program: demo-project
 * @description:
 * @author: mdh
 * @create: 2022-01-18 17:21
 **/

@Repository
public class VideoMapper {

    private static Map<Integer, Video> videoMap = new HashMap<>();

    static {
        videoMap.put(1, new Video(1,"sda",new Date()));
        videoMap.put(2, new Video(2,"dwdw",new Date()));
        videoMap.put(3, new Video(3,"wdqwd",new Date()));
        videoMap.put(4, new Video(4,"asdasd",new Date()));
        videoMap.put(5, new Video(5,"ewqedq",new Date()));
    }

    public List<Video> getList(){
         List<Video> list = new ArrayList<>();
         list.addAll(videoMap.values());
         return list;
    }

}
