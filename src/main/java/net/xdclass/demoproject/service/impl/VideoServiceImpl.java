package net.xdclass.demoproject.service.impl;

import net.xdclass.demoproject.domain.Video;
import net.xdclass.demoproject.mapper.VideoMapper;
import net.xdclass.demoproject.service.VideoService;
import net.xdclass.demoproject.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: demo-project
 * @description: video实现类
 * @author: mdh
 * @create: 2022-01-18 19:23
 **/
@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoMapper videoMapper;

    public JsonData getListVideo() {
        List<Video> list = videoMapper.getList();
        return JsonData.buildSuccess(list);
    }

}
