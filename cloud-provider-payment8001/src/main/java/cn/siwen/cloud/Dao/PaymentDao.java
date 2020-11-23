package cn.siwen.cloud.Dao;

import cn.siwen.cloud.entity.Payment;
import cn.siwen.cloud.entity.PaymentResult;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author gx
 * @create 2020-11-02 11:07
 */
@Mapper
public interface PaymentDao {
     Integer addPayment(Payment payment);
     Payment selectPayment(Integer id);
     Integer deletePayment(Integer id);
     Integer updatePayment(Payment payment);
}
