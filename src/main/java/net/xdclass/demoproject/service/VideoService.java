package net.xdclass.demoproject.service;

import net.xdclass.demoproject.domain.Video;
import net.xdclass.demoproject.utils.JsonData;

import java.util.List;

/**
 * @program: demo-project
 * @description: 视频接口
 * @author: mdh
 * @create: 2022-01-18 17:18
 **/
public interface VideoService {

    public JsonData getListVideo();
}
