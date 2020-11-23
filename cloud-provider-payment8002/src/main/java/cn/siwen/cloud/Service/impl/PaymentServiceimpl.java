package cn.siwen.cloud.Service.impl;


import cn.siwen.cloud.Dao.PaymentDao;
import cn.siwen.cloud.Service.PaymentService;
import cn.siwen.cloud.entity.Payment;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author gx
 * @create 2020-11-04 10:44
 */
@Service
public class PaymentServiceimpl  implements PaymentService {
    @Resource
    PaymentDao paymentDao;
    @Override
    public Integer addPayment(Payment payment) {
        return paymentDao.addPayment(payment);
    }

    @Override
    public Payment selectPayment(Integer id) {
        return paymentDao.selectPayment(id);
    }

    @Override
    public Integer deletePayment(Integer id) {
        return paymentDao.deletePayment(id);
    }

    @Override
    public Integer updatePayment(Payment payment) {
        return paymentDao.updatePayment(payment);
    }
}
