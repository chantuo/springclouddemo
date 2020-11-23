package cn.siwen.cloud.Config;

import cn.siwen.cloud.entity.Payment;
import cn.siwen.cloud.entity.PaymentResult;

/**
 * @author gx
 * @create 2020-11-12 11:13
 */
public class openfeignconfigService implements openfeignConfig {
    public PaymentResult getPaymentById(long id) {
        return new PaymentResult(404, "OpenFeign兜底方法", new Payment(id, "errorserial"));
    }
}
