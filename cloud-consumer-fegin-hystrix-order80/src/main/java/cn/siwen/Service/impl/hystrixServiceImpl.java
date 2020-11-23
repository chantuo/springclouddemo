package cn.siwen.Service.impl;

import cn.siwen.Service.HystrixService;
import cn.siwen.cloud.entity.PaymentResult;
import org.springframework.stereotype.Component;

/**
 * @author gx
 * @create 2020-11-20 17:01
 */
@Component
public class hystrixServiceImpl implements HystrixService {
    @Override
    public String getPaymentById(long id) {
        return "byid 服务降级";
    }

    @Override
    public String getPayment(long id) {
        return "payment服务降级";
    }
}
