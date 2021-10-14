package com.typhoon.springcloud.dao;

import com.typhoon.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author lian-zhang
 * @version 1.0
 * @ClassName PaymentDao.java
 * @Description 支付dao层接口
 * @createTime 2021年09月30日 22:00:46
 */

@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
