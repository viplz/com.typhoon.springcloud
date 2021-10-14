package com.typhoon.springcloud.controller;

import com.typhoon.springcloud.entity.Payment;
import com.typhoon.springcloud.entity.ResponseResult;
import com.typhoon.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author lian-zhang
 * @version 1.0
 * @ClassName PaymentController.java
 * @Description 支付接口
 * @createTime 2021年09月30日 22:26:43
 */

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public ResponseResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("*******插入结果："+result);
        if (result > 0) {
            return new ResponseResult(200, "支付成功！", result);
        }
        return new ResponseResult(444, "支付失败！");
    }

    @GetMapping(value = "/payment/get/{id}")
    public ResponseResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("*******查询结果："+payment+"O(∩_∩)O哈哈~");
        if (payment != null) {
            return new ResponseResult(200, "查询成功！", payment);
        }
        return new ResponseResult(444, "查询id："+id+" 无记录！");
    }

}
