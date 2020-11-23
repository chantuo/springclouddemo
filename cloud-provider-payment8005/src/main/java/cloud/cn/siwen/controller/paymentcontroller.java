package cloud.cn.siwen.controller;

import cloud.cn.siwen.Service.paymentService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gx
 * @create 2020-11-19 10:55
 */
@RestController
@Log4j2
/*
@DefaultProperties(defaultFallback = "payment_global_fallback_method")
*/
public class paymentcontroller {
    @Autowired
    paymentService paymentService;

    @GetMapping("/payment/select/{id}")
    @HystrixCommand //使用全局服务降级方法
    public String paymentInfo_OK(@PathVariable Integer id){
        return paymentService.paymentCircuitBreaker(id);
    }
    @GetMapping("/select/{id}")
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1500")
    })
    public String paymentInfo_timeOut(@PathVariable Integer id){
        int timeNmber=3000;
        try {
            Thread.sleep(timeNmber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池"+Thread.currentThread().getName()+"id"+id+"成功"+"延迟了"+timeNmber;
    }

    public  String paymentInfo_TimeOutHandler(@PathVariable Integer id){
        return "线程池"+Thread.currentThread().getName()+"id"+id+"出错";
    }
    public  String payment_global_fallback_method(){
        return "我是全局服务降级方法";
    }
}
