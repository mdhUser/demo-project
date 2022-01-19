package net.xdclass.demoproject.controller;

import net.xdclass.demoproject.domain.Video;
import net.xdclass.demoproject.service.VideoService;
import net.xdclass.demoproject.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: demo-project
 * @description: 视频控制器
 * @author: mdh
 * @create: 2022-01-18 00:03
 **/

@RestController
@RequestMapping("/api/v1/pub/video")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public JsonData list(){
       return videoService.getListVideo();
    }

    @PostMapping("/saveVideoChapter")
    public JsonData saveVideo(@RequestBody Video video){

            return JsonData.buildSuccess("");
    }


}
