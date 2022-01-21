package net.xdclass.demoproject.controller;

import net.xdclass.demoproject.utils.JsonData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo-project
 * @description: 下单
 * @author: mdh
 * @create: 2022-01-20 19:57
 **/
@RestController
@RequestMapping("/api/v1/pri/order")
public class VideoOrderController {


    @GetMapping("/saveOrder")
    public JsonData saveOrder(){

        return JsonData.buildSuccess("下单成功！");
    }


}
