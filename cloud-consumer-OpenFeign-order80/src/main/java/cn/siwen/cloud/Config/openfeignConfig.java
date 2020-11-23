package cn.siwen.cloud.Config;

import cn.siwen.cloud.entity.PaymentResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author gx
 * @create 2020-11-12 11:06
 */
@Component
@FeignClient(value = "payment")
public interface openfeignConfig {
    @GetMapping("/select/{id}")
     PaymentResult getPaymentById(@PathVariable("id") long id);

}
