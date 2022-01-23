package net.xdclass.demoproject.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时统计订单
 */
@Component
public class VideoOrderTask {

    //每2秒执行一次
   @Scheduled(fixedRate = 2000)
   public void sum(){

//       System.out.println(LocalDateTime.now()+"当前交易员="+new Random().ints(100,10000));


   }

}
