package cn.siwen.cloud.Controller;

import cn.siwen.cloud.entity.Payment;
import cn.siwen.cloud.entity.PaymentResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author gx
 * @create 2020-11-04 11:16
 */
@RestController
public class ConsumerController {
    private final static String PAYMENT_URL = "http://payment";
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumerselect/{id}")
    public PaymentResult select(@PathVariable Integer id) {
        return restTemplate.getForObject(PAYMENT_URL+"/select/{id}", PaymentResult.class, id);
    }

    @GetMapping("/consumerinsert")
    public PaymentResult insert(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL+"/inset",payment,PaymentResult.class);
    }
}
