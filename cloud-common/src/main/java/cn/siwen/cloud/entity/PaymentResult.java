package cn.siwen.cloud.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author gx
 * @create 2020-11-02 11:19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentResult <T>{
    private  Integer code;
    private  String messges;
    private  T Data;

    public PaymentResult(Integer code, String messges) {
        this(code,messges,null);
    }
}
