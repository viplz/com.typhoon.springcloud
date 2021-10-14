package com.typhoon.springcloud.service.impl;

import com.typhoon.springcloud.dao.PaymentDao;
import com.typhoon.springcloud.entity.Payment;
import com.typhoon.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lian-zhang
 * @version 1.0
 * @ClassName PaymentServiceImpl.java
 * @Description 支付接口service层实现类
 * @createTime 2021年09月30日 22:23:15
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
