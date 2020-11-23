package cloud.cn.siwen.Service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author gx
 * @create 2020-11-20 17:16
 */
@Service
public class paymentService {
    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "20"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value ="10000" ),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"),
    })
    public String paymentCircuitBreaker(@PathVariable Integer id){
        if(id<0){
            throw new RuntimeException("**************id不能为负数");
        }
        String serialNunber= IdUtil.simpleUUID();
        return Thread.currentThread().getName()+"调用成功id为"+serialNunber;
    }
    public String paymentCircuitBreaker_fallback(@PathVariable Integer id){
        return "id不能为负数";
    }
}
