package cn.siwen.Service;

import cn.siwen.Service.impl.hystrixServiceImpl;
import cn.siwen.cloud.entity.PaymentResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author gx
 * @create 2020-11-20 16:59
 */
@Service
@FeignClient(value = "payment",fallback = hystrixServiceImpl.class)
public interface HystrixService {
    @GetMapping("/select/{id}")
    String getPaymentById(@PathVariable("id") long id);
    @GetMapping("/payment/select/{id}")
    String getPayment(@PathVariable("id") long id);
}
