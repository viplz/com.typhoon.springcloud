package com.typhoon.springcloud.controller;

import com.typhoon.springcloud.entity.Payment;
import com.typhoon.springcloud.entity.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author lian-zhang
 * @version 1.0
 * @ClassName OrderController.java
 * @Description TODO
 * @createTime 2021年10月01日 15:21:42
 */
@RestController
@Slf4j
public class OrderController {

    public static final String PAYMENT_URL = "http://localhost:8001";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public ResponseResult<Payment> create(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, ResponseResult.class);
    }

    @GetMapping("consumer/payment/get/{id}")
    public ResponseResult<Payment> getPayment(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/"+id, ResponseResult.class);
    }

}
