package cn.siwen.cloud.Controller;

import cn.siwen.cloud.Service.impl.PaymentServiceimpl;
import cn.siwen.cloud.entity.Payment;
import cn.siwen.cloud.entity.PaymentResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author gx
 * @create 2020-11-04 10:47
 */
@RestController
public class PaymentController {
    @Resource
    PaymentServiceimpl paymentServiceimpl;
    @Value("${server.port}")
    String port;
    @GetMapping("/select/{id}")
    public  PaymentResult select(@PathVariable Integer id){
       Payment payment=paymentServiceimpl.selectPayment(id);
       if(payment!=null){
           return new PaymentResult(200,"succes","端口号:"+port);
       }else{
           return new PaymentResult(888,"error");
       }
    }

    @PostMapping("/inset")
    public  PaymentResult insert(@RequestBody Payment payment){
        int pay=paymentServiceimpl.addPayment(payment);
        if(pay!=0){
            return new PaymentResult(200,"succes",payment);
        }else{
            return new PaymentResult(888,"error");
        }
    }

}
