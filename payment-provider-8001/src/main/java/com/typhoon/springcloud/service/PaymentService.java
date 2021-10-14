package com.typhoon.springcloud.service;

import com.typhoon.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author lian-zhang
 * @version 1.0
 * @ClassName PaymentService.java
 * @Description 支付Service层接口
 * @createTime 2021年09月30日 22:22:01
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
