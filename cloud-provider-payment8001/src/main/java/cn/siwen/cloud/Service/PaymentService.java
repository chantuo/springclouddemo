package cn.siwen.cloud.Service;

import cn.siwen.cloud.entity.Payment;

/**
 * @author gx
 * @create 2020-11-04 10:42
 */

public interface PaymentService {
    Integer addPayment(Payment payment);
    Payment selectPayment(Integer id);
    Integer deletePayment(Integer id);
    Integer updatePayment(Payment payment);
}
