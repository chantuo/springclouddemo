package cn.siwen.cloud.controller;

import cn.siwen.cloud.Config.openfeignConfig;
import cn.siwen.cloud.entity.Payment;
import cn.siwen.cloud.entity.PaymentResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author gx
 * @create 2020-11-12 11:06
 */
@RestController
public class OpenFeign80controller {
    @Autowired
    private openfeignConfig openfeignConfig;
    @GetMapping("/select/{id}")
    public PaymentResult<Payment> select(@PathVariable long id){
        return openfeignConfig.getPaymentById(id);
    }

}
